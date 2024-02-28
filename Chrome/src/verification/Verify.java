package verification;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Verify {
	

	public  static String validatetext(WebDriver driver,String loctype,String locvalue) {
			
			//Boolean res=false;
			String act="";;
			try {
				if(loctype.equalsIgnoreCase("xpath"))
				{
					act=driver.findElement(By.xpath(locvalue)).getText();}
				else if(loctype.equalsIgnoreCase("id"))
				{
					act=driver.findElement(By.id(locvalue)).getText();}
				else if(loctype.equalsIgnoreCase("classname"))
				{
					act=driver.findElement(By.className(locvalue)).getText();}
				
			
				
				
			}
			catch(Exception e) {}
			return act;
			
		}

	////text present in any of the place in page
	public static boolean checktext(WebDriver driver,String exptxt) {
		boolean result=false;
		if(driver.getPageSource().contains(exptxt))
		{result=true;}
		return result;
		
	}




	//element visible or not
	public static boolean checkvisiblity(WebDriver driver,String loctype,String locvalue) {
		boolean res=false;
		//Boolean res=false;
		
		try {
			if(loctype.equalsIgnoreCase("xpath"))
			{
				res=driver.findElement(By.xpath(locvalue)).isEnabled();
				}
			else if(loctype.equalsIgnoreCase("id"))
			{
				res=driver.findElement(By.id(locvalue)).isEnabled();
				}
			else if(loctype.equalsIgnoreCase("name"))
			{
				res=driver.findElement(By.name(locvalue)).isEnabled();
				}
			}
		catch(Exception e) {}
		
		
		return res;
		
	}

	//checking attribute
	public  static Boolean validateattribute(WebDriver driver,String loctype,String locvalue,String attributename,String attributevalue) {
		
		Boolean res=false;
		String act="";
		try {
			if(loctype.equalsIgnoreCase("xpath"))
			{
				act=driver.findElement(By.xpath(locvalue)).getAttribute(attributename);}
			else if(loctype.equalsIgnoreCase("id"))
			{
				act=driver.findElement(By.id(locvalue)).getAttribute(attributename);}
			else if(loctype.equalsIgnoreCase("classname"))
			{
				act=driver.findElement(By.className(locvalue)).getAttribute(attributename);}
			
		if(act.equals(attributevalue))
		{res=true;}
			
			
		}
		catch(Exception e) {}
		return res;
		
	}



		
		
		
		
		
		
		public  static boolean validateelement(WebDriver driver,String element) {
			
			Boolean res=false;
			try {
				driver.findElement(By.id(element));
				res=true;
				
			}
			catch(Exception e) {}
			return res;
			
		}
		/////alter method for all type element
		
	public  static boolean validateelement1(WebDriver driver,String loctype,String locvalue) {
			
			Boolean res=false;
			try {
				if(loctype.equalsIgnoreCase("xpath"))
				{driver.findElement(By.xpath(locvalue));}
				else if(loctype.equalsIgnoreCase("id"))
				{driver.findElement(By.id(locvalue));}
				else if(loctype.equalsIgnoreCase("classname"))
				{driver.findElement(By.className(locvalue));}
				res=true;
				
			}
			catch(Exception e) {}
			return res;
			
		}
		
		
		
		
		

		public static boolean validateurl(WebDriver driver,String expURL)
		{
			boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expURL))
		{
			result=true;
		}
			return result;
		}
		
		//compare with tiltle===
		public static boolean validatetitle(WebDriver driver,String exptitle)
		{
			boolean result = false;
		if(driver.getCurrentUrl().equalsIgnoreCase(exptitle))
		{
			result=true;
		}
			return result;
		}
		}


