package testbase;

import org.testng.annotations.BeforeMethod;

import basepackage.baseclass;

public class activity extends baseclass{

	
	
	public activity()
	{
		
		super();
	}
	
	
	@BeforeMethod
	public void loginww()
	{
		
		baseclass.login();
	}
	
}
