//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.MethodInvocation_lf_primary;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface MethodInvocation_lf_primaryMapper {

    public static MethodInvocation_lf_primaryMapper INSTANCE = Mappers.getMapper(MethodInvocation_lf_primaryMapper.class);

    MethodInvocation_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.MethodInvocation_lf_primaryContext parserContext);
}
