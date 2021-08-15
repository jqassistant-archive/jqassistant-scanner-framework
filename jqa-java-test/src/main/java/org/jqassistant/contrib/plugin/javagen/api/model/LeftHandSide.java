//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE leftHandSide (BLOCK (ALT expressionName) (ALT fieldAccess) (ALT arrayAccess)))
 * </pre>
 *
 * <pre>
 * leftHandSide
 * 	:	expressionName
 * 	|	fieldAccess
 * 	|	arrayAccess
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4335-4349
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#leftHandSide()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.LeftHandSideMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("LeftHandSide")
public interface LeftHandSide extends JavaGen {

    @Relation("HAS_EXPRESSION_NAME")
    ExpressionName getExpressionName();

    void setExpressionName(ExpressionName expressionName);

    @Relation("HAS_FIELD_ACCESS")
    FieldAccess getFieldAccess();

    void setFieldAccess(FieldAccess fieldAccess);

    @Relation("HAS_ARRAY_ACCESS")
    ArrayAccess getArrayAccess();

    void setArrayAccess(ArrayAccess arrayAccess);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
