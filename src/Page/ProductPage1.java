package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage1 {
	WebDriver driver;
	   
	By ohome=By.xpath("//*[@id=\"SiteNav\"]/li[1]/a/span");
	By oproduct=By.xpath("//*[@id=\"shopify-section-featured-collections\"]/div/ul/li[6]/div/a");   // Add your locators and methods for the product page here

    public ProductPage1(WebDriver driver) {
        this.driver = driver;
    }

    public void home()
	{
		driver.findElement(ohome).click();
	}

	public void product()
	{
		WebElement element=driver.findElement(oproduct);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}

}
