package demo125;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class extent_invocation {


	public class HRM {
		public String vijay="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	    WebDriver driver;
	 // initialize the HtmlReporter
	    ExtentHtmlReporter htmlReporter; 
	 // initialize ExtentReports and attach the HtmlReporter
	    ExtentReports extent;
	 // creating tests
	    ExtentTest test;
	   

	    @BeforeTest
	    public void beforetest() throws InterruptedException
	    {
	    htmlReporter = new ExtentHtmlReporter("extent.html");
	    extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get(vijay);
	     }    
	    @Test(enabled=true,priority = 0,invocationCount = 0)//run 3 times
	    public void vijay() throws InterruptedException
	    {
	    	SoftAssert something =new SoftAssert();//if it fails also means test will run
	    	test =extent.createTest("This is my first test");
	    	String afterlogin=driver.getTitle();
	    	System.out.println("after login");
	    	something.assertEquals(afterlogin,vijay);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    test.pass("user entered the user name");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    test.info("page is visible");
	    }
	    @Test(enabled=true,priority=1,invocationTimeOut = 15000)//setting time
	    public void vijay2() throws InterruptedException
	    {    
	     List <WebElement> list = driver.findElements(By.tagName("a"));
	     System.out.println("total links in the hrm :  "+ list.size());
	    
	     }
	     /*Test(enabled=true,priority = 2)
	      public void vijay3() throws InterruptedException
	     {
	     driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(8).click();
	     driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(8).click();    
	     driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();    
	     Thread.sleep(3000);
	     }*/
	      @AfterTest
	      public void aftertest() throws InterruptedException
	      {
	       driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
	       driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
	       Thread.sleep(3000);
	       driver.close();    
	       extent.flush();
	      }

}
}


