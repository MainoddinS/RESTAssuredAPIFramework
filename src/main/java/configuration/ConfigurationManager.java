package configuration;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ConfigurationManager {

	private Properties prop;
	private FileInputStream ip;

	public Properties initProp() {
		prop = new Properties();

		try {
			  ip = new FileInputStream("./src/test/resources/config/config.properties");
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try{
			prop.load(ip);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
