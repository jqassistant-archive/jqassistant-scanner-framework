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
 * (RULE classTail (BLOCK (ALT '{' (* (BLOCK (ALT classElement))) '}')))
 * </pre>
 *
 * <pre>
 * classTail
 *     :  '{' classElement* '}'
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2017-2028
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classTail()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassTailMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassTail")
public interface ClassTail extends TypeScriptGen {

    // unhandled TerminalAST token: '{'
    @Relation("HAS_CLASS_ELEMENT")
    List<ClassElement> getClassElement();

    void setClassElement(List<ClassElement> setClassElement);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
