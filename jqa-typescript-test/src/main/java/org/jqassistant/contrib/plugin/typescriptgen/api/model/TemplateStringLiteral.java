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
 * (RULE templateStringLiteral (BLOCK (ALT BackTick (* (BLOCK (ALT templateStringAtom))) BackTick)))
 * </pre>
 *
 * <pre>
 * templateStringLiteral
 *     : BackTick templateStringAtom* BackTick
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:3470-3481
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#templateStringLiteral()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.TemplateStringLiteralMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TemplateStringLiteral")
public interface TemplateStringLiteral extends TypeScriptGen {

    @Relation("HAS_BACK_TICK")
    List<TerminalNodeStrings> getBackTick();

    void setBackTick(List<TerminalNodeStrings> setBackTick);

    @Relation("HAS_TEMPLATE_STRING_ATOM")
    List<TemplateStringAtom> getTemplateStringAtom();

    void setTemplateStringAtom(List<TemplateStringAtom> setTemplateStringAtom);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
