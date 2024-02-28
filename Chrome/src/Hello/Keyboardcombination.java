
package Hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Keyboardcombination{
	FirefoxDriver driver;
	
	
	@BeforeMethod
	public void startbrow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver");
		
 driver=new FirefoxDriver();

 driver.manage().window().maximize();
 
driver.get("https://www.thetestingworld.com/testings/");


	}
	@Test
	public void pro() throws InterruptedException {
		//driver.findElement(By.xpath("//label[text()='Login']")).click();
		//driver.findElement(By.name("_txtUserName")).sendKeys("Hello");
		//Thread.sleep(2000);
		Actions act=new Actions(driver);
		//act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).build().perform();
		//act.keyDown(Keys.COMMAND).sendKeys(Keys.BACK_SPACE).keyUp(Keys.COMMAND).build().perform();
		
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	//act.sendKeys(Keys.PAGE_DOWN);
	
	}}
	//@AfterMethod
	//public void close() {
	
	//driver.quit();}


