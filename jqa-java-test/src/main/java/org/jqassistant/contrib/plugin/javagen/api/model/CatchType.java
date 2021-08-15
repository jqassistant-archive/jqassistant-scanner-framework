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
 * (RULE catchType (BLOCK (ALT unannClassType (* (BLOCK (ALT '|' classType))))))
 * </pre>
 *
 * <pre>
 * catchType
 * 	:	unannClassType ('|' classType)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2882-2895
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#catchType()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CatchTypeMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CatchType")
public interface CatchType extends JavaGen {

    @Relation("HAS_UNANN_CLASS_TYPE")
    UnannClassType getUnannClassType();

    void setUnannClassType(UnannClassType unannClassType);

    // unhandled TerminalAST token: '|'
    @Relation("HAS_CLASS_TYPE")
    List<ClassType> getClassType();

    void setClassType(List<ClassType> setClassType);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
