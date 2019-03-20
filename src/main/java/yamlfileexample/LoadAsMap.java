package yamlfileexample;


import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.yaml.snakeyaml.Yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class LoadAsMap {

    public static void main(String[] args) throws IOException {
    	loadFromFile("/practice.yaml");
        loadFromFile("/Persons.yaml");
       
        
    }

	  private static void loadFromFile(String path) throws IOException {
	  System.out.printf("-- loading from %s --%n", path); Yaml yaml = new Yaml();
	  try (InputStream in = LoadAsMap.class.getResourceAsStream(path)) {
	  Iterable<Object> itr = yaml.loadAll(in);
	  
	  for (Object o : itr) { System.out.println("Loaded object type:"+o.getClass()); System.out.println(o); }
	  
	  }
	  }
	 
}