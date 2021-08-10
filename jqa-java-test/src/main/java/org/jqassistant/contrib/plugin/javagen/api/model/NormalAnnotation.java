//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.contrib.plugin.javagen.api.JavaGen;

import javax.annotation.Generated;

/**
 * Generated from AST:
 * <pre>
 * (RULE normalAnnotation (BLOCK (ALT '@' typeName '(' (? (BLOCK (ALT elementValuePairList))) ')')))
 * </pre>
 *
 * <pre>
 * normalAnnotation
 * 	:	'@' typeName '(' elementValuePairList? ')'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1975-1990
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#normalAnnotation()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.NormalAnnotationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("NormalAnnotation")
public interface NormalAnnotation extends JavaGen {

    // unhandled TerminalAST token: '@'
    @Relation("HAS_TYPE_NAME")
    TypeName getTypeName();

    void setTypeName(TypeName typeName);

    // unhandled TerminalAST token: '('
    // optional: ?
    @Relation("HAS_ELEMENT_VALUE_PAIR_LIST")
    ElementValuePairList getElementValuePairList();

    void setElementValuePairList(ElementValuePairList elementValuePairList);
    // unhandled TerminalAST token: ')'
}
