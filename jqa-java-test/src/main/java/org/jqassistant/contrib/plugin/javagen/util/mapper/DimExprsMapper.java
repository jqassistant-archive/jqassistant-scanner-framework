//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.DimExprs;
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
public interface DimExprsMapper {

    public static DimExprsMapper INSTANCE = Mappers.getMapper(DimExprsMapper.class);

    DimExprs map(@Context() ScannerContext scannerContext, Java8Parser.DimExprsContext parserContext);
}
