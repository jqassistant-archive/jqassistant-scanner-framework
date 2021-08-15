import com.buschmais.jqassistant.core.shared.io.ClasspathResource;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Lexer;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.util.mapper.MainMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class MapperTest {

    @Test()
    public void initMapperTest() throws IOException {
        File testFile = new File(ClasspathResource.getFile(MapperTest.class, "/"), "/helloworld.java");

        final Java8Lexer lexer = new Java8Lexer(CharStreams.fromPath(testFile.getAbsoluteFile().toPath()));
        final CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        final Java8Parser parser = new Java8Parser(tokenStream);

        Java8Parser.CompilationUnitContext compilationUnitContext = parser.compilationUnit();
        Assertions.assertThrows(NullPointerException.class, () -> {
            MainMapper.INSTANCE.map(null, compilationUnitContext);
        });
    }
}
