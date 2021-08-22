//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE bindingPattern (BLOCK (ALT (BLOCK (ALT arrayLiteral) (ALT objectLiteral)))))
 * </pre>
 *
 * <pre>
 * bindingPattern
 *     : (arrayLiteral | objectLiteral)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:35-47
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#bindingPattern()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.BindingPatternMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("BindingPattern")
public interface BindingPattern extends TypeScriptGen {

    @Relation("HAS_ARRAY_LITERAL")
    ArrayLiteral getArrayLiteral();

    void setArrayLiteral(ArrayLiteral setArrayLiteral);

    @Relation("HAS_OBJECT_LITERAL")
    ObjectLiteral getObjectLiteral();

    void setObjectLiteral(ObjectLiteral setObjectLiteral);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
