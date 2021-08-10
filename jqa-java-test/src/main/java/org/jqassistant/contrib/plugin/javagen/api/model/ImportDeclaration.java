//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE importDeclaration (BLOCK (ALT singleTypeImportDeclaration) (ALT typeImportOnDemandDeclaration) (ALT singleStaticImportDeclaration) (ALT staticImportOnDemandDeclaration)))
 * </pre>
 *
 * <pre>
 * importDeclaration
 * 	:	singleTypeImportDeclaration
 * 	|	typeImportOnDemandDeclaration
 * 	|	singleStaticImportDeclaration
 * 	|	staticImportOnDemandDeclaration
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:551-569
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#importDeclaration()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ImportDeclarationMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Label("ImportDeclaration")
public interface ImportDeclaration extends JavaGen {

    @Relation("HAS_SINGLE_TYPE_IMPORT_DECLARATION")
    SingleTypeImportDeclaration getSingleTypeImportDeclaration();

    void setSingleTypeImportDeclaration(SingleTypeImportDeclaration singleTypeImportDeclaration);

    @Relation("HAS_TYPE_IMPORT_ON_DEMAND_DECLARATION")
    TypeImportOnDemandDeclaration getTypeImportOnDemandDeclaration();

    void setTypeImportOnDemandDeclaration(TypeImportOnDemandDeclaration typeImportOnDemandDeclaration);

    @Relation("HAS_SINGLE_STATIC_IMPORT_DECLARATION")
    SingleStaticImportDeclaration getSingleStaticImportDeclaration();

    void setSingleStaticImportDeclaration(SingleStaticImportDeclaration singleStaticImportDeclaration);

    @Relation("HAS_STATIC_IMPORT_ON_DEMAND_DECLARATION")
    StaticImportOnDemandDeclaration getStaticImportOnDemandDeclaration();

    void setStaticImportOnDemandDeclaration(StaticImportOnDemandDeclaration staticImportOnDemandDeclaration);
}
