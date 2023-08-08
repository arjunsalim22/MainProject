package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SearchPage1 {
	 WebDriver driver;
	    // Add your locators and methods for the search page here
	    By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
		By oproduct=By.xpath("//*[@id=\"shopify-section-featured-collections\"]/div/ul/li[6]/div/a");
		By oselect=By.xpath("//*[@id=\"SingleOptionSelector-0\"]");
		By oaddtocart=By.xpath("//*[@id=\"product_form_6551701127266\"]/div[3]/button");
		By q=By.xpath("/html/body/div[3]/main/div/div/form/table/tbody/tr[1]/td[4]/div");
		By oquantity=By.xpath("//*[@id=\"updates_large_39296761167970:8229dc82976acf4a6a31792689c4520d\"]");
		By ocheckout=By.xpath("//*[@id=\"shopify-section-cart-template\"]/div/form/div/div/div/div[3]/input[2]");
		By oreturn=By.xpath("//*[@id=\"app\"]/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div/div/nav/div/ol/div[1]/li/span[1]/a");
		By osearch=By.xpath("//*[@id=\"shopify-section-header\"]/div/header/div/div[2]/div/div");
		By osearching=By.xpath("//*[@id=\"SearchInput\"]");
		By oglove=By.xpath("//*[@id=\"MainContent\"]/ul[1]/li[8]/div/a");

	    public SearchPage1(WebDriver driver) {
			// TODO Auto-generated constructor stub
	    	this.driver=driver;
		}

		public void selectitm()
		{
			WebElement bb=driver.findElement(oselect);
			Select s= new Select(bb);
			s.selectByIndex(12);
		}
		public void addtocart()
		{
			driver.findElement(oaddtocart).click();
		}
		public void quantity(String s) throws InterruptedException
		{
			Actions act=new Actions(driver);
			WebElement f=driver.findElement(q);
			act.moveToElement(f).perform();
			f.click();
			Thread.sleep(4000);		
			WebElement e=driver.findElement(oquantity);
			e.clear();
			Thread.sleep(4000);
			e.sendKeys(s);
		}
		public void checkout()
		{
			driver.findElement(ocheckout).click();
		}
		public void returntocart()
		{
			driver.findElement(oreturn).click();
		}
		public void search() throws InterruptedException
		{
			Thread.sleep(4000);
			 WebElement g=driver.findElement(osearch);
				Actions act=new Actions(driver);
				act.doubleClick(g).perform();
				 
		}
		public void search1() throws InterruptedException
		{
			 Thread.sleep(4000);
			    WebElement f=driver.findElement(osearching);
				Thread.sleep(4000);
				f.sendKeys("gloves");
				Thread.sleep(4000);
				f.sendKeys(Keys.RETURN);
				Thread.sleep(4000);
		}
		public void glove()
		{
			WebElement l=driver.findElement(oglove);
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", l);
			l.click();
			
		}

}
