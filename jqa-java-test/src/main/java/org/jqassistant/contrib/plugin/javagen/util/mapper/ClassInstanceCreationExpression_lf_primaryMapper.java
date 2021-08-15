//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.ClassInstanceCreationExpression_lf_primary;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(config = MapperConfiguration.class)
public interface ClassInstanceCreationExpression_lf_primaryMapper {

    public static ClassInstanceCreationExpression_lf_primaryMapper INSTANCE = Mappers.getMapper(ClassInstanceCreationExpression_lf_primaryMapper.class);

    ClassInstanceCreationExpression_lf_primary map(@Context() ScannerContext scannerContext, Java8Parser.ClassInstanceCreationExpression_lf_primaryContext parserContext);
}
