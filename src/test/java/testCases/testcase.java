package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class testcase {
	public static Logger log = LogManager.getLogger(HomePageTest.class.getName());     

	@Test
	public void Test1(){
		System.out.println("Test1 method from 1stTest class");
	}
	@Test
	public void Test2(){
		//System.out.println("Test2 method from 1stTest class");
		log.info("Test2 method from 1stTest class");
	}
	
	
}

