//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE abstractDeclaration (BLOCK (ALT Abstract (BLOCK (ALT Identifier callSignature) (ALT variableStatement)) eos)))
 * </pre>
 *
 * <pre>
 * abstractDeclaration
 *     : Abstract (Identifier callSignature | variableStatement) eos
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1300-1318
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#abstractDeclaration()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.AbstractDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AbstractDeclaration")
public interface AbstractDeclaration extends TypeScriptGen {

    @Relation("HAS_ABSTRACT")
    TerminalNodeStrings getAbstractDescriptor();

    void setAbstract(TerminalNodeStrings setAbstract);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_CALL_SIGNATURE")
    CallSignature getCallSignature();

    void setCallSignature(CallSignature setCallSignature);

    @Relation("HAS_VARIABLE_STATEMENT")
    VariableStatement getVariableStatement();

    void setVariableStatement(VariableStatement setVariableStatement);

    // unhandled ast: eos
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
