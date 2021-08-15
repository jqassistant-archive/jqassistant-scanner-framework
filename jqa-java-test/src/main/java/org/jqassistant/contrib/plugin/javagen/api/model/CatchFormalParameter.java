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
 * (RULE catchFormalParameter (BLOCK (ALT (* (BLOCK (ALT variableModifier))) catchType variableDeclaratorId)))
 * </pre>
 *
 * <pre>
 * catchFormalParameter
 * 	:	variableModifier* catchType variableDeclaratorId
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2869-2880
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#catchFormalParameter()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CatchFormalParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchFormalParameter")
public interface CatchFormalParameter extends JavaGen {

    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifier();

    void setVariableModifier(List<VariableModifier> setVariableModifier);

    @Relation("HAS_CATCH_TYPE")
    CatchType getCatchType();

    void setCatchType(CatchType catchType);

    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
