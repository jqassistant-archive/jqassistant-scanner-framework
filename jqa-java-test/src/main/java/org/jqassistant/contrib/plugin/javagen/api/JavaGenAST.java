//Generated from C:\workspace\jqassistant\jqassistant-scanner-framework/antlr-to-jqassistant

package org.jqassistant.contrib.plugin.javagen.api;

import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import javax.annotation.Generated;
import com.buschmais.xo.api.annotation.Abstract;
import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;

@Generated(
	value = "org.jqassistant.contrib.plugin.antlr2jqassistant.generate.BaseDescriptorGenerator")
@Abstract()
@Label("JavaGenAST")
public interface JavaGenAST extends Descriptor {

    @Relation("HAS_FILE_NAME")
    String getFileName();

    void setFileName(String setFileName);

    @Relation("HAS_SOURCE_CODE")
    String getSourceCode();

    void setSourceCode(String setSourceCode);

    @Relation("HAS_SOURCE_POSITION")
    String getSourcePosition();

    void setSourcePosition(String setSourcePosition);
}
