package org.jqassistant.contrib.plugin.javagen.api.scanner;

import com.buschmais.jqassistant.core.scanner.api.Scope;

public enum JavaGenScope implements Scope {
    SRC;

    public static final String FILE_EXTENSION = ".java";

    @Override
    public String getPrefix() {
        return "java";
    }

    @Override
    public String getName() {
        return name();
    }
}
