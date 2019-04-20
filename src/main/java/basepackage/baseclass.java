package basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class baseclass {
	
	public static FileInputStream input;
	public static WebDriver driver;
	public static Properties prop;
	
	
	
	public   baseclass()  
	{
		 prop = new Properties();
		 
			try {
				input = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Pom_Artifact\\src\\main\\java\\propertypackage\\login.properties");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			
		
			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	public static void login()
	{
		
		System.setProperty(prop.getProperty("driver"),prop.getProperty("driverpath"));
	      WebDriver  driver=new ChromeDriver();
	      driver.manage().window().maximize();
		
	
}
}
