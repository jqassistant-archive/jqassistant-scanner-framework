//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE constructSignature (BLOCK (ALT 'new' (? (BLOCK (ALT typeParameters))) '(' (? (BLOCK (ALT parameterList))) ')' (? (BLOCK (ALT typeAnnotation))))))
 * </pre>
 *
 * <pre>
 * constructSignature
 *     : 'new' typeParameters? '(' parameterList? ')' typeAnnotation?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:787-806
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#constructSignature()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ConstructSignatureMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ConstructSignature")
public interface ConstructSignature extends TypeScriptGen {

    // unhandled TerminalAST token: 'new'
    // optional: ?
    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_PARAMETER_LIST")
    ParameterList getParameterList();

    void setParameterList(ParameterList setParameterList);

    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_TYPE_ANNOTATION")
    TypeAnnotation getTypeAnnotation();

    void setTypeAnnotation(TypeAnnotation setTypeAnnotation);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
