//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:55 CEST 2021

package org.jqassistant.contrib.plugin.javagen.util.mapper;

import org.jqassistant.contrib.plugin.javagen.api.model.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary;
import org.jqassistant.contrib.plugin.javagen.antlr4.Java8Parser;
import org.mapstruct.factory.Mappers;
import javax.annotation.Generated;
import org.mapstruct.Mapper;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import org.mapstruct.Context;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.MapperGenerator", 
	date = "Tue Aug 10 01:27:55 CEST 2021"
)
@Mapper(config = MapperConfiguration.class)
public interface PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper {

    public static PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper INSTANCE = Mappers.getMapper(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryMapper.class);

    PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary map(@Context() ScannerContext scannerContext, Java8Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext parserContext);
}
