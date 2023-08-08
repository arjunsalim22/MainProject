package Test;

import org.testng.annotations.Test;

import Page.ProductPage1;

public class ProductTest1 extends LoginTest1 {
	 @Test(priority=2)
	    public void testing2() throws InterruptedException {
	       
	        ProductPage1 ob=new ProductPage1(driver);
			Thread.sleep(5000);
			ob.home();
			Thread.sleep(4000);
			ob.product();
			Thread.sleep(4000);
	    }

}
