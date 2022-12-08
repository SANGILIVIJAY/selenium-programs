package demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
//import org.openqa.selenium.safari.SafariDriver.WindowType;

public class Class3 {
	public static String vijay = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url = "https://www.youtube.com/";
	
	public static void main (String[]args) throws InterruptedException{
		
	System.setProperty("webdriver.chrome.driver", "C://Users//User//Downloads//chromedriver_win321//chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().window().fullscreen();
	driver.get(vijay);
	Thread.sleep(2000);
	/*String beforelogin=driver.getTitle();
	WebElement username =findElement(By.name("username"));
	username.sendKeys("Admin");*/
	//ADMIN
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	//LOGIN
	/*WebElement username =driver.findElement(By.xpath("//*[@placeholder='Username']"));
	if(username.isEnabled())
	username. sendKeys("Admin"); 
	 Thread.sleep(3000);
	if(username. isDisplayed ( )
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
    WebElement click=driver.findElement(By.xpath("//*[@type='submit']"));
    click.click();
	Thread.sleep(2000);*/
	/*driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	Thread.sleep(2000);
	List<WebElement>ch=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
	System.out.println("list size" +ch.size());
	/*for(int i=0;i<ch.size();i++) {
		ch.get(i).click();
		Thread.sleep(2000);
		
	}*/
	/*driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
	System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).getText());
    Thread.sleep(2000);
	driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(3).click();
	Thread.sleep(2000);
	driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(3).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	Thread.sleep(4000);*/
   
	//Actions:
	//1.Keyboard Actions 
	//2.Mouse over Actions 
	//3.Scroll up or down 
	/*Actions act = new Actions (driver);
	WebElement ele=driver.findElement(By.xpath("//*([@class='oxd-select-text-input']"));
    act.click(ele).build().perform();
	act.sendKeys(ele).click().build().perform();
	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	act.sendKeys(ele,Keys.ENTER).click().build().perform();
	act.moveToelement(driver.findElement(By.xpath("//*[@type='submit']")).click());
	act.context.click().perform();
	Thread.sleep(3000);
	
	/*driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("vijay");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(2000);
	//PIM
	driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[2]")).click();
	driver.findElement(By.linkText("Job Titles")).click();
	Thread.sleep(2000);

	String afterlogin=driver.getTitle();
	if(beforelogin.equals(afterlogin)) {
		System.out.println("logout from page");
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		
	}
	else {
		System.out.println("title is not same");
	}
	
	
	
 }

	/*private static WebElement findElement(By name) {
		// TODO Auto-generated method stub
		return null;
	}*/
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("total no of links" +links.size());
	for(int i=0;i<links.size();i++) {
		System.out.println(links.get(i).getText());
		System.out.println(links.get(i).getAttribute("href"));

		
	}
	//WINDOW HANDLING
	driver.getWindowHandle();
	//OPENS A NEW TAB AND SWITCHes TO NEW TAB
	driver.switchTo().window(WindowType.TAB);
	//NAV TO NEW TAB AND OPENS A NEW LINK
	driver.navigate().to(url);
	
	
	}
}


