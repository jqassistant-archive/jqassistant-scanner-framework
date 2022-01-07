//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.util.mapper;

import org.mapstruct.*;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import org.antlr.v4.runtime.ParserRuleContext;
import javax.annotation.Generated;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@MapperConfig(uses = DescriptorFactory.class, unmappedTargetPolicy = ReportingPolicy.ERROR, nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION, mappingInheritanceStrategy = MappingInheritanceStrategy.AUTO_INHERIT_FROM_CONFIG)
public interface CommonMappingConfig {

    @Mapping(target = "fileName", ignore = true)
    @Mapping(target = "sourcePosition", ignore = true)
    @Mapping(target = "sourceCode", ignore = true)
    org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST map(@Context() FileResource item, @Context() ScannerContext scannerContext, ParserRuleContext parserContext);
}
