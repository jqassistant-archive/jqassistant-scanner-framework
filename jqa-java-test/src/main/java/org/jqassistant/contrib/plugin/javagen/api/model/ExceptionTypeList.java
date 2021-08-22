//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE exceptionTypeList (BLOCK (ALT exceptionType (* (BLOCK (ALT ',' exceptionType))))))
 * </pre>
 *
 * <pre>
 * exceptionTypeList
 * 	:	exceptionType (',' exceptionType)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1358-1371
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#exceptionTypeList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ExceptionTypeListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExceptionTypeList")
public interface ExceptionTypeList extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_EXCEPTION_TYPE")
    List<ExceptionType> getExceptionType();

    void setExceptionType(List<ExceptionType> setExceptionType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
