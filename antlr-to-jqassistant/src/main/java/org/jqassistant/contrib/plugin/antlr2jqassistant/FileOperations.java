package org.jqassistant.contrib.plugin.antlr2jqassistant;

import com.github.javaparser.ast.CompilationUnit;
import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Writer;
import org.jqassistant.contrib.plugin.antlr2jqassistant.generate.CleanName;
import org.jqassistant.schema.plugin.v1.JqassistantPlugin;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Map;

public class FileOperations {
    static void writeToFiles(String name, String destinationPackage, Map<CleanName, CompilationUnit> compilationUnitMap) {
        for (Map.Entry<CleanName, CompilationUnit> entry : compilationUnitMap.entrySet()) {
            CleanName s = entry.getKey();
            CompilationUnit compilationUnit = entry.getValue();

            try {
                File file = new File(Main.destination + "src/main/java/" + destinationPackage.replace(".", "/") + "/" + s + ".java");
                if (file.getParentFile().mkdirs()) {
                    System.out.println("Created new directories");
                }
                FileWriter myWriter = new FileWriter(file);
                myWriter.write("//" + getComment(""));
                myWriter.write(compilationUnit.toString());
                myWriter.close();
            } catch (IOException e) {
                System.out.println("An error occurred for " + s);
                e.printStackTrace();
            }
        }
        System.out.println(new Date() + " Successfully wrote compilationUnitMap to " + compilationUnitMap.size() + " files in package " + destinationPackage);
    }

    private static String getComment(String name) {
        return new StringBuilder()
                .append(name.isEmpty() ? "" : name + " - ")
                .append("Generated from ")
                .append(Paths.get("").toAbsolutePath()).append("/")
                .append(Main.source)
//                .append(" at ").append(new Date())
                .append("\n\n")
                .toString();
    }

    static void writeToFile(String fileName, String destinationPackage, Map<CleanName, CompilationUnit> compilationUnitMap) {

        try {
            File file = new File(Main.destination + "src/main/java/" + destinationPackage.replace(".", "/") + "/" + fileName);
            if (file.getParentFile().mkdirs()) {
                System.out.println("Created new directories");
            }
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("//" + getComment(""));

            for (Map.Entry<CleanName, CompilationUnit> entry : compilationUnitMap.entrySet()) {
                CleanName s = entry.getKey();
                CompilationUnit compilationUnit = entry.getValue();
                myWriter.write("\n\n//" + s + ".java\n");
                myWriter.write(compilationUnit.toString());
            }
            myWriter.close();
            System.out.println(new Date() + " Successfully wrote compilationUnitMap to a single file: " + file);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    static void writeToFile(JqassistantPlugin jqassistantPlugin) {
        String name = "jqassistant-plugin.xml";

        jqassistantPlugin.setDescription(new StringBuilder().append("\n\t\t")
                .append(getComment(""))
                .append("\t\t").append(jqassistantPlugin.getDescription())
                .append("\n\t").toString());

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(JqassistantPlugin.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File(Main.destination + "src/main/resources/META-INF/" + name);
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

    static void writeToFile(Model mavenProject) {
        String name = "pom.xml";

        MavenXpp3Writer writer = new MavenXpp3Writer();
        try {
            File file = new File(Main.destination + "src/main/resources/META-INF/" + name);
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
}