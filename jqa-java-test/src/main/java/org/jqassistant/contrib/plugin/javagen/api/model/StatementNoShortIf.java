//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE statementNoShortIf (BLOCK (ALT statementWithoutTrailingSubstatement) (ALT labeledStatementNoShortIf) (ALT ifThenElseStatementNoShortIf) (ALT whileStatementNoShortIf) (ALT forStatementNoShortIf)))
 * </pre>
 *
 * <pre>
 * statementNoShortIf
 * 	:	statementWithoutTrailingSubstatement
 * 	|	labeledStatementNoShortIf
 * 	|	ifThenElseStatementNoShortIf
 * 	|	whileStatementNoShortIf
 * 	|	forStatementNoShortIf
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2216-2238
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#statementNoShortIf()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.StatementNoShortIfMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("StatementNoShortIf")
public interface StatementNoShortIf extends JavaGen {

    @Relation("HAS_STATEMENT_WITHOUT_TRAILING_SUBSTATEMENT")
    StatementWithoutTrailingSubstatement getStatementWithoutTrailingSubstatement();

    void setStatementWithoutTrailingSubstatement(StatementWithoutTrailingSubstatement statementWithoutTrailingSubstatement);

    @Relation("HAS_LABELED_STATEMENT_NO_SHORT_IF")
    LabeledStatementNoShortIf getLabeledStatementNoShortIf();

    void setLabeledStatementNoShortIf(LabeledStatementNoShortIf labeledStatementNoShortIf);

    @Relation("HAS_IF_THEN_ELSE_STATEMENT_NO_SHORT_IF")
    IfThenElseStatementNoShortIf getIfThenElseStatementNoShortIf();

    void setIfThenElseStatementNoShortIf(IfThenElseStatementNoShortIf ifThenElseStatementNoShortIf);

    @Relation("HAS_WHILE_STATEMENT_NO_SHORT_IF")
    WhileStatementNoShortIf getWhileStatementNoShortIf();

    void setWhileStatementNoShortIf(WhileStatementNoShortIf whileStatementNoShortIf);

    @Relation("HAS_FOR_STATEMENT_NO_SHORT_IF")
    ForStatementNoShortIf getForStatementNoShortIf();

    void setForStatementNoShortIf(ForStatementNoShortIf forStatementNoShortIf);
}
