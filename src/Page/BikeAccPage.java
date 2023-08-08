package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BikeAccPage {
	WebDriver driver;
    By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	By ogloves=By.xpath("//*[@id=\"ProductSection-product-template\"]/div/div[1]/div[3]/ul/li[2]/a/img");
	By obike=By.xpath("//*[@id=\"SiteNav\"]/li[3]/button");
	By obikemaintain=By.xpath("//*[@id=\"SiteNavLabel-bike-accessories\"]/ul/li[6]/a");
	By osortby=By.xpath("//*[@id=\"SortBy\"]");
	By ospray=By.xpath("//*[@id=\"Collection\"]/ul/li[10]/div/a");
	
    public BikeAccPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}

   
	public void back()
	{
		driver.navigate().back();
		WebElement h=driver.findElement(ohome);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", h);
		h.click();
		
	}
	public void bikeacc()
	{
		driver.findElement(obike).click();
	}
	public void bikemantain()
	{
		driver.findElement(obikemaintain).click();
	}
	public void sortby()
	{
		WebElement r=driver.findElement(osortby);
		Select l=new Select(r);
		l.selectByIndex(4);
	}
	public void spray()
	{
		WebElement j=driver.findElement(ospray);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", j);
		j.click();
		
	}

}
