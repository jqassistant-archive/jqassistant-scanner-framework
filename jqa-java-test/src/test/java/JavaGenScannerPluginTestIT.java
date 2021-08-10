import com.buschmais.jqassistant.core.scanner.api.DefaultScope;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.plugin.common.test.AbstractPluginIT;
import org.jqassistant.contrib.plugin.javagen.api.JavaGenFileDescriptor;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;


public class JavaGenScannerPluginTestIT extends AbstractPluginIT {

    @Test
//    @TestStore(type = TestStore.Type.REMOTE)
    public void scanJavaGenFile() {
        store.beginTransaction();
        File testFile = new File(getClassesDirectory(JavaGenScannerPluginTestIT.class), "/JavaGenFileScannerPlugin.java");

        getScanner().scan(testFile, "/JavaGenFileScannerPlugin.java", DefaultScope.NONE);
        Descriptor descriptor = getScanner().scan(testFile, "/JavaGenFileScannerPlugin.java", DefaultScope.NONE);
        assertThat(descriptor).isInstanceOf(JavaGenFileDescriptor.class);

        store.commitTransaction();
    }
}
