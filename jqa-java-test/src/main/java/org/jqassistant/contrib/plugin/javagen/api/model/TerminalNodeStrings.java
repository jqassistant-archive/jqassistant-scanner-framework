//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api.model;

import org.jqassistant.contrib.plugin.javagen.api.JavaGen;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

/**
 * @see org.antlr.v4.runtime.tree.TerminalNode
 * @see org.jqassistant.contrib.plugin.javagen.util.mapper.TerminalNodeStringsMapper
 */
@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.ApiModelGenerator", 
	date = "Tue Aug 10 01:27:54 CEST 2021"
)
@Label("TerminalNodeStrings")
public interface TerminalNodeStrings extends JavaGen {

    @Relation("HAS_TEXT")
    String getText();

    void setText(String text);

    @Relation("HAS_TYPE")
    String getType();

    void setType(String type);

    @Relation("HAS_LINE")
    String getLine();

    void setLine(String line);

    @Relation("HAS_CHAR_POSITION_IN_LINE")
    String getCharPositionInLine();

    void setCharPositionInLine(String charPositionInLine);

    @Relation("HAS_TOKEN_INDEX")
    String getTokenIndex();

    void setTokenIndex(String tokenIndex);

    @Relation("HAS_START_INDEX")
    String getStartIndex();

    void setStartIndex(String startIndex);

    @Relation("HAS_STOP_INDEX")
    String getStopIndex();

    void setStopIndex(String stopIndex);

    @Relation("HAS_INPUT_STREAM")
    String getInputStream();

    void setInputStream(String inputStream);
}
