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
 * (RULE dimExpr (BLOCK (ALT (* (BLOCK (ALT annotation))) '[' expression ']')))
 * </pre>
 *
 * <pre>
 * dimExpr
 * 	:	annotation* '[' expression ']'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4212-4225
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#dimExpr()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DimExprMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("DimExpr")
public interface DimExpr extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    // unhandled TerminalAST token: '['
    @Relation("HAS_EXPRESSION")
    Expression getExpression();

    void setExpression(Expression setExpression);

    // unhandled TerminalAST token: ']'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
