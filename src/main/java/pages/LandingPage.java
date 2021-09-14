package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	By login = By.xpath("//a[text()='Login']");

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		System.out.println("helo");
	}


	public WebElement getLogin()
	{
		return driver.findElement(login);
	}


}
