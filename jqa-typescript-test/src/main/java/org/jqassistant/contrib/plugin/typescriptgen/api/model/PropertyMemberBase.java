//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE propertyMemberBase (BLOCK (ALT (? (BLOCK (ALT Async))) (? (BLOCK (ALT accessibilityModifier))) (? (BLOCK (ALT Static))) (? (BLOCK (ALT ReadOnly))))))
 * </pre>
 *
 * <pre>
 * propertyMemberBase
 *     : Async? accessibilityModifier? Static? ReadOnly?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2151-2167
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#propertyMemberBase()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.PropertyMemberBaseMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PropertyMemberBase")
public interface PropertyMemberBase extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_ASYNC")
    TerminalNodeStrings getAsync();

    void setAsync(TerminalNodeStrings setAsync);

    // optional: ?
    @Relation("HAS_ACCESSIBILITY_MODIFIER")
    AccessibilityModifier getAccessibilityModifier();

    void setAccessibilityModifier(AccessibilityModifier setAccessibilityModifier);

    // optional: ?
    @Relation("HAS_STATIC")
    TerminalNodeStrings getStaticDescriptor();

    void setStatic(TerminalNodeStrings setStatic);

    // optional: ?
    @Relation("HAS_READ_ONLY")
    TerminalNodeStrings getReadOnly();

    void setReadOnly(TerminalNodeStrings setReadOnly);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
