//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE classBody (BLOCK (ALT '{' (* (BLOCK (ALT classBodyDeclaration))) '}')))
 * </pre>
 *
 * <pre>
 * classBody
 * 	:	'{' classBodyDeclaration* '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:787-798
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassBody")
public interface ClassBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    @Relation("HAS_CLASS_BODY_DECLARATION")
    List<ClassBodyDeclaration> getClassBodyDeclaration();

    void setClassBodyDeclaration(List<ClassBodyDeclaration> setClassBodyDeclaration);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
