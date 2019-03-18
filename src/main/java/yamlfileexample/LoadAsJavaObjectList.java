package yamlfileexample;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class LoadAsJavaObjectList {

    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = MyYaml.class.getResourceAsStream("/Persons.yaml")) {
            Persons persons = yaml.loadAs(in, Persons.class);
            for (Person person : persons.getPersons()) {
                System.out.println(person);
            }
        }
    }
}