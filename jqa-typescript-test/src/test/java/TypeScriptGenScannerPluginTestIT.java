import com.buschmais.jqassistant.core.rule.api.model.RuleException;
import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import com.buschmais.jqassistant.plugin.common.test.scanner.model.DependentDirectoryDescriptor;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class TypeScriptGenScannerPluginTestIT extends AbstractPluginIT {

//    static String file = "/AbstractClass.ts";
    static String file = "/Class.ts";
//    static String file = "/Example.ts";

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanTypeScriptGenFile() throws RuleException {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), file);

        Descriptor descriptor = getScanner().scan(testFile, file, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(TypeScriptGenFileDescriptor.class);

        store.commitTransaction();

        executeGroup("typescript");
        executeGroup("debug");
    }

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanProject() throws RuleException {
        store.beginTransaction();
        String projectPath = "C:\\workspace\\TypeScript-Node-Starter\\src";

        Descriptor descriptor = getScanner().scan(new File(projectPath), projectPath, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(DependentDirectoryDescriptor.class);

        store.commitTransaction();

        executeGroup("typescript");
        executeGroup("debug");
    }

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanReact() throws RuleException {
        store.beginTransaction();
        String projectPath = "C:\\workspace\\bulletproof-react\\src\\stores\\notifications.ts";

        Descriptor descriptor = getScanner().scan(new File(projectPath), projectPath, DefaultScope.NONE);

        store.commitTransaction();

        executeGroup("typescript");
        executeGroup("debug");
    }
}
