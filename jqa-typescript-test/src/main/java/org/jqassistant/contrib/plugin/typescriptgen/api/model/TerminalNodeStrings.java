//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.typescriptgen.api.model;

import org.jqassistant.contrib.plugin.typescriptgen.api.TypeScriptGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator")
@Label("TerminalNodeStrings")
public interface TerminalNodeStrings extends TypeScriptGen {

    @Relation("HAS_TEXT")
    String getText();

    void setText(String setText);

    @Relation("HAS_TYPE")
    String getType();

    void setType(String setType);

    @Relation("HAS_LINE")
    String getLine();

    void setLine(String setLine);

    @Relation("HAS_CHAR_POSITION_IN_LINE")
    String getCharPositionInLine();

    void setCharPositionInLine(String setCharPositionInLine);

    @Relation("HAS_TOKEN_INDEX")
    String getTokenIndex();

    void setTokenIndex(String setTokenIndex);

    @Relation("HAS_START_INDEX")
    String getStartIndex();

    void setStartIndex(String setStartIndex);

    @Relation("HAS_STOP_INDEX")
    String getStopIndex();

    void setStopIndex(String setStopIndex);
}
