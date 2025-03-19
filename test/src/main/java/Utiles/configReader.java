package Utiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	public static Properties intailzeProperties() {
		Properties prop = new Properties();
		File profile = new File(
				System.getProperty("user.dir") + "\\src\\test\\resources\\TaskConfig\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(profile);
			prop.load(fis);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return prop;
	}
}
