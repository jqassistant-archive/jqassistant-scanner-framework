package org.jqassistant.contrib.plugin.javagen.impl.scanner;

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
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Lexer;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenFileDescriptor;
import org.jqassistant.contrib.plugin.javagen.api.model.CompilationUnit;
import org.jqassistant.contrib.plugin.javagen.api.scanner.JavaGenScope;
import org.jqassistant.contrib.plugin.javagen.util.mapper.CompilationUnitMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Requires(FileDescriptor.class)
public class JavaGenFileScannerPlugin extends AbstractScannerPlugin<FileResource, JavaGen> {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaGenFileScannerPlugin.class);

    @Override
    public boolean accepts(FileResource item, String path, Scope scope) {
        return path.toLowerCase().endsWith(JavaGenScope.FILE_EXTENSION);
    }

    @Override
    public JavaGenFileDescriptor scan(FileResource item, String path, Scope scope, Scanner scanner) throws IOException {
        LOGGER.info(new Date() + " - Running JavaGenFileScannerPlugin");

        final ScannerContext scannerContext = scanner.getContext();
        Store store = scannerContext.getStore();
        JavaGenFileDescriptor fileDescriptor = store.addDescriptorType(scannerContext.getCurrentDescriptor(), JavaGenFileDescriptor.class);

        final InputStream inputStream = item.createStream();
        final Java8Lexer lexer = new Java8Lexer(CharStreams.fromStream(inputStream));
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final Java8Parser parser = new Java8Parser(tokenStream);

        LOGGER.info(new Date() + " - getting CompilationUnitContext");
        Java8Parser.CompilationUnitContext compilationUnitContext = parser.compilationUnit(); //TODO: find root node and how it was determined

        LOGGER.info(new Date() + " - Starting Mapper for compilationUnitContext");

        CompilationUnit compilationUnit = CompilationUnitMapper.INSTANCE.map(scannerContext, compilationUnitContext);
        fileDescriptor.setCompilationUnit(compilationUnit);

//        LOGGER.info(new Date() + " - Starting Walker");
//        ParseTreeWalker.DEFAULT.walk(new Java8SourceWalker(scannerContext), compilationUnitContext);

        LOGGER.info(new Date() + " - Done");
        return fileDescriptor;
    }
}
