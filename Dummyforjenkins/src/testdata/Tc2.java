package testdata;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Tc2 {
	@Test
	public void startdrow() throws InterruptedException {
		System.setProperty("Webdriver.geckodriver.driver", "./driver/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.thetestingworld.com/testings/");
		driver.findElement(By.name("fld_username")).sendKeys("baskar");
		Thread.sleep(2000);
		driver.quit();
	}

}
