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
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("CompilationUnit")
public interface CompilationUnit extends JavaGen {

    // optional: ?
    @Relation("HAS_PACKAGE_DECLARATION")
    PackageDeclaration getPackageDeclaration();

    void setPackageDeclaration(PackageDeclaration setPackageDeclaration);

    @Relation("HAS_IMPORT_DECLARATION")
    List<ImportDeclaration> getImportDeclaration();

    void setImportDeclaration(List<ImportDeclaration> setImportDeclaration);

    @Relation("HAS_TYPE_DECLARATION")
    List<TypeDeclaration> getTypeDeclaration();

    void setTypeDeclaration(List<TypeDeclaration> setTypeDeclaration);

    @Relation("HAS_E_O_F")
    TerminalNodeStrings getEOF();

    void setEOF(TerminalNodeStrings setEOF);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
