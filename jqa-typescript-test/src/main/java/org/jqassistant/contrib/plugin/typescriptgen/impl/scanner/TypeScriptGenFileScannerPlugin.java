package org.jqassistant.contrib.plugin.typescriptgen.impl.scanner;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.scanner.api.ScannerPlugin.Requires;
import com.buschmais.jqassistant.core.scanner.api.Scope;
import com.buschmais.jqassistant.core.store.api.Store;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.scanner.AbstractScannerPlugin;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptLexer;
import org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenFileDescriptor;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.generated.Program;
import org.jqassistant.contrib.plugin.typescriptgen.util.mapper.MainMapper;

import java.io.IOException;

@Requires(FileDescriptor.class)
public class TypeScriptGenFileScannerPlugin extends AbstractScannerPlugin<FileResource, TypeScriptGenAST> {

    @Override
    public boolean accepts(FileResource item, String path, Scope scope) {
        return path.toLowerCase().endsWith(".ts");
    }

    @Override
    public TypeScriptGenFileDescriptor scan(FileResource item, String path, Scope scope, Scanner scanner) throws IOException {
        final ScannerContext scannerContext = scanner.getContext();
        Store store = scannerContext.getStore();
        TypeScriptGenFileDescriptor fileDescriptor = store.addDescriptorType(scannerContext.getCurrentDescriptor(), TypeScriptGenFileDescriptor.class);

        final TypeScriptLexer lexer = new TypeScriptLexer(CharStreams.fromStream(item.createStream()));
        final TypeScriptParser parser = new TypeScriptParser(new CommonTokenStream(lexer));

        TypeScriptParser.ProgramContext context = parser.program(); //TODO: find root node and how it was determined
        Program rootDescriptor = MainMapper.INSTANCE.map(item, scannerContext, context);
        fileDescriptor.setProgram(rootDescriptor);

        return fileDescriptor;
    }
}
