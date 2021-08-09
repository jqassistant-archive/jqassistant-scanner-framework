//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE literal (BLOCK (ALT IntegerLiteral) (ALT FloatingPointLiteral) (ALT BooleanLiteral) (ALT CharacterLiteral) (ALT StringLiteral) (ALT NullLiteral)))
 * </pre>
 *
 * <pre>
 * literal
 * 	:	IntegerLiteral
 * 	|	FloatingPointLiteral
 * 	|	BooleanLiteral
 * 	|	CharacterLiteral
 * 	|	StringLiteral
 * 	|	NullLiteral
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:22-48
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#literal()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("Literal")
public interface Literal extends JavaGen {

    @Relation("HAS_INTEGER_LITERAL")
    TerminalNodeStrings getIntegerLiteral();

    void setIntegerLiteral(TerminalNodeStrings integerLiteral);

    @Relation("HAS_FLOATING_POINT_LITERAL")
    TerminalNodeStrings getFloatingPointLiteral();

    void setFloatingPointLiteral(TerminalNodeStrings floatingPointLiteral);

    @Relation("HAS_BOOLEAN_LITERAL")
    TerminalNodeStrings getBooleanLiteral();

    void setBooleanLiteral(TerminalNodeStrings booleanLiteral);

    @Relation("HAS_CHARACTER_LITERAL")
    TerminalNodeStrings getCharacterLiteral();

    void setCharacterLiteral(TerminalNodeStrings characterLiteral);

    @Relation("HAS_STRING_LITERAL")
    TerminalNodeStrings getStringLiteral();

    void setStringLiteral(TerminalNodeStrings stringLiteral);

    @Relation("HAS_NULL_LITERAL")
    TerminalNodeStrings getNullLiteral();

    void setNullLiteral(TerminalNodeStrings nullLiteral);
}
