//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE dimExprs (BLOCK (ALT dimExpr (* (BLOCK (ALT dimExpr))))))
 * </pre>
 *
 * <pre>
 * dimExprs
 * 	:	dimExpr dimExpr*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:4201-4210
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#dimExprs()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.DimExprsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("DimExprs")
public interface DimExprs extends JavaGen {

    @Relation("HAS_DIM_EXPR")
    List<DimExpr> getDimExpr();

    void setDimExpr(List<DimExpr> setDimExpr);
}
