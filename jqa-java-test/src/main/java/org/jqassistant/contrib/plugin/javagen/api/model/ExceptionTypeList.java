//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("ExceptionTypeList")
public interface ExceptionTypeList extends JavaGen {

    // unhandled TerminalAST token: ','
    // unhandled StarBlockAST: ','
    @Relation("HAS_EXCEPTION_TYPE")
    List<ExceptionType> getExceptionTypes();

    void setExceptionTypes(List<ExceptionType> setExceptionTypes);
}
