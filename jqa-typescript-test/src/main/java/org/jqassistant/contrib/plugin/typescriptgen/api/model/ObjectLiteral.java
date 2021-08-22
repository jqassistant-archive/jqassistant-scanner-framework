//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE objectLiteral (BLOCK (ALT '{' (? (BLOCK (ALT propertyAssignment (* (BLOCK (ALT ',' propertyAssignment)))))) (? (BLOCK (ALT ','))) '}')))
 * </pre>
 *
 * <pre>
 * objectLiteral
 *     : '{' (propertyAssignment (',' propertyAssignment)*)? ','? '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2465-2488
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#objectLiteral()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ObjectLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ObjectLiteral")
public interface ObjectLiteral extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    // optional: ?
    // unhandled TerminalAST token: ','
    @Relation("HAS_PROPERTY_ASSIGNMENT")
    List<PropertyAssignment> getPropertyAssignment();

    void setPropertyAssignment(List<PropertyAssignment> setPropertyAssignment);

    // optional: ?
    // unhandled TerminalAST token: ','
    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
