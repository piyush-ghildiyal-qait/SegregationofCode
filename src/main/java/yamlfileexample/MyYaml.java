package yamlfileexample;
import java.io.IOException;
import java.io.InputStream;


import org.yaml.snakeyaml.Yaml;

	public class MyYaml {
		  public static void main(String[] args) throws IOException {
		      Yaml yaml = new Yaml();
		      try (InputStream in = MyYaml.class.getResourceAsStream("/practice.yaml")) {
		          Person person = yaml.loadAs(in, Person.class);
		          System.out.println(person);
		      }
		  }
		}
	