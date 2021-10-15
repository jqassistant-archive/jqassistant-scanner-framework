package org.jqassistant.contrib.plugin.antlr2jqassistant.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

import java.io.File;
import java.util.List;

@Getter
@Builder
public class GenerationConfig {
    @NonNull private String     pluginId;
    @NonNull private PackagePaths     paths;
    @NonNull private String     parserName;
    @NonNull private String     sourceFolder;
    @NonNull private String     destinationFolder;
    @NonNull private String     entryNode;
    @NonNull private List<File> grammarDependencies;
    @NonNull private List<File> grammarFiles;

    public File[] getGrammarFilesArray() {
        return toArray(grammarFiles);
    }

    public File[] getGrammarDependenciesArray() {
        return toArray(grammarDependencies);
    }

    private File[] toArray(List<File> list) {
        return list.toArray(new File[0]);
    }
}
