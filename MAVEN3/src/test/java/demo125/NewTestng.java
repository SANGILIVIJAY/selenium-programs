package demo125;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestng {
	WebDriver driver;
	
  @Test(dataProvider = "master")
  public void f( String n, String s) throws InterruptedException {
	    Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(n);
		driver.findElement(By.name("password")).sendKeys(s);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
  }

  @DataProvider //we can run our code for multiple times
  public Object[][] master() {
    return new Object[][] {
      new Object[] {"Admin","admin123" },
      new Object[] { "Admin","admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	    
	   WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
  }

}
