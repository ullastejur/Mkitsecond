package Medikit.MedikitProgram;

import java.time.Duration;
import org.testng.annotations;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

public class LoginPage 

{
	private static final int Max = 0;

	private static final int Min = 0;

	public static WebDriver driver;
	public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
    @FindBy(xpath="//div[@class='whb-main-header']/div[2]/div/div/div[3]/div[3]/a/span/span[2]")
	WebElement LoginIcon;
	
    @FindBy(xpath="//a[.='Create an Account']")
    WebElement CreateAcc;
    
    @FindBy(xpath="//input[@id='reg_email']")
    WebElement Emailtext;
    
    @FindBy(xpath="//button[@value='Register'] |//a[@class='btn wd-switch-to-register']")
    WebElement Registerbtn;
    
    public void RegisterButton() 
    {
    	wait.until(ExpectedConditions.elementToBeClickable(Registerbtn)).click();
    }
  
   
    public void EmailTextfeild()
    {
    	int randomValue =  (int) (Math.random()*9000)+1000; 
        String fileName = "ullastsark" + randomValue + "@gmail.com";
        
    	Emailtext.sendKeys(fileName);
    }
    
    public void LoginBTN()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(LoginIcon)).click();
    }
    
    public void CreateAccount()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(CreateAcc)).click();
    }
    
    
}
