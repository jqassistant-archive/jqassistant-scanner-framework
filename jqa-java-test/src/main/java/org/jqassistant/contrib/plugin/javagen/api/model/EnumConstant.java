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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("EnumConstant")
public interface EnumConstant extends JavaGen {

    @Relation("HAS_ENUM_CONSTANT_MODIFIER")
    List<EnumConstantModifier> getEnumConstantModifiers();

    void setEnumConstantModifiers(List<EnumConstantModifier> setEnumConstantModifiers);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // unhandled TerminalAST token: '('
    // optional: classBody
    @Relation("HAS_CLASS_BODY")
    ClassBody getClassBody();

    void setClassBody(ClassBody classBody);
}
