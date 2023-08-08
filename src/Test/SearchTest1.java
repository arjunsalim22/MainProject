package Test;

import org.testng.annotations.Test;

import Page.SearchPage1;



public class SearchTest1 extends ProductTest1 {
	 @Test(priority=3)
	    public void testing3 () throws InterruptedException {
	        SearchPage1 ob = new SearchPage1(driver);
	        Thread.sleep(4000);
	        ob.selectitm();
	    	Thread.sleep(4000);
	    	ob.addtocart();
	    	Thread.sleep(4000);
	    	ob.quantity("11");
	    	Thread.sleep(4000);
	    	ob.checkout();
	    	Thread.sleep(4000);
	    	ob.returntocart();
	    	Thread.sleep(4000);
	    	ob.search();
	    	Thread.sleep(4000);
	    	ob.search1();
	    	Thread.sleep(4000);
	    	ob.glove();
	    	Thread.sleep(3000);

	    }

}
