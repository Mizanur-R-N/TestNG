package SeleniumTestNG;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class FacebookFirstTestNG {
	
	public String baseUrl = "https://facebook.com";
    String driverPath = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
  
    @BeforeTest
    public void setBrowser() {
    	
    	System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }
    
    @Test
    public void verifyHomepageTitle() {
        
        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        
    }
    
    @AfterTest
    public void exit() {
    	
    	driver.close();
    }
}
