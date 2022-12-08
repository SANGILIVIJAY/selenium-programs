package demo125;

import org.testng.annotations.Test;

public class Groups {

	
	

	
	    @Test(priority=1,groups={"smoke"})
	    public void tc1() throws InterruptedException
	    {
	     System.out.println("This is my first smoke testing");
	    }
	    @Test(priority=1,groups={"Regression"})
	    public void tc2() throws InterruptedException
	    {
	     System.out.println("This is my first Regression testing");
	    }
	    @Test(priority=2,groups={"smoke"})
	    public void tc3() throws InterruptedException
	    {
	     System.out.println("This is my second smoke testing");
	    }
	   
	    @Test(priority=2,groups={"Regression"})
	    public void tc4() throws InterruptedException
	    {
	     System.out.println("This is my second Regression testing");
	    }
	     


}
