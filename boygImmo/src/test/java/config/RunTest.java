package config;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class RunTest extends Config {
@Test
public void test() throws Exception {
	driver.get("https://www.bouygues-immobilier.com/");
	driver.manage().window().maximize();
Thread.sleep(2000);
   // hdzaud
  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#dossier-client"))).click();
    //Thread.sleep(2000);csqdqsdqsdqsdsfsdfdsfdsfsdvbdfdfdgsqqsdqsddqd
    Thread.sleep(1000);
    
}

}
