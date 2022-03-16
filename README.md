# jQAssistant Scanner Framework

## Table of contents
* [General info](#general-info)
* [Requirements](#requirements)
* [Setup](#setup)

## General info
This project contains a framework for generating jQAssistant Plugins on the basis of an ANTLR Grammar.
There are two generated examples included: `jqa-java-test` and `jqa-typescript-test`.

## Prerequisites
* Java 11 or higher
* Maven 3.8.4 or higher

## Optional Prerequisites
* Neo4j Desktop with the APOC library
* ANTLR v4 IntelliJ plug-in from the IntelliJ marketplace (see https://plugins.jetbrains.com/plugin/7358-antlr-v4).
* Graph Database support IntelliJ plug-in from the IntelliJ marketplace (see https://plugins.jetbrains.com/plugin/8087-graph-database-support).
* MapStruct IntelliJ plug-in from the IntelliJ marketplace (see https://plugins.jetbrains.com/plugin/10036-mapstruct-support).


## Setup
To set up this project, clone the master branch from its repository and install it locally using Maven:

```
$ cd ./jqassistant-scanner-framework
$ mvn install
```

## Execute the two example scanners
1. Navigate to `./jqa-java-test` or `./jqa-typescript-test`
2. Start a standalone Neo4j Database Server via Neo4j Desktop or by executing `mvn jqassistant:server`
3. Navigate to `./src/test/java` and open the `PluginTestIT` integration test file.
4. Execute `scanJavaGenFile()` or the `scanTypeScriptGenFile()` methods as JUnit tests.

## Generate your own Plugin
1. Place your `.g4` grammar of choice in the `./antlr-to-jqassistant/src/main/resources` folder.
2. Add your `GenerationConfig` to the `List<GenerationConfig> CONFIGS` in `antlr-to-jqassistant/src/main/java/org/jqassistant/contrib/plugin/antlr2jqassistant/Main.java` using the examples already present
3. Execute `main()` in `antlr-to-jqassistant/src/main/java/org/jqassistant/contrib/plugin/antlr2jqassistant/Main.java` as a Java Application
4. Execute `mvn install` in the generated plugin directory.
5. Implement the `FileScannerPlugin` and carefully select your entry node. (use `JavaGenFileScannerPlugin` as an example)
6. Create a `pom.xml` for your plugin.

