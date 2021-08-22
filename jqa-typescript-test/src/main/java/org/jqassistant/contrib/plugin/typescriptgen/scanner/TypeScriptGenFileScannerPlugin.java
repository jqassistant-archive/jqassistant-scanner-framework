package org.jqassistant.contrib.plugin.typescriptgen.scanner;

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
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenFileDescriptor;
import org.jqassistant.contrib.plugin.typescriptgen.api.model.Program;
import org.jqassistant.contrib.plugin.typescriptgen.util.mapper.MainMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Requires(FileDescriptor.class)
public class TypeScriptGenFileScannerPlugin extends AbstractScannerPlugin<FileResource, TypeScriptGen> {
    private static final Logger LOGGER = LoggerFactory.getLogger(TypeScriptGenFileScannerPlugin.class);

    @Override
    public boolean accepts(FileResource item, String path, Scope scope) {
        return path.toLowerCase().endsWith(".ts");
    }

    @Override
    public TypeScriptGenFileDescriptor scan(FileResource item, String path, Scope scope, Scanner scanner) throws IOException {
        LOGGER.info(new Date() + " - Running TypeScriptGenFileScannerPlugin");

        final ScannerContext scannerContext = scanner.getContext();
        Store store = scannerContext.getStore();
        TypeScriptGenFileDescriptor fileDescriptor = store.addDescriptorType(scannerContext.getCurrentDescriptor(), TypeScriptGenFileDescriptor.class);

        final InputStream inputStream = item.createStream();
        final TypeScriptLexer lexer = new TypeScriptLexer(CharStreams.fromStream(inputStream));
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final TypeScriptParser parser = new TypeScriptParser(tokenStream);

        LOGGER.info(new Date() + " - getting CompilationUnitContext");
        TypeScriptParser.ProgramContext context = parser.program(); //TODO: find root node and how it was determined

        LOGGER.info(new Date() + " - Starting Mapper for compilationUnitContext");

        Program rootDescriptor = MainMapper.INSTANCE.map(scannerContext, context);
        fileDescriptor.setProgram(rootDescriptor);

        LOGGER.info(new Date() + " - Done");
        return fileDescriptor;
    }
}
