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
 * (RULE enumConstant (BLOCK (ALT (* (BLOCK (ALT enumConstantModifier))) Identifier (? (BLOCK (ALT '(' (? (BLOCK (ALT argumentList))) ')'))) (? (BLOCK (ALT classBody))))))
 * </pre>
 *
 * <pre>
 * enumConstant
 * 	:	enumConstantModifier* Identifier ('(' argumentList? ')')? classBody?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1621-1643
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#enumConstant()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.EnumConstantMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("EnumConstant")
public interface EnumConstant extends JavaGen {

    @Relation("HAS_ENUM_CONSTANT_MODIFIER")
    List<EnumConstantModifier> getEnumConstantModifier();

    void setEnumConstantModifier(List<EnumConstantModifier> setEnumConstantModifier);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // optional: ?
    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_ARGUMENT_LIST")
    ArgumentList getArgumentList();

    void setArgumentList(ArgumentList setArgumentList);

    // unhandled TerminalAST token: ')'
    // optional: ?
    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody setClassBody);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
