package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	
	@CucumberOptions (features= {"src/test/resources/Login/Login.feature"},glue={"definition"})
	public class test_runner extends AbstractTestNGCucumberTests {
	}