package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Config {
	public WebDriver driver;
    public WebDriverWait wait;
	@BeforeTest
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		//fdfgdgdfgdf
	}

	@AfterTest
	public void tearDown() throws Exception {
		 driver.close();

	}
}
