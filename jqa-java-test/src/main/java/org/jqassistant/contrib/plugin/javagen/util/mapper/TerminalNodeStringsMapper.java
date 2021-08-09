//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Mon Aug 09 23:50:33 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.javagen.api.model.TerminalNodeStrings;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CharStream;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator", 
	date = "Mon Aug 09 23:50:33 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface TerminalNodeStringsMapper {

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode.getSymbol());
    }

    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);
}
