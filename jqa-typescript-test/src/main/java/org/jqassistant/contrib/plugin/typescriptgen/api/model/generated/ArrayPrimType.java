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
 * public static class ArrayPrimTypeContext extends PrimaryTypeContext {
 *
 *     public PrimaryTypeContext primaryType() {
 *         return getRuleContext(PrimaryTypeContext.class, 0);
 *     }
 *
 *     public TerminalNode OpenBracket() {
 *         return getToken(TypeScriptParser.OpenBracket, 0);
 *     }
 *
 *     public TerminalNode CloseBracket() {
 *         return getToken(TypeScriptParser.CloseBracket, 0);
 *     }
 *
 *     public ArrayPrimTypeContext(PrimaryTypeContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterArrayPrimType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitArrayPrimType(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptLexer.g4
 * @see antlr-to-jqassistant\src\main\resources\TypeScriptParser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	comments = "REQUIRES_SPECIAL_MAPPING")
@Label("ArrayPrimType")
public interface ArrayPrimType extends PrimaryType {

    @Relation("HAS_PRIMARY_TYPE")
    PrimaryType getPrimaryType();

    void setPrimaryType(PrimaryType setPrimaryType);

    @Relation("HAS_OPEN_BRACKET")
    TerminalNodeStrings getOpenBracket();

    void setOpenBracket(TerminalNodeStrings setOpenBracket);

    @Relation("HAS_CLOSE_BRACKET")
    TerminalNodeStrings getCloseBracket();

    void setCloseBracket(TerminalNodeStrings setCloseBracket);
}
