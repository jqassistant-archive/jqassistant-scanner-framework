//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE unannInterfaceType_lfno_unannClassOrInterfaceType (BLOCK (ALT unannClassType_lfno_unannClassOrInterfaceType)))
 * </pre>
 *
 * <pre>
 * unannInterfaceType_lfno_unannClassOrInterfaceType
 * 	:	unannClassType_lfno_unannClassOrInterfaceType
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1083-1089
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannInterfaceType_lfno_unannClassOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannInterfaceType_lfno_unannClassOrInterfaceType")
public interface UnannInterfaceType_lfno_unannClassOrInterfaceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lfno_unannClassOrInterfaceType getUnannClassType_lfno_unannClassOrInterfaceType();

    void setUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceType setUnannClassType_lfno_unannClassOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
