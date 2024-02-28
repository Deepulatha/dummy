
package Hello;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Button_link{
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
Select s=new Select(driver.findElement(By.name("sex")));
//s.selectByIndex(0);
List<WebElement> a=s.getOptions();
for(WebElement b:a) {
System.out.println(b.getText());}
   
   
//driver.findElement(By.name("fld_username")).clear();
//driver.findElement(By.l("fld_username")).sendKeys("Baskar");
//driver.findElement(By.partialLinkText("Read D")).click();
//System.out.println("the inner text:"+driver.findElement(By.className("button")).isEnabled());
//System.out.println("the title is"+driver.findElement(By.id("email")).getAttribute("placeholder"));
//System.out.println("HTML:"+driver.findElement(By.name("pass")).getLocation());

};
}
