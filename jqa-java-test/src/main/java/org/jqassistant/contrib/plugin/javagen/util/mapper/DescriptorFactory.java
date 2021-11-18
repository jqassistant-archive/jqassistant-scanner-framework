//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.JavaGenAST;
import javax.annotation.Generated;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;
import org.mapstruct.TargetType;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
public class DescriptorFactory {

    public static <T extends JavaGenAST> T createDescriptor(@Context() ScannerContext scannerContext, @TargetType() Class<T> entityClass) {
        return scannerContext.getStore().create(entityClass);
    }
}
