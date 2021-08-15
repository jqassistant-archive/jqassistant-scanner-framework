//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.PostIncrementExpression_lf_postfixExpression;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(config = MapperConfiguration.class)
public interface PostIncrementExpression_lf_postfixExpressionMapper {

    public static PostIncrementExpression_lf_postfixExpressionMapper INSTANCE = Mappers.getMapper(PostIncrementExpression_lf_postfixExpressionMapper.class);

    PostIncrementExpression_lf_postfixExpression map(@Context() ScannerContext scannerContext, Java8Parser.PostIncrementExpression_lf_postfixExpressionContext parserContext);
}
