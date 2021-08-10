//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE lastFormalParameter (BLOCK (ALT (* (BLOCK (ALT variableModifier))) unannType (* (BLOCK (ALT annotation))) '...' variableDeclaratorId) (ALT formalParameter)))
 * </pre>
 *
 * <pre>
 * lastFormalParameter
 * 	:	variableModifier* unannType annotation* '...' variableDeclaratorId
 * 	|	formalParameter
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1306-1326
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#lastFormalParameter()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LastFormalParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("LastFormalParameter")
public interface LastFormalParameter extends JavaGen {

    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifier();

    void setVariableModifier(List<VariableModifier> setVariableModifier);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType unannType);

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // unhandled TerminalAST token: '...'
    @Relation("HAS_VARIABLE_DECLARATOR_ID")
    VariableDeclaratorId getVariableDeclaratorId();

    void setVariableDeclaratorId(VariableDeclaratorId variableDeclaratorId);

    @Relation("HAS_FORMAL_PARAMETER")
    FormalParameter getFormalParameter();

    void setFormalParameter(FormalParameter formalParameter);
}
