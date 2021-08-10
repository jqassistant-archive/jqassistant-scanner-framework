//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE arrayCreationExpression (BLOCK (ALT 'new' primitiveType dimExprs (? (BLOCK (ALT dims)))) (ALT 'new' classOrInterfaceType dimExprs (? (BLOCK (ALT dims)))) (ALT 'new' primitiveType dims arrayInitializer) (ALT 'new' classOrInterfaceType dims arrayInitializer)))
 * </pre>
 *
 * <pre>
 * arrayCreationExpression
 * 	:	'new' primitiveType dimExprs dims?
 * 	|	'new' classOrInterfaceType dimExprs dims?
 * 	|	'new' primitiveType dims arrayInitializer
 * 	|	'new' classOrInterfaceType dims arrayInitializer
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4155-4199
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#arrayCreationExpression()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ArrayCreationExpressionMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ArrayCreationExpression")
public interface ArrayCreationExpression extends JavaGen {

    // unhandled TerminalAST token: 'new'
    @Relation("HAS_PRIMITIVE_TYPE")
    PrimitiveType getPrimitiveType();

    void setPrimitiveType(PrimitiveType primitiveType);

    @Relation("HAS_DIM_EXPRS")
    DimExprs getDimExprs();

    void setDimExprs(DimExprs dimExprs);

    // optional: ?
    @Relation("HAS_DIMS")
    Dims getDims();

    void setDims(Dims dims);

    // unhandled TerminalAST token: 'new'
    @Relation("HAS_CLASS_OR_INTERFACE_TYPE")
    ClassOrInterfaceType getClassOrInterfaceType();

    void setClassOrInterfaceType(ClassOrInterfaceType classOrInterfaceType);

    // optional: ?
    // unhandled TerminalAST token: 'new'
    @Relation("HAS_ARRAY_INITIALIZER")
    ArrayInitializer getArrayInitializer();

    void setArrayInitializer(ArrayInitializer arrayInitializer);
    // unhandled TerminalAST token: 'new'
}
