package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	static WebDriver driver;

	public static void invokeBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equals("edge")) {
			driver = new EdgeDriver();

		} else if (browserName.equals("fireFox")) {
			driver = new FirefoxDriver();
		}
	}

	public static WebDriver getdriver() {
		return driver;
	}
}
