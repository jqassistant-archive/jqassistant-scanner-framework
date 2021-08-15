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
 * (RULE unannClassOrInterfaceType (BLOCK (ALT (BLOCK (ALT unannClassType_lfno_unannClassOrInterfaceType) (ALT unannInterfaceType_lfno_unannClassOrInterfaceType)) (* (BLOCK (ALT unannClassType_lf_unannClassOrInterfaceType) (ALT unannInterfaceType_lf_unannClassOrInterfaceType))))))
 * </pre>
 *
 * <pre>
 * unannClassOrInterfaceType
 * 	:	(	unannClassType_lfno_unannClassOrInterfaceType
 * 		|	unannInterfaceType_lfno_unannClassOrInterfaceType
 * 		)
 * 		(	unannClassType_lf_unannClassOrInterfaceType
 * 		|	unannInterfaceType_lf_unannClassOrInterfaceType
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:988-1013
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#unannClassOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.UnannClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("UnannClassOrInterfaceType")
public interface UnannClassOrInterfaceType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannClassType_lfno_unannClassOrInterfaceType getUnannClassType_lfno_unannClassOrInterfaceType();

    void setUnannClassType_lfno_unannClassOrInterfaceType(UnannClassType_lfno_unannClassOrInterfaceType unannClassType_lfno_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_INTERFACE_TYPE_LFNO_UNANN_CLASS_OR_INTERFACE_TYPE")
    UnannInterfaceType_lfno_unannClassOrInterfaceType getUnannInterfaceType_lfno_unannClassOrInterfaceType();

    void setUnannInterfaceType_lfno_unannClassOrInterfaceType(UnannInterfaceType_lfno_unannClassOrInterfaceType unannInterfaceType_lfno_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_CLASS_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    List<UnannClassType_lf_unannClassOrInterfaceType> getUnannClassType_lf_unannClassOrInterfaceType();

    void setUnannClassType_lf_unannClassOrInterfaceType(List<UnannClassType_lf_unannClassOrInterfaceType> setUnannClassType_lf_unannClassOrInterfaceType);

    @Relation("HAS_UNANN_INTERFACE_TYPE_LF_UNANN_CLASS_OR_INTERFACE_TYPE")
    List<UnannInterfaceType_lf_unannClassOrInterfaceType> getUnannInterfaceType_lf_unannClassOrInterfaceType();

    void setUnannInterfaceType_lf_unannClassOrInterfaceType(List<UnannInterfaceType_lf_unannClassOrInterfaceType> setUnannInterfaceType_lf_unannClassOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
