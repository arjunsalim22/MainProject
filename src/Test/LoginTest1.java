package Test;

import org.testng.annotations.Test;

import Page.LoginPage1;

public class LoginTest1 extends BaseClass{
	@Test(priority=1)
    
	public void testing1() throws InterruptedException {
		LoginPage1 ob=new LoginPage1(driver);
		Thread.sleep(4000);
		ob.sign();
		Thread.sleep(4000);
		ob.setvalues("arjunpsalim22@gmail.com", "Arjunsalim@1234");
		Thread.sleep(4000);
		ob.clickbtn();
		Thread.sleep(4000);
	}

}
