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
 * (RULE formalParameters (BLOCK (ALT formalParameter (* (BLOCK (ALT ',' formalParameter)))) (ALT receiverParameter (* (BLOCK (ALT ',' formalParameter))))))
 * </pre>
 *
 * <pre>
 * formalParameters
 * 	:	formalParameter (',' formalParameter)*
 * 	|	receiverParameter (',' formalParameter)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1255-1279
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#formalParameters()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FormalParametersMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameters")
public interface FormalParameters extends JavaGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_FORMAL_PARAMETER")
    List<FormalParameter> getFormalParameter();

    void setFormalParameter(List<FormalParameter> setFormalParameter);

    @Relation("HAS_RECEIVER_PARAMETER")
    ReceiverParameter getReceiverParameter();

    void setReceiverParameter(ReceiverParameter receiverParameter);

    // unhandled TerminalAST token: ','
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
