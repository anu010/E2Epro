package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageClass {

	public WebDriver driver;
	
	By email = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");                   																																																																																																										
	By loginclick = By.name("commit");
	
	
	public LoginPageClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}


	public WebElement getEmail()
	{
		return driver.findElement(email);
		
	}
	
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement clickLogin()
	{
		return driver.findElement(loginclick);
	}
	
	
	
}
