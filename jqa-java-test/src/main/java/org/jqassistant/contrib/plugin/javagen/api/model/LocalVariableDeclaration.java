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
 * (RULE localVariableDeclaration (BLOCK (ALT (* (BLOCK (ALT variableModifier))) unannType variableDeclaratorList)))
 * </pre>
 *
 * <pre>
 * localVariableDeclaration
 * 	:	variableModifier* unannType variableDeclaratorList
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2175-2186
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#localVariableDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LocalVariableDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("LocalVariableDeclaration")
public interface LocalVariableDeclaration extends JavaGen {

    @Relation("HAS_VARIABLE_MODIFIER")
    List<VariableModifier> getVariableModifiers();

    void setVariableModifiers(List<VariableModifier> setVariableModifiers);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType unannType);

    @Relation("HAS_VARIABLE_DECLARATOR_LIST")
    VariableDeclaratorList getVariableDeclaratorList();

    void setVariableDeclaratorList(VariableDeclaratorList variableDeclaratorList);
}
