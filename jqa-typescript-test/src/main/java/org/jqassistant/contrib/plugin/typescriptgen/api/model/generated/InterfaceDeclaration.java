//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model.generated;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGenAST;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class InterfaceDeclarationContext extends ParserRuleContext {
 *
 *     public TerminalNode Interface() {
 *         return getToken(TypeScriptParser.Interface, 0);
 *     }
 *
 *     public TerminalNode Identifier() {
 *         return getToken(TypeScriptParser.Identifier, 0);
 *     }
 *
 *     public ObjectTypeContext objectType() {
 *         return getRuleContext(ObjectTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode Export() {
 *         return getToken(TypeScriptParser.Export, 0);
 *     }
 *
 *     public TerminalNode Declare() {
 *         return getToken(TypeScriptParser.Declare, 0);
 *     }
 *
 *     public TypeParametersContext typeParameters() {
 *         return getRuleContext(TypeParametersContext.class, 0);
 *     }
 *
 *     public InterfaceExtendsClauseContext interfaceExtendsClause() {
 *         return getRuleContext(InterfaceExtendsClauseContext.class, 0);
 *     }
 *
 *     public TerminalNode SemiColon() {
 *         return getToken(TypeScriptParser.SemiColon, 0);
 *     }
 *
 *     public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_interfaceDeclaration;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterInterfaceDeclaration(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitInterfaceDeclaration(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceDeclaration")
public interface InterfaceDeclaration extends TypeScriptGenAST {

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getInterface();

    void setInterface(TerminalNodeStrings setInterface);

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    @Relation("HAS_OBJECT_TYPE")
    ObjectType getObjectType();

    void setObjectType(ObjectType setObjectType);

    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    @Relation("HAS_DECLARE")
    TerminalNodeStrings getDeclare();

    void setDeclare(TerminalNodeStrings setDeclare);

    @Relation("HAS_TYPE_PARAMETERS")
    TypeParameters getTypeParameters();

    void setTypeParameters(TypeParameters setTypeParameters);

    @Relation("HAS_INTERFACE_EXTENDS_CLAUSE")
    InterfaceExtendsClause getInterfaceExtendsClause();

    void setInterfaceExtendsClause(InterfaceExtendsClause setInterfaceExtendsClause);

    @Relation("HAS_SEMI_COLON")
    TerminalNodeStrings getSemiColon();

    void setSemiColon(TerminalNodeStrings setSemiColon);
}
