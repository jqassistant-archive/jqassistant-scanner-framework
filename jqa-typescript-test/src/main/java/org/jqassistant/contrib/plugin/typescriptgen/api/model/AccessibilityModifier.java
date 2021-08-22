//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE accessibilityModifier (BLOCK (ALT Public) (ALT Private) (ALT Protected)))
 * </pre>
 *
 * <pre>
 * accessibilityModifier
 *     : Public
 *     | Private
 *     | Protected
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:759-773
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#accessibilityModifier()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.AccessibilityModifierMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("AccessibilityModifier")
public interface AccessibilityModifier extends TypeScriptGen {

    @Relation("HAS_PUBLIC")
    TerminalNodeStrings getPublicDescriptor();

    void setPublic(TerminalNodeStrings setPublic);

    @Relation("HAS_PRIVATE")
    TerminalNodeStrings getPrivateDescriptor();

    void setPrivate(TerminalNodeStrings setPrivate);

    @Relation("HAS_PROTECTED")
    TerminalNodeStrings getProtectedDescriptor();

    void setProtected(TerminalNodeStrings setProtected);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
