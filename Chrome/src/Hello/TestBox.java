
package Hello;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestBox{
	FirefoxDriver driver;
	@BeforeMethod
	public void startbrow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/baskardeepu/Downloads/geckodriver");
		
 driver=new FirefoxDriver();

 driver.manage().window().maximize();
 
driver.get("https://www.thetestingworld.com/testings/");


	}
	
	@Test
public void check() {


driver.findElement( By.name("fld_username")).sendKeys("Deepu");
driver.findElement(By.name("fld_username")).clear();
driver.findElement(By.name("fld_username")).sendKeys("Baskar");

};
}
