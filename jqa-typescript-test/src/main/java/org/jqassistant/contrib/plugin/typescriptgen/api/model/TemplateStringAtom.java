//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE templateStringAtom (BLOCK (ALT TemplateStringAtom) (ALT TemplateStringStartExpression singleExpression TemplateCloseBrace)))
 * </pre>
 *
 * <pre>
 * templateStringAtom
 *     : TemplateStringAtom
 *     | TemplateStringStartExpression singleExpression TemplateCloseBrace
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3483-3497
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#templateStringAtom()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TemplateStringAtomMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TemplateStringAtom")
public interface TemplateStringAtom extends TypeScriptGen {

    @Relation("HAS_TEMPLATE_STRING_ATOM")
    TerminalNodeStrings getTemplateStringAtom();

    void setTemplateStringAtom(TerminalNodeStrings setTemplateStringAtom);

    @Relation("HAS_TEMPLATE_STRING_START_EXPRESSION")
    TerminalNodeStrings getTemplateStringStartExpression();

    void setTemplateStringStartExpression(TerminalNodeStrings setTemplateStringStartExpression);

    @Relation("HAS_SINGLE_EXPRESSION")
    SingleExpression getSingleExpression();

    void setSingleExpression(SingleExpression setSingleExpression);

    @Relation("HAS_TEMPLATE_CLOSE_BRACE")
    TerminalNodeStrings getTemplateCloseBrace();

    void setTemplateCloseBrace(TerminalNodeStrings setTemplateCloseBrace);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
