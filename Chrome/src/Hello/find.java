package Hello;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class find {
	@Test
	public void voiddemotc() {
		System.setProperty("Webdriver.geckodriver.driver", "./Driver.geckodriver");
		WebDriver Driver=new FirefoxDriver();
		Driver.manage().window().maximize();
		Driver.navigate().to("https://www.naukri.com");
		Driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/nav/ul/li[3]/a")).click();
		//JavascriptExecutor js=(JavascriptExecutor) Driver;
		System.out.println(Driver.getWindowHandle());
		
			//js.executeScript("alert('hello deepu')", "");
					//date_input = Driver.findElement(By.id("datepicker"));

		//List<WebElement> ele=Driver.findElements(By.className("field"));
		//Driver.findElement(By.id("datepicker")).sendKeys("17/09/2024");
		//Actions a=new Actions(Driver);
		//a.sendKeys(Keys.TAB).build().perform();
		//e.click();
		//System.out.println(ele.size());
		//for(WebElement e:ele)
		//{e.sendKeys("hello");}
		}

}
