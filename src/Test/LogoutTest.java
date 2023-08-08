package Test;

import org.testng.annotations.Test;

import Page.LogoutPage;



public class LogoutTest extends BikeAccTest {
	 @Test(priority=5)
	    public void testing5 () throws InterruptedException {
	      LogoutPage ob = new LogoutPage(driver);
	      Thread.sleep(4000);
	      ob.add();
	    	Thread.sleep(4000);
	    	ob.remove();
	    	Thread.sleep(4000);
	      
	      Thread.sleep(4000);
	    	ob.home1();
	    	Thread.sleep(4000);
	    	ob.sign();
	    	Thread.sleep(4000);
	    	ob.logout();
	    	Thread.sleep(4000);

	    }

}
