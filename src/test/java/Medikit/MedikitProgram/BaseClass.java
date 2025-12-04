package Medikit.MedikitProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{

	public static WebDriver driver;
	
@BeforeMethod
public void launchbrowser() throws InterruptedException
{
	
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--start-Maximized");
	driver= new ChromeDriver(co);
	
	 driver.get("https://medikart.co.in/");
	// driver.manage().window().maximize();
	 
	// driver.navigate().refresh();
	 
	 
}
@AfterMethod
public void quitbrowser()
{
	driver.quit();
}
}


