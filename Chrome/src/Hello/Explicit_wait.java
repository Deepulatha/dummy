
package Hello;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Explicit_wait{
	FirefoxDriver driver;
	@BeforeMethod
	public void startbrow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver");
		
 driver=new FirefoxDriver();

 driver.manage().window().maximize();
 
driver.get("https://www.thetestingworld.com/testings/");


	}
	
	@Test
public void check() {

		
	

  // WebElement element1=driver.findElement( By.name("add_type"));
Select s=new Select(driver.findElement(By.id("countryId")));
s.selectByValue("101");
//WebDriverWait wait=new WebDriverWait(driver, 10);
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")),"Delhi"));

Select ab=new Select(driver.findElement(By.id("stateId")));
ab.selectByVisibleText("Delhi");
wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Delhi"));
Select a=new Select(driver.findElement(By.id("cityId")));
a.selectByVisibleText("Delhi");
   
   
//driver.findElement(By.name("fld_username")).clear();
//driver.findElement(By.l("fld_username")).sendKeys("Baskar");
//driver.findElement(By.partialLinkText("Read D")).click();
//System.out.println("the inner text:"+driver.findElement(By.className("button")).isEnabled());
//System.out.println("the title is"+driver.findElement(By.id("email")).getAttribute("placeholder"));
//System.out.println("HTML:"+driver.findElement(By.name("pass")).getLocation());

};
}
