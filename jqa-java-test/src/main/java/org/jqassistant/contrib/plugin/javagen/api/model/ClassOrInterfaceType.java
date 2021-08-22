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
 * (RULE classOrInterfaceType (BLOCK (ALT (BLOCK (ALT classType_lfno_classOrInterfaceType) (ALT interfaceType_lfno_classOrInterfaceType)) (* (BLOCK (ALT classType_lf_classOrInterfaceType) (ALT interfaceType_lf_classOrInterfaceType))))))
 * </pre>
 *
 * <pre>
 * classOrInterfaceType
 * 	:	(	classType_lfno_classOrInterfaceType |	interfaceType_lfno_classOrInterfaceType
 * 		)
 * 		(	classType_lf_classOrInterfaceType |	interfaceType_lf_classOrInterfaceType
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:134-159
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#classOrInterfaceType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ClassOrInterfaceTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassOrInterfaceType")
public interface ClassOrInterfaceType extends JavaGen {

    @Relation("HAS_CLASS_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    ClassType_lfno_classOrInterfaceType getClassType_lfno_classOrInterfaceType();

    void setClassType_lfno_classOrInterfaceType(ClassType_lfno_classOrInterfaceType setClassType_lfno_classOrInterfaceType);

    @Relation("HAS_INTERFACE_TYPE_LFNO_CLASS_OR_INTERFACE_TYPE")
    InterfaceType_lfno_classOrInterfaceType getInterfaceType_lfno_classOrInterfaceType();

    void setInterfaceType_lfno_classOrInterfaceType(InterfaceType_lfno_classOrInterfaceType setInterfaceType_lfno_classOrInterfaceType);

    @Relation("HAS_CLASS_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    List<ClassType_lf_classOrInterfaceType> getClassType_lf_classOrInterfaceType();

    void setClassType_lf_classOrInterfaceType(List<ClassType_lf_classOrInterfaceType> setClassType_lf_classOrInterfaceType);

    @Relation("HAS_INTERFACE_TYPE_LF_CLASS_OR_INTERFACE_TYPE")
    List<InterfaceType_lf_classOrInterfaceType> getInterfaceType_lf_classOrInterfaceType();

    void setInterfaceType_lf_classOrInterfaceType(List<InterfaceType_lf_classOrInterfaceType> setInterfaceType_lf_classOrInterfaceType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
