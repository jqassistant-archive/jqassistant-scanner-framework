//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE formalParameterList (BLOCK (ALT formalParameterArg (* (BLOCK (ALT ',' formalParameterArg))) (? (BLOCK (ALT ',' lastFormalParameterArg)))) (ALT lastFormalParameterArg) (ALT arrayLiteral) (ALT objectLiteral (? (BLOCK (ALT ':' formalParameterList))))))
 * </pre>
 *
 * <pre>
 * formalParameterList
 *     : formalParameterArg (',' formalParameterArg)* (',' lastFormalParameterArg)?
 *     | lastFormalParameterArg
 *     | arrayLiteral                              // ECMAScript 6: Parameter Context Matching
 *     | objectLiteral (':' formalParameterList)?  // ECMAScript 6: Parameter Context Matching
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2308-2351
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#formalParameterList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.FormalParameterListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("FormalParameterList")
public interface FormalParameterList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_FORMAL_PARAMETER_ARG")
    List<FormalParameterArg> getFormalParameterArg();

    void setFormalParameterArg(List<FormalParameterArg> setFormalParameterArg);

    // optional: ?
    // unhandled TerminalAST token: ','
    @Relation("HAS_LAST_FORMAL_PARAMETER_ARG")
    LastFormalParameterArg getLastFormalParameterArg();

    void setLastFormalParameterArg(LastFormalParameterArg setLastFormalParameterArg);

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    // optional: ?
    // unhandled TerminalAST token: ':'
    @Relation("HAS_FORMAL_PARAMETER_LIST")
    FormalParameterList getFormalParameterList();

    void setFormalParameterList(FormalParameterList setFormalParameterList);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
