package Hello;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import config_library.config;
import verification.Verify;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	FirefoxDriver driver;
	@BeforeMethod
	public void startbrow() {
		System.setProperty("webdriver.gecko.driver","/Users/baskardeepu/Downloads/geckodriver");
		//WebDriverManager.chromedriver().setup();
 driver=new FirefoxDriver();
driver.get("https://www.thetestingworld.com/testings/");
	}
	//@AfterMethod
	//public void closebrowser() {
	//	driver.close();
	//}
	@Test
public void check() throws IOException {

//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
//driver.findElement(By.id("u_0_1_Wp")).click();
//driver.findElement(By.cssSelector("a._42ft _4jy0 _yla _4jy3 _4jy2 selected _51sy mrm")).click();

driver.findElement( By.name("fld_username")).sendKeys("Deepu");
driver.findElement(By.name("fld_email")).sendKeys("dee@gmail.com");
driver.findElement((By.xpath("//input[@name='address']"))).sendKeys("3/587,g3ngaihghf");

	Boolean res=Verify.checkvisiblity(driver, "xpath", config.locators("button"));
	Assert.assertTrue(res);

driver.findElement(By.xpath(config.locators("button"))).click();

//driver.findElement(By.xpath("//*[@name='sex']/option[3]")).click();
//driver.findElement(By.name("terms")).click();
//driver.findElement(By.cssSelector(".displayPopup")).click();

//driver.findElement(By.xpath("//input[@value='Sign up']")).click();
//driver.close();
};
}

