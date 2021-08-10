//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE interfaceMethodDeclaration (BLOCK (ALT (* (BLOCK (ALT interfaceMethodModifier))) methodHeader methodBody)))
 * </pre>
 *
 * <pre>
 * interfaceMethodDeclaration
 * 	:	interfaceMethodModifier* methodHeader methodBody
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1813-1824
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#interfaceMethodDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.InterfaceMethodDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("InterfaceMethodDeclaration")
public interface InterfaceMethodDeclaration extends JavaGen {

    @Relation("HAS_INTERFACE_METHOD_MODIFIER")
    List<InterfaceMethodModifier> getInterfaceMethodModifier();

    void setInterfaceMethodModifier(List<InterfaceMethodModifier> setInterfaceMethodModifier);

    @Relation("HAS_METHOD_HEADER")
    MethodHeader getMethodHeader();

    void setMethodHeader(MethodHeader methodHeader);

    @Relation("HAS_METHOD_BODY")
    MethodBody getMethodBody();

    void setMethodBody(MethodBody methodBody);
}
