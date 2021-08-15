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
 * (RULE primary (BLOCK (ALT (BLOCK (ALT primaryNoNewArray_lfno_primary) (ALT arrayCreationExpression)) (* (BLOCK (ALT primaryNoNewArray_lf_primary))))))
 * </pre>
 *
 * <pre>
 * primary
 * 	:	(	primaryNoNewArray_lfno_primary
 * 		|	arrayCreationExpression
 * 		)
 * 		(	primaryNoNewArray_lf_primary
 * 		)*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2974-2995
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("Primary")
public interface Primary extends JavaGen {

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LFNO_PRIMARY")
    PrimaryNoNewArray_lfno_primary getPrimaryNoNewArray_lfno_primary();

    void setPrimaryNoNewArray_lfno_primary(PrimaryNoNewArray_lfno_primary primaryNoNewArray_lfno_primary);

    @Relation("HAS_ARRAY_CREATION_EXPRESSION")
    ArrayCreationExpression getArrayCreationExpression();

    void setArrayCreationExpression(ArrayCreationExpression arrayCreationExpression);

    @Relation("HAS_PRIMARY_NO_NEW_ARRAY_LF_PRIMARY")
    List<PrimaryNoNewArray_lf_primary> getPrimaryNoNewArray_lf_primary();

    void setPrimaryNoNewArray_lf_primary(List<PrimaryNoNewArray_lf_primary> setPrimaryNoNewArray_lf_primary);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
