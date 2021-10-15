//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class TryWithResourcesStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode TRY() {
 *         return getToken(Java8Parser.TRY, 0);
 *     }
 *
 *     public ResourceSpecificationContext resourceSpecification() {
 *         return getRuleContext(ResourceSpecificationContext.class, 0);
 *     }
 *
 *     public BlockContext block() {
 *         return getRuleContext(BlockContext.class, 0);
 *     }
 *
 *     public CatchesContext catches() {
 *         return getRuleContext(CatchesContext.class, 0);
 *     }
 *
 *     public Finally_Context finally_() {
 *         return getRuleContext(Finally_Context.class, 0);
 *     }
 *
 *     public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_tryWithResourcesStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterTryWithResourcesStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitTryWithResourcesStatement(this);
 *     }
 * }
 * </pre>
 *
 * Source Grammar(s):
 * @see antlr-to-jqassistant\src\main\resources\Java8Lexer.g4
 * @see antlr-to-jqassistant\src\main\resources\Java8Parser.g4
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TryWithResourcesStatement")
public interface TryWithResourcesStatement extends JavaGen {

    @Relation("HAS_TRY")
    TerminalNodeStrings getTRY();

    void setTRY(TerminalNodeStrings setTRY);

    @Relation("HAS_RESOURCE_SPECIFICATION")
    ResourceSpecification getResourceSpecification();

    void setResourceSpecification(ResourceSpecification setResourceSpecification);

    @Relation("HAS_BLOCK")
    Block getBlock();

    void setBlock(Block setBlock);

    @Relation("HAS_CATCHES")
    Catches getCatches();

    void setCatches(Catches setCatches);

    @Relation("HAS_FINALLY")
    Finally_ getFinally_();

    void setFinally_(Finally_ setFinally_);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
