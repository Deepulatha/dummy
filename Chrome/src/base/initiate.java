package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import config_library.config;

public class initiate {
	
	public WebDriver driver;
	@BeforeMethod
	public void startbrow() throws IOException {
		if(config.configuration("browser").equalsIgnoreCase("chrome"))
		{System.setProperty("webdriver.chrome.driver","/Users/baskardeepu/Downloads/chromedriver-mac-arm64/chromedriver");
		//WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.get(config.configuration("Application_URL"));
driver.manage().window().maximize();
}
		else if(config.configuration("browser").equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/geckodriver");
 driver=new FirefoxDriver();
driver.get(config.configuration("Application_URL"));
driver.manage().window().maximize();
}
		else 
		
		{System.setProperty("webdriver.chrome.driver","/Users/baskardeepu/Downloads/chromedriver-mac-arm64/chromedriver");
		//WebDriverManager.chromedriver().setup();
 driver=new ChromeDriver();
driver.get(config.configuration("Application_URL"));
driver.manage().window().maximize();}
}

}
