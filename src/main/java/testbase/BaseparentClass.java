package testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseparentClass {


	public static WebDriver driver;  // we are making it global by saying it 'static' to use anywhere.
	public static Properties prop;
	
//	this is constructor - naming is same as class
	public BaseparentClass() {
		
		
		//to read the properties file we have to create an object.
		//In Java, we have a class named Properties
		
		try {
			prop = new Properties();
			
			FileInputStream ip = new FileInputStream("D:\\Selenium Stuff\\E2EProject\\src\\main\\java\\configFiles\\configFiles.properties");		
			
			prop.load(ip);
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	//in this INitialization method we are calling or reading the properties file
	public static WebDriver initialization() {
		
		String browserName = prop.getProperty("browser");  //it gives string variable so, we are storing it in string 
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromeDriverPath"));
			driver = new ChromeDriver(); //launch chrome // here WebDriver is the Interface and ChromeDriver is a Class.
			
			
				
		}else if(browserName.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxDriverPath"));
			driver = new FirefoxDriver();
		}else {
			System.out.println("Enter the browser name correctly");
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// press ctrl + mouse over on page load time out - to go to the main declaration page
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
		
		
	}
	

	
	


}





	
	
	

	
	
	
	
	
	
	
	




