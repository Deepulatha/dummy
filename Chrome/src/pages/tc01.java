package pages;

import java.io.IOException;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.initiate;

//import org.checkerframework.checker.units.qual.radians;

public class tc01 extends initiate{
	
	@Test
	public void tc001reg() throws IOException {
		
	Registrationpage register=new Registrationpage(driver);
	register.enterusername();
	register.entermail();
	register.enteraddress();
	register.clickbutton();
	
	

}}
