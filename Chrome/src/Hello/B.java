
package Hello;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config_library.screenshot;


public class B{
	FirefoxDriver driver;
	@BeforeMethod
	public void startbrow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","/Users/baskardeepu/Downloads/geckodriver");
		
 driver=new FirefoxDriver();
//driver.get("https://www.thetestingworld.com/testings/");
 driver.manage().window().maximize();
 driver.navigate().to("https://www.google.com/");
driver.navigate().to("https://www.thetestingworld.com/testings/");
driver.navigate().back();
Thread.sleep(4000);
driver.navigate().forward();
//driver.manage().window().maximize();

Thread.sleep(6000);
driver.navigate().refresh();

	}
	
	@Test
public void check() {


driver.findElement( By.name("fld_username")).sendKeys("Deepu");
driver.findElement(By.name("fld_email")).sendKeys("dee@gmail.com");
driver.findElement((By.xpath("//input[@name='address']"))).sendKeys("3/587,g3ngaihghf");
driver.findElement(By.xpath("//input[@value='home']")).click();

driver.findElement(By.xpath("//*[@name='sex']/option[3]")).click();
driver.findElement(By.name("terms")).click();
//driver.findElement(By.cssSelector(".displayPopup")).click();
screenshot.takescreen(driver, "Reg");
driver.quit();

};
}
