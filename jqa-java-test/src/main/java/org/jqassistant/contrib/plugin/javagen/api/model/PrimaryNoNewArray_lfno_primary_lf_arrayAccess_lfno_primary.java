//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary (BLOCK (ALT EPSILON)))
 * </pre>
 *
 * <pre>
 * primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
 * 	:
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:3277-3281
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary")
public interface PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary extends JavaGen {

    // unhandled AST type: 83false
    // Avoided Token: EPSILON
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
