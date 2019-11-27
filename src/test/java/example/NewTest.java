package example;		

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		 
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {	
	static WebDriver driver;
		
                /*@Test	
                public void buttonTest(){ 
                   driver.get("http://localhost:5050/GameofLife/");
                   System.out.println("before getting id");
                  String startgametitle= driver.findElement(By.id("titleName")).getText();
                  Assert.assertEquals(startgametitle, "Welcome to Conway's Game Of Life!");
                }*/
               /* @Test	
                public void startgameTest(){ 
                   driver.get("http://localhost:5050/GameofLife/");
                   System.out.println("before getting id");
                  String startgame = driver.findElement(By.id("startgame")).getText();
                  Assert.assertEquals(startgame, "Start Game");
                }*/
		@BeforeTest
		public void beforeTest() { 	
		    driver = new FirefoxDriver();  
		}	
		
		@Test				
		public void urlTest() {  
			driver.get("http://localhost:5050/GamofLife/");  
			String currentUrl =driver.getCurrentUrl();
			Assert.assertTrue(currentUrl.contains("http://localhost:5050/GamofLife/")); 		
		}
                @Test	
                public void titleCheck(){  
                  driver.get("http://localhost:5050/GameofLife/");
                   String title=driver.getTitle();
                   Assert.assertEquals(title, "The Game Of Life");
                }
                
                
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	
