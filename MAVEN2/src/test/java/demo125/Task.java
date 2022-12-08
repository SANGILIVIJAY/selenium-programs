package demo125;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task extends Javascript_util {
	WebDriver driver;
	public String url="http://automationpractice.com/index.php?controller=authentication&back=my-account";
	
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver=new ChromeDriver(options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() throws InterruptedException
	{
		
		WebElement email=driver.findElement(By.name("email"));
		Javascript_util.scrollIntoView(email, driver);	
		Javascript_util.passingValuesUsingJS(email, "SLN@gmail.com", driver);	
		WebElement pass=driver.findElement(By.name("passwd"));
		Javascript_util.passingValuesUsingJS(pass, "svpverse", driver);
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.name("SubmitLogin"));	
		Javascript_util.clickElementByJS(login, driver);
		Thread.sleep(3000);
	}
	@Test
	public void test2() throws InterruptedException
	{
		
		Thread.sleep(3000);
	    WebElement tshirt=	driver.findElement(By.xpath("//*[@title='T-shirts']"));
	    Javascript_util.clickElementByJS(tshirt, driver);
		WebElement cart=driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']"));	
		Javascript_util.scrollIntoView(cart, driver);
		Javascript_util.clickElementByJS(cart, driver);
		WebElement check=driver.findElement(By.xpath("//*[@title='Proceed to checkout']"));
		Javascript_util.clickElementByJS(check, driver);
		Thread.sleep(3000);
	    WebElement stock=driver.findElement(By.xpath("//*[@class='label label-success']"));
	    Javascript_util.scrollIntoView(stock, driver);
	    Javascript_util.drawBorder(stock, driver);
	    Thread.sleep(3000);
	}
	
}


