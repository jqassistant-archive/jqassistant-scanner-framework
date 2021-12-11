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
 * public static class TuplePrimTypeContext extends PrimaryTypeContext {
 *
 *     public TerminalNode OpenBracket() {
 *         return getToken(TypeScriptParser.OpenBracket, 0);
 *     }
 *
 *     public TupleElementTypesContext tupleElementTypes() {
 *         return getRuleContext(TupleElementTypesContext.class, 0);
 *     }
 *
 *     public TerminalNode CloseBracket() {
 *         return getToken(TypeScriptParser.CloseBracket, 0);
 *     }
 *
 *     public TuplePrimTypeContext(PrimaryTypeContext ctx) {
 *         copyFrom(ctx);
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterTuplePrimType(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitTuplePrimType(this);
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
@Label("TuplePrimType")
public interface TuplePrimType extends PrimaryType {

    @Relation("HAS_OPEN_BRACKET")
    TerminalNodeStrings getOpenBracket();

    void setOpenBracket(TerminalNodeStrings setOpenBracket);

    @Relation("HAS_TUPLE_ELEMENT_TYPES")
    TupleElementTypes getTupleElementTypes();

    void setTupleElementTypes(TupleElementTypes setTupleElementTypes);

    @Relation("HAS_CLOSE_BRACKET")
    TerminalNodeStrings getCloseBracket();

    void setCloseBracket(TerminalNodeStrings setCloseBracket);
}
