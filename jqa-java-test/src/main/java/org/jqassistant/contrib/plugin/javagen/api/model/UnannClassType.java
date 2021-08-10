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
 * (RULE unannClassType (BLOCK (ALT Identifier (? (BLOCK (ALT typeArguments)))) (ALT unannClassOrInterfaceType '.' (* (BLOCK (ALT annotation))) Identifier (? (BLOCK (ALT typeArguments))))))
 * </pre>
 *
 * <pre>
 * unannClassType
 * 	:	Identifier typeArguments?
 * 	|	unannClassOrInterfaceType '.' annotation* Identifier typeArguments?
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1015-1038
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannClassType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannClassTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("UnannClassType")
public interface UnannClassType extends JavaGen {

    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings identifier);

    // optional: ?
    @Relation("HAS_TYPE_ARGUMENTS")
    TypeArguments getTypeArguments();

    void setTypeArguments(TypeArguments typeArguments);

    @Relation("HAS_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassOrInterfaceType getUnannClassOrInterfaceType();

    void setUnannClassOrInterfaceType(UnannClassOrInterfaceType unannClassOrInterfaceType);

    // unhandled TerminalAST token: '.'
    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);
    // optional: ?
}
