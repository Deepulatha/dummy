package config_library;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.omg.CORBA.SystemException;

public class config {
public static String configuration(String Key) throws IOException {
	File f=new File("./Configuration_files/Config.properties");
	FileReader fr=new FileReader(f);
	Properties Pr=new Properties();
	Pr.load(fr);
	return Pr.get(Key).toString();
	
	
}

public static String locators(String Key) throws IOException {
try {
	File f=new File("./Configuration_files/locators.properties");
	FileReader fr=new FileReader(f);
	Properties Pr=new Properties();
	Pr.load(fr);
	return Pr.get(Key).toString();
}
catch(SystemException e) 
{
	return null;}
}}
