import com.buschmais.jqassistant.core.rule.api.model.RuleException;
import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class TypeScriptGenScannerPluginTestIT extends AbstractPluginIT {

//    static String file = "/big.ts";
//    static String file = "/AbstractClass.ts";
    static String file = "/Module.ts";

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanTypeScriptGenFile() {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), file);

        Descriptor descriptor = getScanner().scan(testFile, file, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(TypeScriptGenFileDescriptor.class);

        store.commitTransaction();
    }

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanAsset() throws RuleException {
        store.beginTransaction();

        File f1 = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), "/asset.component.ts");
        getScanner().scan(f1, "/asset.component.ts", DefaultScope.NONE);

        File f2 = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), "/asset.ts");
        getScanner().scan(f2, "/asset.ts", DefaultScope.NONE);

        File f3 = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), "/blockchain.ts");
        getScanner().scan(f3, "/blockchain.ts", DefaultScope.NONE);

        File f4 = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), "/select-item.ts");
        getScanner().scan(f4, "/select-item.ts", DefaultScope.NONE);

        store.commitTransaction();

        executeGroup("typescript");
        executeGroup("debug");
    }
}
