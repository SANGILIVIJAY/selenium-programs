package demo125;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_file extends Javascript_util {//INHERITANCE
	
           public String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		    WebDriver driver;
		    @BeforeTest
		    public void beforetest() throws InterruptedException
		    {
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    /*ChromeOptions option = new ChromeOptions();
		    option.setAcceptInsecureCerts(true);
		    driver = new ChromeDriver(option);*/
		    driver.get(url);
		    }
		    @Test()
		    public void vijay() throws InterruptedException,IOException
		    {
		    	  
		    	Thread.sleep(2000);	    
		    	WebElement web=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		    	//CHANGING THE COLOUR OF BACK GROUND
		    	 Test_file.changeColor("red", web, driver);
		    	 Test_file.flash(web, driver);
		    	 Thread.sleep(2000);
		    	 Test_file.drawBorder(web, driver);
				       
				      
		     }    
	

}
