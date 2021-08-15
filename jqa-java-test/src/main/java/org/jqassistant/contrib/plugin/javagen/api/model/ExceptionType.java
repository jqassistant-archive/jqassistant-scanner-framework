//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE exceptionType (BLOCK (ALT classType) (ALT typeVariable)))
 * </pre>
 *
 * <pre>
 * exceptionType
 * 	:	classType
 * 	|	typeVariable
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1373-1383
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#exceptionType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExceptionTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExceptionType")
public interface ExceptionType extends JavaGen {

    @Relation("HAS_CLASS_TYPE")
    ClassType getClassType();

    void setClassType(ClassType classType);

    @Relation("HAS_TYPE_VARIABLE")
    TypeVariable getTypeVariable();

    void setTypeVariable(TypeVariable typeVariable);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
