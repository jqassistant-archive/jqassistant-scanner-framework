//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE throws_ (BLOCK (ALT 'throws' exceptionTypeList)))
 * </pre>
 *
 * <pre>
 * throws_
 * 	:	'throws' exceptionTypeList
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1348-1356
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#throws_()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.Throws_Mapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Throws_")
public interface Throws_ extends JavaGen {

    // unhandled TerminalAST token: 'throws'
    @Relation("HAS_EXCEPTION_TYPE_LIST")
    ExceptionTypeList getExceptionTypeList();

    void setExceptionTypeList(ExceptionTypeList setExceptionTypeList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
