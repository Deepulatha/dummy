package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import config_library.config;
//import verification.Verify;

public class Registrationpage 
{
	
	public WebDriver driver=null;
	


	public Registrationpage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void enterusername() {
		//WebDriverWait wait=new WebDriverWait(driver,);
		driver.findElement( By.name("fld_username")).sendKeys("Deepu");
		
	}
	
	public void entermail() {
		driver.findElement(By.name("fld_email")).sendKeys("dee@gmail.com");
	}
	public void enteraddress() {
		
	

	driver.findElement((By.xpath("//input[@name='address']"))).sendKeys("3/587,g3ngaihghf");}
public void clickbutton() throws IOException {

	driver.findElement(By.xpath(config.locators("button"))).click();}
}
