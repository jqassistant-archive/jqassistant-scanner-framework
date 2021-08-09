package org.jqassistant.contrib.plugin.antlr2jqassistant.generate;

import org.apache.maven.model.Developer;
import org.apache.maven.model.License;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;

import java.util.Arrays;
import java.util.Collections;

public class MavenProjectGenerator {

    public static Model generateMavenProject(String name) {
        Model projectModel = new Model();
        projectModel.setModelVersion("4.0.0");

        Parent parent = new Parent();
        parent.setGroupId("org.jqassistant.contrib.common");
        parent.setArtifactId("parent");
        parent.setVersion("1.10.0");
        parent.setRelativePath("");

        projectModel.setParent(parent);
        projectModel.setGroupId("org.jqassistant.contrib.plugin");
        projectModel.setArtifactId("jqa-" + name.toLowerCase() + "-plugin");
        projectModel.setVersion("0.1-SNAPSHOT");

        projectModel.setName("jQAssistant " + name + " Generated Plugin");
        projectModel.setDescription("A generated jQAssistant plugin for " + name + " as a PoC");
        projectModel.setUrl("http://jqassistant.org/");

        Developer developer1 = new Developer();
        developer1.setId("kev007");
        developer1.setName("Kevin M. Shrestha");
        developer1.setEmail("kev_shrestha@hotmail.com");
        Developer developer2 = new Developer();
        developer2.setId("you!");
        projectModel.setDevelopers(Arrays.asList(developer1, developer2));

        License license = new License();
        license.setName("GNU General Public License, v3");
        license.setUrl("http://www.gnu.org/licenses/gpl-3.0.html");
        projectModel.setLicenses(Collections.singletonList(license));



        return projectModel;
    }


}