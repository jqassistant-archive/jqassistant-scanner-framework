//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classHeritage (BLOCK (ALT (? (BLOCK (ALT classExtendsClause))) (? (BLOCK (ALT implementsClause))))))
 * </pre>
 *
 * <pre>
 * classHeritage
 *     : classExtendsClause? implementsClause?
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2005-2015
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classHeritage()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassHeritageMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassHeritage")
public interface ClassHeritage extends TypeScriptGen {

    // optional: ?
    @Relation("HAS_CLASS_EXTENDS_CLAUSE")
    ClassExtendsClause getClassExtendsClause();

    void setClassExtendsClause(ClassExtendsClause setClassExtendsClause);

    // optional: ?
    @Relation("HAS_IMPLEMENTS_CLAUSE")
    ImplementsClause getImplementsClause();

    void setImplementsClause(ImplementsClause setImplementsClause);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
