package demo125;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junit {
	 WebDriver driver;
	 public String title;
	 public String url;
	    @Before
	    public void beforetest() throws InterruptedException
	    {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	     }    
	    @Test
	    public void vijay() throws InterruptedException
	    {
	     title= driver.getTitle();
	    }
	    @Test
	    public void vijay1() throws InterruptedException
	    {
	     url= driver.getCurrentUrl();
	    }
	      @After
	      public void aftertest() throws InterruptedException
	      {
	       driver.close();    
	      }

}
