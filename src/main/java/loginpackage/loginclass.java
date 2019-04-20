package loginpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.baseclass;

public class loginclass extends baseclass
{
	
	
	
	@FindBy(name="email") WebElement username;
	@FindBy(name="pass") WebElement userpass;
	@FindBy(xpath="//input[@value='Log In']") WebElement click;
	

      public loginclass()
       {
	
	PageFactory.initElements(driver,this);

   }

  public static String  validateurl()
  {
	  
	 String title= driver.getTitle();
	 
	 return title;
	  
	  
  }







}