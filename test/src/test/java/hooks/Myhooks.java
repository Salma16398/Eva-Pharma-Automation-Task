package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import Utiles.configReader;
import factory.DriverFactory;
import io.cucumber.java.Before;

public class Myhooks {
	WebDriver driver;

	@Before
	public void startUp() {
		Properties prop = configReader.intailzeProperties();
		DriverFactory.invokeBrowser(prop.getProperty("browser"));
		driver = DriverFactory.getdriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}

}
