//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE importStatement (BLOCK (ALT Import (BLOCK (ALT fromBlock) (ALT importAliasDeclaration)))))
 * </pre>
 *
 * <pre>
 * importStatement
 *     : Import (fromBlock | importAliasDeclaration)
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:1320-1334
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#importStatement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ImportStatementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ImportStatement")
public interface ImportStatement extends TypeScriptGen {

    @Relation("HAS_IMPORT")
    TerminalNodeStrings getImport();

    void setImport(TerminalNodeStrings setImport);

    @Relation("HAS_FROM_BLOCK")
    FromBlock getFromBlock();

    void setFromBlock(FromBlock setFromBlock);

    @Relation("HAS_IMPORT_ALIAS_DECLARATION")
    ImportAliasDeclaration getImportAliasDeclaration();

    void setImportAliasDeclaration(ImportAliasDeclaration setImportAliasDeclaration);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
