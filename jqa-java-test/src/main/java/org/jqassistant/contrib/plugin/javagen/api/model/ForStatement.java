//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE forStatement (BLOCK (ALT basicForStatement) (ALT enhancedForStatement)))
 * </pre>
 *
 * <pre>
 * forStatement
 * 	:	basicForStatement
 * 	|	enhancedForStatement
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2585-2595
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#forStatement()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForStatement")
public interface ForStatement extends JavaGen {

    @Relation("HAS_BASIC_FOR_STATEMENT")
    BasicForStatement getBasicForStatement();

    void setBasicForStatement(BasicForStatement setBasicForStatement);

    @Relation("HAS_ENHANCED_FOR_STATEMENT")
    EnhancedForStatement getEnhancedForStatement();

    void setEnhancedForStatement(EnhancedForStatement setEnhancedForStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
