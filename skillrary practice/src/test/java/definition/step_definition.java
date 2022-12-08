package definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_definition {
	public  String url="https://demoapp.skillrary.com/login.php?type=login";
	WebDriver driver;
		
		@Given("I should go to the login page")
		public void i_should_go_to_the_login_page() {
			    WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(url);
			
		}
		@When("Enter the username {string}")
		public void enter_the_username(String string) {
			driver.findElement(By.name("email")).sendKeys(string);
		}
		@And("Enter the password {string}")
		public void enter_the_password(String string) {
			driver.findElement(By.name("password")).sendKeys(string);
		}
		@And("Click on the login button")
		public void click_on_the_login_button() {
			driver.findElement(By.xpath("//*[@id='last']")).click();
		}
		@Then("I should see the username as {string}")
		public void i_should_see_the_username_as(String string) {
			String k= driver.getTitle();
			  Assert.assertEquals(string, k);
		}
		@And("Click on the username")
		public void click_on_the_username() {
			driver.findElement(By.xpath("//a[@class='dropdown-toggle']//img[1]")).click();
		}
		@And("Click on the signout")
		public void click_on_the_signout() {
			driver.findElement(By.linkText("Sign out")).click();
		}
		@Then("I should go skillrary homepage as {string}")
		public void i_should_go_skillrary_homepage_as(String string) {
			String k= driver.getTitle();
			  Assert.assertEquals(string, k);
		}
	
	}







