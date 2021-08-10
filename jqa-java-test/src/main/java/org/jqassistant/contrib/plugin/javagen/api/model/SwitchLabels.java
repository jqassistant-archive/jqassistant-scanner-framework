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
 * (RULE switchLabels (BLOCK (ALT switchLabel (* (BLOCK (ALT switchLabel))))))
 * </pre>
 *
 * <pre>
 * switchLabels
 * 	:	switchLabel switchLabel*
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:2488-2497
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#switchLabels()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.SwitchLabelsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("SwitchLabels")
public interface SwitchLabels extends JavaGen {

    @Relation("HAS_SWITCH_LABEL")
    List<SwitchLabel> getSwitchLabel();

    void setSwitchLabel(List<SwitchLabel> setSwitchLabel);
}
