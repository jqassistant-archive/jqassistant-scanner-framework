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
 * (RULE fieldDeclaration (BLOCK (ALT (* (BLOCK (ALT fieldModifier))) unannType variableDeclaratorList ';')))
 * </pre>
 *
 * <pre>
 * fieldDeclaration
 * 	:	fieldModifier* unannType variableDeclaratorList ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:844-857
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#fieldDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.FieldDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FieldDeclaration")
public interface FieldDeclaration extends JavaGen {

    @Relation("HAS_FIELD_MODIFIER")
    List<FieldModifier> getFieldModifier();

    void setFieldModifier(List<FieldModifier> setFieldModifier);

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
