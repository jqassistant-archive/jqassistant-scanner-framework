import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class TypeScriptGenScannerPluginTestIT extends AbstractPluginIT {

//    static String file = "/big.ts";
    static String file = "/AbstractClass.ts";

    @Test
    @TestStore(type = TestStore.Type.REMOTE)
    public void scanTypeScriptGenFile() {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(TypeScriptGenScannerPluginTestIT.class), file);

        Descriptor descriptor = getScanner().scan(testFile, file, DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(TypeScriptGenFileDescriptor.class);

        store.commitTransaction();
    }
}
