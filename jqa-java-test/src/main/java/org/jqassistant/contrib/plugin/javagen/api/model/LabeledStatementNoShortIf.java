//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE labeledStatementNoShortIf (BLOCK (ALT Identifier ':' statementNoShortIf)))
 * </pre>
 *
 * <pre>
 * labeledStatementNoShortIf
 * 	:	Identifier ':' statementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2312-2322
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#labeledStatementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LabeledStatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("LabeledStatementNoShortIf")
public interface LabeledStatementNoShortIf extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: ':'
    @Relation("HAS_STATEMENT_NO_SHORT_IF")
    StatementNoShortIf getStatementNoShortIf();

    void setStatementNoShortIf(StatementNoShortIf statementNoShortIf);
}
