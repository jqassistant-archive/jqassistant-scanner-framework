package org.jqassistant.contrib.plugin.antlr2jqassistant.model;

import lombok.Builder;
import lombok.Getter;

import java.io.File;
import java.util.List;

@Getter
@Builder
public class GenerationConfig {
    private static final String SRC          = "src/main";
    private static final String SRC_JAVA     = SRC + "/java";
    private static final String SRC_ANTLR    = SRC + "/antlr";
    private static final String ROOT_PACKAGE = "org.jqassistant.contrib.plugin";

    private String     pluginId;
    private String     parserName;
    private String     sourceFolder;
    private String     destinationFolder;
    private String     entryNode;
    private List<File> grammarDependencies;
    private List<File> grammarFiles;

    private final String projectPackage = ROOT_PACKAGE + this.pluginId.toLowerCase();
    private final String antlrPackage = projectPackage + ".antlr4";
    private final String apiPackage = projectPackage + ".api";
    private final String modelPackage = apiPackage + ".model";
    private final String mapperPackage = projectPackage + ".util.mapper";

    public File[] getGrammarFilesArray() {
        return toArray(grammarFiles);
    }

    public File[] getGrammarDependenciesArray() {
        return toArray(grammarDependencies);
    }

    public String getApiDestination() {
        return String.join("/", destinationFolder, SRC_JAVA, apiPackage.replace(".", "/"));
    }

    public String getModelDestination() {
        return String.join("/", destinationFolder, SRC_JAVA, modelPackage.replace(".", "/"));
    }

    public String getMapperDestination() {
        return String.join("/", destinationFolder, SRC_JAVA, mapperPackage.replace(".", "/"));
    }

    public String getGrammarDestination() {
        return String.join("/", destinationFolder, SRC_ANTLR, antlrPackage.replace(".", "/"));
    }

    private File[] toArray(List<File> list) {
        return list.toArray(new File[0]);
    }
}
