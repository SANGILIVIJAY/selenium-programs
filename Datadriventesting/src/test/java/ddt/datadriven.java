package ddt;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class datadriven {
	
	WebDriver driver;
	@Test()
	public void t() throws IOException, InterruptedException {
WebDriverManager.chromedriver().setup();
//WebDriverManager.edgedriver().setup();
	driver = new ChromeDriver();
	//driver = new EdgeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
File excel = new File("C:\\Users\\User\\Desktop\\TRAINING\\ddt.xlsx");
FileInputStream fis = new FileInputStream(excel);
@SuppressWarnings("resource")
XSSFWorkbook no= new XSSFWorkbook(fis);
XSSFSheet sh = no.getSheet("Sheet1");
int rowcount=sh.getLastRowNum();
for (int i=0;i<rowcount;i++)
{
String user = sh.getRow(i).getCell(0).getStringCellValue();
System.out.println(user);	
String pass = sh.getRow(i).getCell(1).getStringCellValue();
System.out.println(pass);
Thread.sleep(2000);
driver.findElement(By.name("username")).sendKeys("user");
driver.findElement(By.name("password")).sendKeys("pass");
driver.findElement(By.xpath("//*[@type='submit']")).click();
String v=driver.getCurrentUrl();
   if(v.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")){
       driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']//p[1]"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
     }
   else {
	  driver.close();
}
  }
}
}
