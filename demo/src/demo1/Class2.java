package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	
public static String vijay = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	public static void main (String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C://Users//User//Downloads//chromedriver_win321//chromedriver.exe" );
	    WebDriver driver=new ChromeDriver();
		driver.get(vijay);
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//driver.findElement(By.linkText("Add employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div/div/input/")).sendKeys("Add");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[3]")).click();
		//driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	    driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		Thread.sleep(2000);
		driver.quit();
	
	
}

	
}



		
		