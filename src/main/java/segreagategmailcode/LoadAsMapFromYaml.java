package segreagategmailcode;



import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class LoadAsMapFromYaml {

    public static void main(String[] args) throws IOException {
       
        loadFromFile("/gmaildata.yaml");
    }

    private static void loadFromFile(String path) throws IOException {
        System.out.printf("-- loading from %s --%n", path);
        Yaml yaml = new Yaml();
        try (InputStream in = LoadAsMapFromYaml.class.getResourceAsStream(path)) {
            Iterable<Object> itr = yaml.loadAll(in);
            for (Object o : itr) {
                System.out.println("Loaded object type:" + o.getClass());
                System.out.println(o);
            }
        }
        
        
        
    }
}