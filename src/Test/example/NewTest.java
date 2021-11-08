package example;		

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://localhost:8080/rps/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("DevOps")); 		
		}	
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	