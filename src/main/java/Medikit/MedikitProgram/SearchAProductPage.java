package Medikit.MedikitProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchAProductPage
{

	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public SearchAProductPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
	
	@FindBy(xpath="//div[@class='wd-search-form wd-header-search-form wd-display-form whb-3dr2urezpqgndfjlfa22']/form/input")
	WebElement SearchText;
	
	@FindBy(xpath="//div[@class='wd-product wd-with-labels wd-hover-buttons-on-hover wd-col product-grid-item product type-product post-28750 status-publish instock product_cat-medikart-healthcare product_cat-wheelchair has-post-thumbnail sale shipping-taxable purchasable product-type-simple']")
	WebElement productSearch;
	
	public void SearchTextFeild()
	{
		wait.until(ExpectedConditions.elementToBeClickable(SearchText)).sendKeys("WheelChair"+Keys.ENTER);
	}
	public void WheelChair()
	{
		
		//wait.until(ExpectedConditions.visibilityOfAllElements(productSearch));
		productSearch.click();
		
	}
	
}
