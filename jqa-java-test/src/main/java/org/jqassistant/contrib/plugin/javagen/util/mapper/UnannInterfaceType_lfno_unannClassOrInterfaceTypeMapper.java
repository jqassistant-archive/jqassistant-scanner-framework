//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.UnannInterfaceType_lfno_unannClassOrInterfaceType;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(config = MapperConfiguration.class)
public interface UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper {

    public static UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper INSTANCE = Mappers.getMapper(UnannInterfaceType_lfno_unannClassOrInterfaceTypeMapper.class);

    UnannInterfaceType_lfno_unannClassOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext parserContext);
}
