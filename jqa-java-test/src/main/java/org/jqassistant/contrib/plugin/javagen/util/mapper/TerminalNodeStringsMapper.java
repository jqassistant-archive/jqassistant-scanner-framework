//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jqassistant.contrib.plugin.javagen.api.model.TerminalNodeStrings;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import javax.annotation.Generated;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator",
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface TerminalNodeStringsMapper {

    public static TerminalNodeStringsMapper INSTANCE = Mappers.getMapper(TerminalNodeStringsMapper.class);

    default TerminalNodeStrings map(@Context() ScannerContext scannerContext, TerminalNode terminalNode) {
        return map(scannerContext, terminalNode.getSymbol());
    }

    TerminalNodeStrings map(@Context() ScannerContext scannerContext, Token symbol);

    String map(CharStream value);
}
