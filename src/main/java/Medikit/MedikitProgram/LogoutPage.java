package Medikit.MedikitProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LogoutPage

{
	
	WebDriver driver;
 
WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	public LogoutPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
	@FindBy(xpath="//div[@class='wd-header-my-account wd-tools-element wd-event-hover wd-with-username wd-design-7 wd-account-style-icon wd-with-wrap whb-d3rr7l2o7d965a6qvawk']")
    WebElement Account;
	
	@FindBy(xpath= "//div[@class='wd-dropdown wd-dropdown-menu wd-dropdown-my-account wd-design-default']/ul/li[7]/a/span")
	WebElement lbtn;
	
	@FindBy(xpath="//nav[@class='woocommerce-MyAccount-navigation']/ul/li[7]/a")
	WebElement lout;
	
	
	public void LogOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(lout)).click();
	}
	
   
	
}
