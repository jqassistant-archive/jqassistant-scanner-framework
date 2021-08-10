//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/ at Tue Aug 10 01:27:54 CEST 2021

package org.jqassistant.contrib.plugin.javagen.api;

import org.jqassistant.contrib.plugin.javagen.api.model.CompilationUnit;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.BaseDescriptorGenerator", 
	date = "Tue Aug 10 01:27:54 CEST 2021"
)
@Label("JavaGenFileDescriptor")
public interface JavaGenFileDescriptor extends JavaGen, FileDescriptor {

    @Relation("HAS_COMPILATION_UNIT")
    CompilationUnit getCompilationUnit();

    void setCompilationUnit(CompilationUnit compilationUnit);
}
