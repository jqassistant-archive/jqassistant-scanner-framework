//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.jqassistant.contrib.plugin.javagen.api.model.ElementValue;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.annotation.Generated;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface ElementValueMapper {

    public static ElementValueMapper INSTANCE = Mappers.getMapper(ElementValueMapper.class);

    ElementValue map(@Context() ScannerContext scannerContext, Java8Parser.ElementValueContext parserContext);
}
