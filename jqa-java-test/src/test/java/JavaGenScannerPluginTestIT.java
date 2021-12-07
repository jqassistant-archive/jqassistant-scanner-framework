import com.buschmais.jqassistant.core.rule.api.model.RuleException;
import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class JavaGenScannerPluginTestIT extends AbstractPluginIT {

//    static String file = "/helloworld.java";
    static String file = "/example.java";
//    static String file = "/AllInOne7.java";
//    static String file = "/AllInOne8.java";
//    static String file = "/Vet.java";

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanJavaGenFile() throws RuleException {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), file);

        Descriptor descriptor = getScanner().scan(testFile, file, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(JavaGenFileDescriptor.class);

        store.commitTransaction();
    }

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanVet() throws RuleException {
        store.beginTransaction();

        File vet = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), "/Vet.java");
        getScanner().scan(vet, "/Vet.java", DefaultScope.NONE);

        File person = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), "/Person.java");
        getScanner().scan(person, "/Person.java", DefaultScope.NONE);

        File baseEntity = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), "/BaseEntity.java");
        getScanner().scan(baseEntity, "/BaseEntity.java", DefaultScope.NONE);

        File specialty = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), "/Specialty.java");
        getScanner().scan(specialty, "/Specialty.java", DefaultScope.NONE);

        store.commitTransaction();

        executeGroup("java");
//        executeGroup("debug");
    }

    @Test
    @TestStore(type = TestStore.Type.REMOTE, reset = false)
    public void concepts() throws RuleException {

        executeGroup("java");
//        applyConcept("java:ClassExtendsSuperclass");

    }
}
