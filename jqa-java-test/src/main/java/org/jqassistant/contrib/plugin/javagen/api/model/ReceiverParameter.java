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
 * (RULE receiverParameter (BLOCK (ALT (* (BLOCK (ALT annotation))) unannType (? (BLOCK (ALT Identifier '.'))) 'this')))
 * </pre>
 *
 * <pre>
 * receiverParameter
 * 	:	annotation* unannType (Identifier '.')? 'this'
 * 	;
 * </pre>
 *
 * Source Grammar: <a href="../Java8Parser.g4">Java8Parser.g4</a>:1328-1346
 * @see org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser#receiverParameter()
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.ReceiverParameterMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("ReceiverParameter")
public interface ReceiverParameter extends JavaGen {

    @Relation("HAS_ANNOTATION")
    List<Annotation> getAnnotation();

    void setAnnotation(List<Annotation> setAnnotation);

    @Relation("HAS_UNANN_TYPE")
    UnannType getUnannType();

    void setUnannType(UnannType setUnannType);

    // optional: ?
    @Relation("HAS_IDENTIFIER")
    TerminalNodeStrings getIdentifier();

    void setIdentifier(TerminalNodeStrings setIdentifier);

    // unhandled TerminalAST token: '.'
    // unhandled TerminalAST token: 'this'
    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);
}
