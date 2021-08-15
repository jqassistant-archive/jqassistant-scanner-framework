//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.ClassType_lfno_classOrInterfaceType;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator")
@Mapper(config = MapperConfiguration.class)
public interface ClassType_lfno_classOrInterfaceTypeMapper {

    public static ClassType_lfno_classOrInterfaceTypeMapper INSTANCE = Mappers.getMapper(ClassType_lfno_classOrInterfaceTypeMapper.class);

    ClassType_lfno_classOrInterfaceType map(@Context() ScannerContext scannerContext, Java8Parser.ClassType_lfno_classOrInterfaceTypeContext parserContext);
}
