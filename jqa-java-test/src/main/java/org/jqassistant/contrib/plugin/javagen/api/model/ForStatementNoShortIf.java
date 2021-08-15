//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE forStatementNoShortIf (BLOCK (ALT basicForStatementNoShortIf) (ALT enhancedForStatementNoShortIf)))
 * </pre>
 *
 * <pre>
 * forStatementNoShortIf
 * 	:	basicForStatementNoShortIf
 * 	|	enhancedForStatementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2597-2607
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#forStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ForStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ForStatementNoShortIf")
public interface ForStatementNoShortIf extends JavaGen {

    @Relation("HAS_BASIC_FOR_STATEMENT_NO_SHORT_IF")
    BasicForStatementNoShortIf getBasicForStatementNoShortIf();

    void setBasicForStatementNoShortIf(BasicForStatementNoShortIf basicForStatementNoShortIf);

    @Relation("HAS_ENHANCED_FOR_STATEMENT_NO_SHORT_IF")
    EnhancedForStatementNoShortIf getEnhancedForStatementNoShortIf();

    void setEnhancedForStatementNoShortIf(EnhancedForStatementNoShortIf enhancedForStatementNoShortIf);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
