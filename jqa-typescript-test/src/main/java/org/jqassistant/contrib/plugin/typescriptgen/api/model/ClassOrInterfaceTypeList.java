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
 * (RULE classOrInterfaceTypeList (BLOCK (ALT typeReference (* (BLOCK (ALT ',' typeReference))))))
 * </pre>
 *
 * <pre>
 * classOrInterfaceTypeList
 *     : typeReference (',' typeReference)*
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:935-948
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classOrInterfaceTypeList()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassOrInterfaceTypeListMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassOrInterfaceTypeList")
public interface ClassOrInterfaceTypeList extends TypeScriptGen {

    // unhandled TerminalAST token: ','
    @Relation("HAS_TYPE_REFERENCE")
    List<TypeReference> getTypeReference();

    void setTypeReference(List<TypeReference> setTypeReference);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
