package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.CompilationUnit;
import lombok.AllArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.FormattedName;
import org.jqassistant.contrib.plugin.antlr2jqassistant.model.GenerationConfig;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class FileOperations {
    private GenerationConfig config;

    void writeToFiles(String destination, Map<FormattedName, CompilationUnit> compilationUnitMap) {
        for (Map.Entry<FormattedName, CompilationUnit> entry : compilationUnitMap.entrySet()) {
            FormattedName name = entry.getKey();
            CompilationUnit compilationUnit = entry.getValue();

            try {
                String packageIdentifier = compilationUnit.getPackageDeclaration().orElseThrow().getName().getIdentifier();
                File file = new File(destination + "/" + name + ".java");
                if (file.getParentFile().mkdirs()) {
                    System.out.println("Created new directories");
                }
                FileWriter myWriter = new FileWriter(file);
                myWriter.write("//" + getComment(""));
                myWriter.write(compilationUnit.toString());
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred for " + name);
                e.printStackTrace();
            }
        }
        System.out.println(new Date() + " Successfully wrote compilationUnitMap to " + compilationUnitMap.size() + " files in package " + destination);
    }

    private String getComment(String name) {
        return new StringBuilder()
                .append(name.isEmpty() ? "" : name + " - ")
                .append("Generated from ")
                .append(Paths.get("").toAbsolutePath()).append("/")
                .append(config.getSourceFolder())
//                .append(" at ").append(new Date())
                .append("\n\n")
                .toString();
    }

    void writeToFile(JqassistantPlugin jqassistantPlugin) {
        String name = "jqassistant-plugin.xml";

        jqassistantPlugin.setDescription(new StringBuilder().append("\n\t\t")
                .append(getComment(""))
                .append("\t\t").append(jqassistantPlugin.getDescription())
                .append("\n\t").toString());

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(JqassistantPlugin.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File(config.getDestinationFolder() + "src/main/resources/META-INF/" + name);
            if (file.getParentFile().mkdirs()) {
                System.out.println("Created new directories");
            }

//            QName qName = new QName("http://schema.jqassistant.org/plugin/v1.10", "jqassistant-plugin", "jqa-plugin");
//            JAXBElement<JqassistantPlugin> root = new JAXBElement<>(qName, JqassistantPlugin.class, jqassistantPlugin);
//            jaxbMarshaller.marshal(root, file);


            jaxbMarshaller.marshal(jqassistantPlugin, file);

            System.out.println(new Date() + " Successfully wrote jqassistantPlugin to file: " + name);
        } catch (JAXBException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void writeToFile(Model mavenProject) {
        String name = "pom.xml";

        MavenXpp3Writer writer = new MavenXpp3Writer();
        try {
            File file = new File(config.getDestinationFolder() + "src/main/resources/META-INF/" + name);
            if (file.getParentFile().mkdirs()) {
                System.out.println("Created new directories");
            }
            writer.write(new FileWriter(file), mavenProject);
            System.out.println(new Date() + " Successfully wrote maven project to file: " + name);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void copyFiles(List<File> files, String destination) {
        files.forEach(file -> {
            try {
                FileUtils.copyFile(file, new File(destination + "/" + file.getName()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}