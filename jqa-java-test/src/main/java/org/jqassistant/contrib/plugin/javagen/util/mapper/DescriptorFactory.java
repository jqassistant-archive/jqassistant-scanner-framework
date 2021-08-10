//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import org.mapstruct.Context;
import org.mapstruct.TargetType;

import javax.annotation.Generated;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
public class DescriptorFactory {

    public static <T extends JavaGen> T createDescriptor(@Context() ScannerContext scannerContext, @TargetType() Class<T> entityClass) {
        return scannerContext.getStore().create(entityClass);
    }
}
