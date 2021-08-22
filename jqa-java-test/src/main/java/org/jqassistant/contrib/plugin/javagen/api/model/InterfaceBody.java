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
 * (RULE interfaceBody (BLOCK (ALT '{' (* (BLOCK (ALT interfaceMemberDeclaration))) '}')))
 * </pre>
 *
 * <pre>
 * interfaceBody
 * 	:	'{' interfaceMemberDeclaration* '}'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1741-1752
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceBody()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceBodyMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("InterfaceBody")
public interface InterfaceBody extends JavaGen {

    // unhandled TerminalAST token: '{'
    @Relation("HAS_INTERFACE_MEMBER_DECLARATION")
    List<InterfaceMemberDeclaration> getInterfaceMemberDeclaration();

    void setInterfaceMemberDeclaration(List<InterfaceMemberDeclaration> setInterfaceMemberDeclaration);

    // unhandled TerminalAST token: '}'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
