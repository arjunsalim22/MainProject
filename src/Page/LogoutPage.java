package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	WebDriver driver;
    // Add your locators and methods for the cart page here
    By oadd=By.xpath("//button[@name=\"add\"]");
	By oremove=By.xpath("/html/body/div[3]/main/div/div/form/table/tbody/tr[1]/td[2]/p/a");
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a");
	By osettings=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/a[1]");
	By ologout=By.id("customer_logout_link");
	
	public LogoutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

    public void add() throws InterruptedException
	{
		driver.findElement(oadd).click();
		Thread.sleep(4000);
	}
	public void remove() throws InterruptedException
	{
		driver.findElement(oremove).click();
		Thread.sleep(4000);
	}
	public void home1() throws InterruptedException
	{
		driver.findElement(ohome).click();
		Thread.sleep(4000);
	}
	public void sign() throws InterruptedException
	{
		driver.findElement(osettings).click();
		Thread.sleep(4000);
		
	}
	public void logout() throws InterruptedException
	{
		driver.findElement(ologout).click();
		Thread.sleep(4000);
	}


}
