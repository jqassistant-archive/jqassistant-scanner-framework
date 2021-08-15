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
 * (RULE packageDeclaration (BLOCK (ALT (* (BLOCK (ALT packageModifier))) 'package' packageName ';')))
 * </pre>
 *
 * <pre>
 * packageDeclaration
 * 	:	packageModifier* 'package' packageName ';'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:528-541
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#packageDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.PackageDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("PackageDeclaration")
public interface PackageDeclaration extends JavaGen {

    @Relation("HAS_PACKAGE_MODIFIER")
    List<PackageModifier> getPackageModifier();

    void setPackageModifier(List<PackageModifier> setPackageModifier);

    // unhandled TerminalAST token: 'package'
    @Relation("HAS_PACKAGE_NAME")
    PackageName getPackageName();

    void setPackageName(PackageName packageName);

    // unhandled TerminalAST token: ';'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);
}
