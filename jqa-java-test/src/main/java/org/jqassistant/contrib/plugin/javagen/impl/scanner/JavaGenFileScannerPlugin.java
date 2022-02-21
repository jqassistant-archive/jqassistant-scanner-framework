package org.jqassistant.contrib.plugin.javagen.impl.scanner;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.scanner.api.ScannerPlugin.Requires;
import com.buschmais.jqassistant.core.scanner.api.Scope;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.scanner.AbstractScannerPlugin;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Lexer;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenFileDescriptor;
import org.jqassistant.contrib.plugin.javagen.api.model.generated.CompilationUnit;
import org.jqassistant.contrib.plugin.javagen.api.scanner.JavaGenScope;
import org.jqassistant.contrib.plugin.javagen.util.mapper.MainMapper;

import java.io.IOException;

@Requires(FileDescriptor.class)
public class JavaGenFileScannerPlugin extends AbstractScannerPlugin<FileResource, JavaGenAST> {

    @Override
    public boolean accepts(FileResource item, String path, Scope scope) {
        return path.toLowerCase().endsWith(JavaGenScope.FILE_EXTENSION);
    }

    @Override
    public JavaGenFileDescriptor scan(FileResource item, String path, Scope scope, Scanner scanner) throws IOException {
        final ScannerContext scannerContext = scanner.getContext();
        JavaGenFileDescriptor fileDescriptor = scannerContext.getStore().addDescriptorType(scannerContext.getCurrentDescriptor(), JavaGenFileDescriptor.class);

        final Java8Lexer lexer = new Java8Lexer(CharStreams.fromStream(item.createStream()));
        final Java8Parser parser = new Java8Parser(new CommonTokenStream(lexer));

        Java8Parser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();

        CompilationUnit compilationUnit = MainMapper.INSTANCE.map(item, scannerContext, compilationUnitContext);

        fileDescriptor.setCompilationUnit(compilationUnit);
        return fileDescriptor;
    }
}
