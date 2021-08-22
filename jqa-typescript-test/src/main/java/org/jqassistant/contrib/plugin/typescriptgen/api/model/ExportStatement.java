//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE exportStatement (BLOCK (ALT Export (? (BLOCK (ALT Default))) (BLOCK (ALT fromBlock) (ALT statement)))))
 * </pre>
 *
 * <pre>
 * exportStatement
 *     : Export Default? (fromBlock | statement)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1389-1406
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#exportStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ExportStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ExportStatement")
public interface ExportStatement extends TypeScriptGen {

    @Relation("HAS_EXPORT")
    TerminalNodeStrings getExport();

    void setExport(TerminalNodeStrings setExport);

    // optional: ?
    @Relation("HAS_DEFAULT")
    TerminalNodeStrings getDefaultDescriptor();

    void setDefault(TerminalNodeStrings setDefault);

    @Relation("HAS_FROM_BLOCK")
    FromBlock getFromBlock();

    void setFromBlock(FromBlock setFromBlock);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
