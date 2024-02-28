package Hello;

import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

import config_library.config;
import config_library.screenshot;

import org.testng.annotations.Test;
import base.*;


public class C extends initiate{
		

	@Test
public void check() throws IOException {


driver.findElement( By.name(config.locators("username"))).sendKeys("user");
driver.findElement(By.name(config.locators("email"))).sendKeys("user@gmail.com");
driver.findElement(By.xpath(config.locators("address"))).sendKeys("gfhghsvd");
driver.findElement(By.xpath(config.locators("button"))).click();;
screenshot.takescreen(driver, "hello");
	}
	




}