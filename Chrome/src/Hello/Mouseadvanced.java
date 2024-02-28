
package Hello;



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


public class Mouseadvanced{
	FirefoxDriver driver;
	
	
	@BeforeMethod
	public void startbrow() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver");
		
 driver=new FirefoxDriver();

 driver.manage().window().maximize();
 
driver.get("https://www.thetestingworld.com");


	}
	@Test
	public void pro() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("menu576"))).perform();
		driver.findElement(By.id("menu679")).click();
		}}
	

