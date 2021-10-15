//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import java.util.List;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from Parser:
 * <pre>
 * public static class CompilationUnitContext extends ParserRuleContext {
 *
 *     public TerminalNode EOF() {
 *         return getToken(Java8Parser.EOF, 0);
 *     }
 *
 *     public PackageDeclarationContext packageDeclaration() {
 *         return getRuleContext(PackageDeclarationContext.class, 0);
 *     }
 *
 *     public List<ImportDeclarationContext> importDeclaration() {
 *         return getRuleContexts(ImportDeclarationContext.class);
 *     }
 *
 *     public ImportDeclarationContext importDeclaration(int i) {
 *         return getRuleContext(ImportDeclarationContext.class, i);
 *     }
 *
 *     public List<TypeDeclarationContext> typeDeclaration() {
 *         return getRuleContexts(TypeDeclarationContext.class);
 *     }
 *
 *     public TypeDeclarationContext typeDeclaration(int i) {
 *         return getRuleContext(TypeDeclarationContext.class, i);
 *     }
 *
 *     public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_compilationUnit;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).enterCompilationUnit(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof Java8ParserListener)
 *             ((Java8ParserListener) listener).exitCompilationUnit(this);
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
@Label("CompilationUnit")
public interface CompilationUnit extends JavaGen {

    @Relation("HAS_EOF")
    TerminalNodeStrings getEOF();

    void setEOF(TerminalNodeStrings setEOF);

    @Relation("HAS_PACKAGE_DECLARATION")
    PackageDeclaration getPackageDeclaration();

    void setPackageDeclaration(PackageDeclaration setPackageDeclaration);

    @Relation("HAS_IMPORT_DECLARATION")
    List<ImportDeclaration> getImportDeclaration();

    void setImportDeclaration(List<ImportDeclaration> setImportDeclaration);

    @Relation("HAS_TYPE_DECLARATION")
    List<TypeDeclaration> getTypeDeclaration();

    void setTypeDeclaration(List<TypeDeclaration> setTypeDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
