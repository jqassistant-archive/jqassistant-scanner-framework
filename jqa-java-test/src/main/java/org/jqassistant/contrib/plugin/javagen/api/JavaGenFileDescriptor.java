//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api;

import org.jqassistant.contrib.plugin.javagen.api.model.generated.CompilationUnit;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.BaseDescriptorGenerator")
@Label("JavaGenFileDescriptor")
public interface JavaGenFileDescriptor extends JavaGenAST, FileDescriptor {

    @Relation("HAS_COMPILATION_UNIT")
    CompilationUnit getCompilationUnit();

    void setCompilationUnit(CompilationUnit setCompilationUnit);
}
