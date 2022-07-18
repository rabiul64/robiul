   package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertoesFile;

import org.openqa.selenium.chrome.ChromeDriver; 

public class FirstSeleniumTest {
	public static String browser;
	static WebDriver driver;
	public static void main(String[] args) {
		//setBrowser();
		PropertoesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
        PropertoesFile.writePropertiesFile();
	}
	public static void setBrowser() {
		browser = "Chrome";
	}
	public static void setBrowserConfig() {
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\wcg\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\wcg\\eclipse-workspace\\SeleniumTest\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	public static void runTest() {
		driver.get("http://www.amazon.com");
		driver.quit();
	}
}
