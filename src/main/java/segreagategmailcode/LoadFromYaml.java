package segreagategmailcode;
import java.io.IOException;
import java.io.InputStream;


import org.yaml.snakeyaml.Yaml;

	public class LoadFromYaml {
		
		
		
		  public GmailData returnObjectOfYaml() throws IOException {
		      Yaml yaml = new Yaml();
		      try (InputStream in = LoadFromYaml.class.getResourceAsStream("/gmaildata.yaml")) {
		          GmailData gdata = yaml.loadAs(in, GmailData.class);
		         
		          return gdata;
		      }
		
		  }
		}
	