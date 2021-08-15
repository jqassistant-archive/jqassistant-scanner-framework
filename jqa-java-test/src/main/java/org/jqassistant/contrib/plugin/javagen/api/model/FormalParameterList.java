//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE formalParameterList (BLOCK (ALT receiverParameter) (ALT formalParameters ',' lastFormalParameter) (ALT lastFormalParameter)))
 * </pre>
 *
 * <pre>
 * formalParameterList
 * 	:	receiverParameter
 * 	|	formalParameters ',' lastFormalParameter
 * 	|	lastFormalParameter
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1235-1253
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#formalParameterList()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FormalParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameterList")
public interface FormalParameterList extends JavaGen {

    @Relation("HAS_RECEIVER_PARAMETER")
    ReceiverParameter getReceiverParameter();

    void setReceiverParameter(ReceiverParameter receiverParameter);

    @Relation("HAS_FORMAL_PARAMETERS")
    FormalParameters getFormalParameters();

    void setFormalParameters(FormalParameters formalParameters);

    // unhandled TerminalAST token: ','
    @Relation("HAS_LAST_FORMAL_PARAMETER")
    LastFormalParameter getLastFormalParameter();

    void setLastFormalParameter(LastFormalParameter lastFormalParameter);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
