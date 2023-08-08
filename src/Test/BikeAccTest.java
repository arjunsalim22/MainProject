package Test;

import org.testng.annotations.Test;

import Page.BikeAccPage;



public class BikeAccTest extends SearchTest1{
	@Test(priority=4)
    public void testing4() throws InterruptedException {
        BikeAccPage ob = new BikeAccPage(driver);
        
        
    	Thread.sleep(4000);
    	ob.back();
    	Thread.sleep(4000);
    	ob.bikeacc();
    	Thread.sleep(4000);
    	ob.bikemantain();
    	Thread.sleep(4000);
    	ob.sortby();
    	Thread.sleep(4000);
    	ob.spray();

    }

}
