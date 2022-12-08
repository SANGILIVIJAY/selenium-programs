package demo125;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngjunit {
	 WebDriver driver;
	 public String title;
	 public String url;
	    @BeforeTest
	    public void beforetest() throws InterruptedException
	    {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	     }    
	    @Test(priority=0)
	    public void apple() throws InterruptedException
	    {
	     title= driver.getTitle();
	     Assert.assertEquals("vijay","vijay");
	    }
	    @Test(priority=1,dependsOnMethods ="apple",alwaysRun=true)
	    public void car() throws InterruptedException
	    {
	     url= driver.getCurrentUrl();
	    }
	    @Test(priority=2)
	    public void doll() throws InterruptedException
	    {
	     System.out.println(title+url);
	    }
	    @Test(priority=3)
	    public void eren() throws InterruptedException
	    {
	     System.out.println("user not exists");
	    }
	      @AfterTest
	      public void aftertest() throws InterruptedException
	      {
	       driver.close();    
	      }

}
