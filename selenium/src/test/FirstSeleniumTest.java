package test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\assem.aimaganova\\Documents\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.bin",
                "C:\\Users\\assem.aimaganova\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
 
		Thread.sleep(5000);
		driver.quit();
	}
}
