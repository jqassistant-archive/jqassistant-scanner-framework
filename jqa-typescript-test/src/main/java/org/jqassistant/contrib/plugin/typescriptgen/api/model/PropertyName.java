//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE propertyName (BLOCK (ALT identifierName) (ALT StringLiteral) (ALT numericLiteral)))
 * </pre>
 *
 * <pre>
 * propertyName
 *     : identifierName
 *     | StringLiteral
 *     | numericLiteral
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2620-2634
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#propertyName()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PropertyNameMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertyName")
public interface PropertyName extends TypeScriptGen {

    @Relation("HAS_IDENTIFIER_NAME")
    IdentifierName getIdentifierName();

    void setIdentifierName(IdentifierName setIdentifierName);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_NUMERIC_LITERAL")
    NumericLiteral getNumericLiteral();

    void setNumericLiteral(NumericLiteral setNumericLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
