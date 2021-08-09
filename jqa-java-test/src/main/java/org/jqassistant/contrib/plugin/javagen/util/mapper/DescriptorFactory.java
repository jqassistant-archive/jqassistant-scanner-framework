//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;
import org.mapstruct.TargetType;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
public class DescriptorFactory {

    public <T extends JavaGen> T createDescriptor(@Context() ScannerContext scannerContext, @TargetType() Class<T> entityClass) {
        return scannerContext.getStore().create(entityClass);
    }
}
