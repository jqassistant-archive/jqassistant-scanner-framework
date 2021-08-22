//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * Generated from AST:
 * <pre>
 * (RULE classElement (BLOCK (ALT constructorDeclaration) (ALT (? (BLOCK (ALT decoratorList))) propertyMemberDeclaration) (ALT indexMemberDeclaration) (ALT statement)))
 * </pre>
 *
 * <pre>
 * classElement
 *     : constructorDeclaration
 *     | decoratorList? propertyMemberDeclaration
 *     | indexMemberDeclaration
 *     | statement
 *     ;
 * </pre>
 *
 * Source Grammar: <a href="../TypeScriptParser.g4">TypeScriptParser.g4</a>:2052-2073
 * @see org.jqassistant.contrib.plugin.typescriptgen.antlr4.TypeScriptParser#classElement()
 * @see org.jqassistant.contrib.plugin.typescriptgen.util.mapper.ClassElementMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ClassElement")
public interface ClassElement extends TypeScriptGen {

    @Relation("HAS_CONSTRUCTOR_DECLARATION")
    ConstructorDeclaration getConstructorDeclaration();

    void setConstructorDeclaration(ConstructorDeclaration setConstructorDeclaration);

    // optional: ?
    @Relation("HAS_DECORATOR_LIST")
    DecoratorList getDecoratorList();

    void setDecoratorList(DecoratorList setDecoratorList);

    @Relation("HAS_PROPERTY_MEMBER_DECLARATION")
    PropertyMemberDeclaration getPropertyMemberDeclaration();

    void setPropertyMemberDeclaration(PropertyMemberDeclaration setPropertyMemberDeclaration);

    @Relation("HAS_INDEX_MEMBER_DECLARATION")
    IndexMemberDeclaration getIndexMemberDeclaration();

    void setIndexMemberDeclaration(IndexMemberDeclaration setIndexMemberDeclaration);

    @Relation("HAS_STATEMENT")
    Statement getStatement();

    void setStatement(Statement setStatement);

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
