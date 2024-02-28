package config_library;

import java.io.File;
//import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class screenshot {
	static String Filename=null;
	//private static File f;
	public static void takescreen(WebDriver driver,String name) {
		try {
		Calendar c=Calendar.getInstance();
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	Filename="./screenshot/"+name+c.getTime().toString().replace(":","").replace(" ","")+".doc";
	File F=screenshot.getScreenshotAs(OutputType.FILE);
	File fs=new File(Filename);
	FileUtils.copyFile(F, fs);}
		catch(Exception e) {
			
		}
		attachscreen();
	}
	public static void attachscreen()  {
		try {
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
	File f = new File(Filename);
			
	Reporter.log("<a href=\"" + f.getAbsolutePath()+ "\"><p align=\"left\">screen " +  "</p>");
		}
		catch(Exception e) {}
	}
}
