//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant/

package org.jqassistant.contrib.plugin.typescriptgen.api;

import org.jqassistant.contrib.plugin.typescriptgen.api.model.Program;
import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import javax.annotation.Generated;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.BaseDescriptorGenerator")
@Label("TypeScriptGenFileDescriptor")
public interface TypeScriptGenFileDescriptor extends TypeScriptGen, FileDescriptor {

    @Relation("HAS_PROGRAM")
    Program getProgram();

    void setProgram(Program setProgram);
}
