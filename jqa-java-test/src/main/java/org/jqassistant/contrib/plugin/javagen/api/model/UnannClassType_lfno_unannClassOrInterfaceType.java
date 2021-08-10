//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannClassType_lfno_unannClassOrInterfaceType (BLOCK (ALT Identifier (? (BLOCK (ALT typeArguments))))))
 * </pre>
 *
 * <pre>
 * unannClassType_lfno_unannClassOrInterfaceType
 * 	:	Identifier typeArguments?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1056-1065
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannClassType_lfno_unannClassOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannClassType_lfno_unannClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("UnannClassType_lfno_unannClassOrInterfaceType")
public interface UnannClassType_lfno_unannClassOrInterfaceType extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);
}
