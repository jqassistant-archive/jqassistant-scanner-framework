//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import java.util.List;

/**
 * Generated from AST:
 * <pre>
 * (RULE compilationUnit (BLOCK (ALT (? (BLOCK (ALT packageDeclaration))) (* (BLOCK (ALT importDeclaration))) (* (BLOCK (ALT typeDeclaration))) EOF)))
 * </pre>
 *
 * <pre>
 * compilationUnit
 * 	:	packageDeclaration? importDeclaration* typeDeclaration* EOF
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:511-526
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#compilationUnit()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.CompilationUnitMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Mon Aug 09 23:50:32 CEST 2021"
)
@Label("CompilationUnit")
public interface CompilationUnit extends JavaGen {

    // optional: packageDeclaration
    @Relation("HAS_PACKAGE_DECLARATION")
    PackageDeclaration getPackageDeclaration();

    void setPackageDeclaration(PackageDeclaration packageDeclaration);

    @Relation("HAS_IMPORT_DECLARATION")
    List<ImportDeclaration> getImportDeclarations();

    void setImportDeclarations(List<ImportDeclaration> setImportDeclarations);

    @Relation("HAS_TYPE_DECLARATION")
    List<TypeDeclaration> getTypeDeclarations();

    void setTypeDeclarations(List<TypeDeclaration> setTypeDeclarations);

    @Relation("HAS_E_O_F")
    TerminalNodeStrings getEOF();

    void setEOF(TerminalNodeStrings EOF);
}
