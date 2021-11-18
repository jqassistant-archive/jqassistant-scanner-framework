//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class ImportStatementContext extends ParserRuleContext {
 *
 *     public TerminalNode Import() {
 *         return getToken(TypeScriptParser.Import, 0);
 *     }
 *
 *     public FromBlockContext fromBlock() {
 *         return getRuleContext(FromBlockContext.class, 0);
 *     }
 *
 *     public ImportAliasDeclarationContext importAliasDeclaration() {
 *         return getRuleContext(ImportAliasDeclarationContext.class, 0);
 *     }
 *
 *     public ImportStatementContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_importStatement;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterImportStatement(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitImportStatement(this);
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
@Label("ImportStatement")
public interface ImportStatement extends TypeScriptGen {

    @Relation("HAS_IMPORT")
    TerminalNodeStrings getImport();

    void setImport(TerminalNodeStrings setImport);

    @Relation("HAS_FROM_BLOCK")
    FromBlock getFromBlock();

    void setFromBlock(FromBlock setFromBlock);

    @Relation("HAS_IMPORT_ALIAS_DECLARATION")
    ImportAliasDeclaration getImportAliasDeclaration();

    void setImportAliasDeclaration(ImportAliasDeclaration setImportAliasDeclaration);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);
}
