package org.jqassistant.contrib.plugin.antlr2jqassistant.model;

import lombok.Getter;

@Getter
public class PackagePaths {
    public static final String SRC = "src/main";
    public static final String SRC_JAVA = SRC + "/java";
    public static final String SRC_ANTLR = SRC + "/antlr4";
    public static final String SRC_RESOURCES = SRC + "/resources";
    public static final String SRC_META_INF = SRC_RESOURCES + "/META-INF";
    public static final String ROOT_PACKAGE = "org.jqassistant.contrib.plugin";

    private final String pluginId;

    private final String projectPackage;
    private final String antlrPackage;
    private final String mapperPackage;
    private final String apiPackage;
    private final String modelPackage;

    private final String grammarPath;
    private final String grammarDependenciesPath;

    private final String projectPath;
    private final String antlrPath;
    private final String mapperPath;
    private final String apiPath;
    private final String modelPath;

    public PackagePaths(String pluginId, String destinationFolder) {
        this.pluginId = pluginId;

        projectPackage = ROOT_PACKAGE + "." + pluginId.toLowerCase();
        antlrPackage = projectPackage + ".antlr4";
        mapperPackage = projectPackage + ".util.mapper";
        apiPackage = projectPackage + ".api";
        modelPackage = apiPackage + ".model.generated";

        grammarPath = getPathFrom(destinationFolder, SRC_ANTLR, antlrPackage);
        grammarDependenciesPath = getPathFrom(destinationFolder, SRC_JAVA, antlrPackage);

        projectPath = getPathFrom(destinationFolder, SRC_JAVA, projectPackage);
        antlrPath = getPathFrom(destinationFolder, SRC_JAVA, antlrPackage);
        mapperPath = getPathFrom(destinationFolder, SRC_JAVA, mapperPackage);
        apiPath = getPathFrom(destinationFolder, SRC_JAVA, apiPackage);
        modelPath = getPathFrom(destinationFolder, SRC_JAVA, modelPackage);
    }

    public String getPathFrom(String destinationFolder, String sourceFolder, String packageName) {
        return String.join("/", destinationFolder, sourceFolder, packageName.replace(".", "/"));
    }
}
