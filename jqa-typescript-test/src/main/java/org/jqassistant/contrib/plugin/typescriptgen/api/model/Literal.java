//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE literal (BLOCK (ALT NullLiteral) (ALT BooleanLiteral) (ALT StringLiteral) (ALT templateStringLiteral) (ALT RegularExpressionLiteral) (ALT numericLiteral)))
 * </pre>
 *
 * <pre>
 * literal
 *     : NullLiteral
 *     | BooleanLiteral
 *     | StringLiteral
 *     | templateStringLiteral
 *     | RegularExpressionLiteral
 *     | numericLiteral
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3442-3468
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#literal()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.LiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Literal")
public interface Literal extends TypeScriptGen {

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings setNullLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings setBooleanLiteral);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings setStringLiteral);

    @Relation("HAS_TEMPLATE_STRING_LITERAL")
    TemplateStringLiteral getTemplateStringLiteral();

    void setTemplateStringLiteral(TemplateStringLiteral setTemplateStringLiteral);

    @Relation("HAS_REGULAR_EXPRESSION_LITERAL")
    TerminalNodeStrings getRegularExpressionLiteral();

    void setRegularExpressionLiteral(TerminalNodeStrings setRegularExpressionLiteral);

    @Relation("HAS_NUMERIC_LITERAL")
    NumericLiteral getNumericLiteral();

    void setNumericLiteral(NumericLiteral setNumericLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
