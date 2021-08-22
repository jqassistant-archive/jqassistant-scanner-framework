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
 * (RULE constantDeclaration (BLOCK (ALT (* (BLOCK (ALT constantModifier))) unannType variableDeclaratorList ';')))
 * </pre>
 *
 * <pre>
 * constantDeclaration
 * 	:	constantModifier* unannType variableDeclaratorList ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1778-1791
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#constantDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ConstantDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstantDeclaration")
public interface ConstantDeclaration extends JavaGen {

    @Relation("HAS_CONSTANT_MODIFIER")
    List<ConstantModifier> getConstantModifier();

    void setConstantModifier(List<ConstantModifier> setConstantModifier);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    @Relation("HAS_VARIABLE_DECLARATOR_LIST")
    VariableDeclaratorList getVariableDeclaratorList();

    void setVariableDeclaratorList(VariableDeclaratorList setVariableDeclaratorList);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
