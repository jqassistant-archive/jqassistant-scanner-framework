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
 * public static class KeywordContext extends ParserRuleContext {
 *
 *     public TerminalNode Break() {
 *         return getToken(TypeScriptParser.Break, 0);
 *     }
 *
 *     public TerminalNode Do() {
 *         return getToken(TypeScriptParser.Do, 0);
 *     }
 *
 *     public TerminalNode Instanceof() {
 *         return getToken(TypeScriptParser.Instanceof, 0);
 *     }
 *
 *     public TerminalNode Typeof() {
 *         return getToken(TypeScriptParser.Typeof, 0);
 *     }
 *
 *     public TerminalNode Case() {
 *         return getToken(TypeScriptParser.Case, 0);
 *     }
 *
 *     public TerminalNode Else() {
 *         return getToken(TypeScriptParser.Else, 0);
 *     }
 *
 *     public TerminalNode New() {
 *         return getToken(TypeScriptParser.New, 0);
 *     }
 *
 *     public TerminalNode Var() {
 *         return getToken(TypeScriptParser.Var, 0);
 *     }
 *
 *     public TerminalNode Catch() {
 *         return getToken(TypeScriptParser.Catch, 0);
 *     }
 *
 *     public TerminalNode Finally() {
 *         return getToken(TypeScriptParser.Finally, 0);
 *     }
 *
 *     public TerminalNode Return() {
 *         return getToken(TypeScriptParser.Return, 0);
 *     }
 *
 *     public TerminalNode Void() {
 *         return getToken(TypeScriptParser.Void, 0);
 *     }
 *
 *     public TerminalNode Continue() {
 *         return getToken(TypeScriptParser.Continue, 0);
 *     }
 *
 *     public TerminalNode For() {
 *         return getToken(TypeScriptParser.For, 0);
 *     }
 *
 *     public TerminalNode Switch() {
 *         return getToken(TypeScriptParser.Switch, 0);
 *     }
 *
 *     public TerminalNode While() {
 *         return getToken(TypeScriptParser.While, 0);
 *     }
 *
 *     public TerminalNode Debugger() {
 *         return getToken(TypeScriptParser.Debugger, 0);
 *     }
 *
 *     public TerminalNode Function_() {
 *         return getToken(TypeScriptParser.Function_, 0);
 *     }
 *
 *     public TerminalNode This() {
 *         return getToken(TypeScriptParser.This, 0);
 *     }
 *
 *     public TerminalNode With() {
 *         return getToken(TypeScriptParser.With, 0);
 *     }
 *
 *     public TerminalNode Default() {
 *         return getToken(TypeScriptParser.Default, 0);
 *     }
 *
 *     public TerminalNode If() {
 *         return getToken(TypeScriptParser.If, 0);
 *     }
 *
 *     public TerminalNode Throw() {
 *         return getToken(TypeScriptParser.Throw, 0);
 *     }
 *
 *     public TerminalNode Delete() {
 *         return getToken(TypeScriptParser.Delete, 0);
 *     }
 *
 *     public TerminalNode In() {
 *         return getToken(TypeScriptParser.In, 0);
 *     }
 *
 *     public TerminalNode Try() {
 *         return getToken(TypeScriptParser.Try, 0);
 *     }
 *
 *     public TerminalNode ReadOnly() {
 *         return getToken(TypeScriptParser.ReadOnly, 0);
 *     }
 *
 *     public TerminalNode Async() {
 *         return getToken(TypeScriptParser.Async, 0);
 *     }
 *
 *     public TerminalNode From() {
 *         return getToken(TypeScriptParser.From, 0);
 *     }
 *
 *     public TerminalNode Class() {
 *         return getToken(TypeScriptParser.Class, 0);
 *     }
 *
 *     public TerminalNode Enum() {
 *         return getToken(TypeScriptParser.Enum, 0);
 *     }
 *
 *     public TerminalNode Extends() {
 *         return getToken(TypeScriptParser.Extends, 0);
 *     }
 *
 *     public TerminalNode Super() {
 *         return getToken(TypeScriptParser.Super, 0);
 *     }
 *
 *     public TerminalNode Const() {
 *         return getToken(TypeScriptParser.Const, 0);
 *     }
 *
 *     public TerminalNode Export() {
 *         return getToken(TypeScriptParser.Export, 0);
 *     }
 *
 *     public TerminalNode Import() {
 *         return getToken(TypeScriptParser.Import, 0);
 *     }
 *
 *     public TerminalNode Implements() {
 *         return getToken(TypeScriptParser.Implements, 0);
 *     }
 *
 *     public TerminalNode Let() {
 *         return getToken(TypeScriptParser.Let, 0);
 *     }
 *
 *     public TerminalNode Private() {
 *         return getToken(TypeScriptParser.Private, 0);
 *     }
 *
 *     public TerminalNode Public() {
 *         return getToken(TypeScriptParser.Public, 0);
 *     }
 *
 *     public TerminalNode Interface() {
 *         return getToken(TypeScriptParser.Interface, 0);
 *     }
 *
 *     public TerminalNode Package() {
 *         return getToken(TypeScriptParser.Package, 0);
 *     }
 *
 *     public TerminalNode Protected() {
 *         return getToken(TypeScriptParser.Protected, 0);
 *     }
 *
 *     public TerminalNode Static() {
 *         return getToken(TypeScriptParser.Static, 0);
 *     }
 *
 *     public TerminalNode Yield() {
 *         return getToken(TypeScriptParser.Yield, 0);
 *     }
 *
 *     public TerminalNode Get() {
 *         return getToken(TypeScriptParser.Get, 0);
 *     }
 *
 *     public TerminalNode Set() {
 *         return getToken(TypeScriptParser.Set, 0);
 *     }
 *
 *     public TerminalNode Require() {
 *         return getToken(TypeScriptParser.Require, 0);
 *     }
 *
 *     public TerminalNode TypeAlias() {
 *         return getToken(TypeScriptParser.TypeAlias, 0);
 *     }
 *
 *     public TerminalNode String() {
 *         return getToken(TypeScriptParser.String, 0);
 *     }
 *
 *     public KeywordContext(ParserRuleContext parent, int invokingState) {
 *         super(parent, invokingState);
 *     }
 *
 *     @Override
 *     public int getRuleIndex() {
 *         return RULE_keyword;
 *     }
 *
 *     @Override
 *     public void enterRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).enterKeyword(this);
 *     }
 *
 *     @Override
 *     public void exitRule(ParseTreeListener listener) {
 *         if (listener instanceof TypeScriptParserListener)
 *             ((TypeScriptParserListener) listener).exitKeyword(this);
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
@Label("Keyword")
public interface Keyword extends TypeScriptGenAST {

    @Relation("HAS_BREAK")
    TerminalNodeStrings getBreak();

    void setBreak(TerminalNodeStrings setBreak);

    @Relation("HAS_DO")
    TerminalNodeStrings getDo();

    void setDo(TerminalNodeStrings setDo);

    @Relation("HAS_INSTANCEOF")
    TerminalNodeStrings getInstanceof();

    void setInstanceof(TerminalNodeStrings setInstanceof);

    @Relation("HAS_TYPEOF")
    TerminalNodeStrings getTypeof();

    void setTypeof(TerminalNodeStrings setTypeof);

    @Relation("HAS_CASE")
    TerminalNodeStrings getCase();

    void setCase(TerminalNodeStrings setCase);

    @Relation("HAS_ELSE")
    TerminalNodeStrings getElse();

    void setElse(TerminalNodeStrings setElse);

    @Relation("HAS_NEW")
    TerminalNodeStrings getNew();

    void setNew(TerminalNodeStrings setNew);

    @Relation("HAS_VAR")
    TerminalNodeStrings getVar();

    void setVar(TerminalNodeStrings setVar);

    @Relation("HAS_CATCH")
    TerminalNodeStrings getCatch();

    void setCatch(TerminalNodeStrings setCatch);

    @Relation("HAS_FINALLY")
    TerminalNodeStrings getFinally();

    void setFinally(TerminalNodeStrings setFinally);

    @Relation("HAS_RETURN")
    TerminalNodeStrings getReturn();

    void setReturn(TerminalNodeStrings setReturn);

    @Relation("HAS_VOID")
    TerminalNodeStrings getVoid();

    void setVoid(TerminalNodeStrings setVoid);

    @Relation("HAS_CONTINUE")
    TerminalNodeStrings getContinue();

    void setContinue(TerminalNodeStrings setContinue);

    @Relation("HAS_FOR")
    TerminalNodeStrings getFor();

    void setFor(TerminalNodeStrings setFor);

    @Relation("HAS_SWITCH")
    TerminalNodeStrings getSwitch();

    void setSwitch(TerminalNodeStrings setSwitch);

    @Relation("HAS_WHILE")
    TerminalNodeStrings getWhile();

    void setWhile(TerminalNodeStrings setWhile);

    @Relation("HAS_DEBUGGER")
    TerminalNodeStrings getDebugger();

    void setDebugger(TerminalNodeStrings setDebugger);

    @Relation("HAS_FUNCTION")
    TerminalNodeStrings getFunction_();

    void setFunction_(TerminalNodeStrings setFunction_);

    @Relation("HAS_THIS")
    TerminalNodeStrings getThis();

    void setThis(TerminalNodeStrings setThis);

    @Relation("HAS_WITH")
    TerminalNodeStrings getWith();

    void setWith(TerminalNodeStrings setWith);

    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDefault();

    void setDefault(TerminalNodeStrings setDefault);

    @Relation("HAS_IF")
    TerminalNodeStrings getIf();

    void setIf(TerminalNodeStrings setIf);

    @Relation("HAS_THROW")
    TerminalNodeStrings getThrow();

    void setThrow(TerminalNodeStrings setThrow);

    @Relation("HAS_DELETE")
    TerminalNodeStrings getDelete();

    void setDelete(TerminalNodeStrings setDelete);

    @Relation("HAS_IN")
    TerminalNodeStrings getIn();

    void setIn(TerminalNodeStrings setIn);

    @Relation("HAS_TRY")
    TerminalNodeStrings getTry();

    void setTry(TerminalNodeStrings setTry);

    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    @Relation("HAS_FROM")
    TerminalNodeStrings getFrom();

    void setFrom(TerminalNodeStrings setFrom);

    @Relation("HAS_CLASS")
    TerminalNodeStrings getClazz();

    void setClazz(TerminalNodeStrings setClazz);

    @Relation("HAS_ENUM")
    TerminalNodeStrings getEnum();

    void setEnum(TerminalNodeStrings setEnum);

    @Relation("HAS_EXTENDS")
    TerminalNodeStrings getExtends();

    void setExtends(TerminalNodeStrings setExtends);

    @Relation("HAS_SUPER")
    TerminalNodeStrings getSuper();

    void setSuper(TerminalNodeStrings setSuper);

    @Relation("HAS_CONST")
    TerminalNodeStrings getConst();

    void setConst(TerminalNodeStrings setConst);

    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    @Relation("HAS_IMPORT")
    TerminalNodeStrings getImport();

    void setImport(TerminalNodeStrings setImport);

    @Relation("HAS_IMPLEMENTS")
    TerminalNodeStrings getImplements();

    void setImplements(TerminalNodeStrings setImplements);

    @Relation("HAS_LET")
    TerminalNodeStrings getLet();

    void setLet(TerminalNodeStrings setLet);

    @Relation("HAS_PRIVATE")
    TerminalNodeStrings getPrivate();

    void setPrivate(TerminalNodeStrings setPrivate);

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPublic();

    void setPublic(TerminalNodeStrings setPublic);

    @Relation("HAS_INTERFACE")
    TerminalNodeStrings getInterface();

    void setInterface(TerminalNodeStrings setInterface);

    @Relation("HAS_PACKAGE")
    TerminalNodeStrings getPackage();

    void setPackage(TerminalNodeStrings setPackage);

    @Relation("HAS_PROTECTED")
    TerminalNodeStrings getProtected();

    void setProtected(TerminalNodeStrings setProtected);

    @Relation("HAS_STATIC")
    TerminalNodeStrings getStatic();

    void setStatic(TerminalNodeStrings setStatic);

    @Relation("HAS_YIELD")
    TerminalNodeStrings getYield();

    void setYield(TerminalNodeStrings setYield);

    @Relation("HAS_GET")
    TerminalNodeStrings getGet();

    void setGet(TerminalNodeStrings setGet);

    @Relation("HAS_SET")
    TerminalNodeStrings getSet();

    void setSet(TerminalNodeStrings setSet);

    @Relation("HAS_REQUIRE")
    TerminalNodeStrings getRequire();

    void setRequire(TerminalNodeStrings setRequire);

    @Relation("HAS_TYPE_ALIAS")
    TerminalNodeStrings getTypeAlias();

    void setTypeAlias(TerminalNodeStrings setTypeAlias);

    @Relation("HAS_STRING")
    TerminalNodeStrings getString();

    void setString(TerminalNodeStrings setString);
}
