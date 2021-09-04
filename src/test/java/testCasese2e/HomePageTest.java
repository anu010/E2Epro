package testCasese2e;



import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LandingPage;
import pages.LoginPageClass;
import testbase.BaseparentClass;

public class HomePageTest extends BaseparentClass{

	
	@BeforeTest
	public void enter() throws IOException
	{
			driver=initialization();
				
	}
	
	
	
	@Test(dataProvider = "getData")
	public void basePagenavigation(String Username, String Password) 
	{
		driver.get(prop.getProperty("loginurl"));
		//one is inheritance
		/// creating object to that class and invoke methods of it
	
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		
		LoginPageClass lp = new LoginPageClass(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
//		lp.clickLogin().click();
	
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//Row stands for how many different data types test should run
		//Colomun stands for how many values per each test
		Object[][] data = new Object[2][2];
		data[0][0] = "abc@gmail.com";
		data[0][1] = "password@123";
		
		data[1][0] = "academy@gmail.com";
		data[1][1] = "academy@2021";
		
		return data;
		
	}
	
	

	
	
	
}
