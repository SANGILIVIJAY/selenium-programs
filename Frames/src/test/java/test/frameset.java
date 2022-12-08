package test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class frameset  {
public static String url="https://jqueryui.com/droppable/";
	
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		
		WebDriverManager.edgedriver().setup();	
		driver=new EdgeDriver();	
		driver.get(url);	
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void test() throws InterruptedException
	{	
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		driver.findElements(By.tagName("iframe")).size();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class='demo-frame']")));
		WebElement drag=driver.findElement(By.xpath("//*[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement drop=driver.findElement(By.xpath("//*[@class='ui-widget-header ui-droppable']"));
		act.dragAndDrop(drag, drop).build().perform();//building the method
		driver.switchTo().defaultContent();//going out of that frame
		driver.findElement(By.linkText("Accept")).click();
		driver.close();
	
	}
}






