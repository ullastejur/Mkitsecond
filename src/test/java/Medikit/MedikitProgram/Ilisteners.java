package Medikit.MedikitProgram;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;



public class Ilisteners implements ITestListener
{
	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		//String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(newDate());
		double randomValue = Math.random(); 
        String fileName = "Screenshot_" + result.getName() + "_" + randomValue + ".png";

        Medikit_Login_TestCase_1 MK1= new Medikit_Login_TestCase_1();
		
		Reporter.log("Test case is passed");
		TakesScreenshot s= (TakesScreenshot) MK1.driver;
		File c=s.getScreenshotAs(OutputType.FILE);
		File d= new File("C:\\Users\\ullas\\eclipse-workspace\\MedikitProgram\\MediKart_Screenshots\\Fail\\"+ fileName);
		try {
			FileHandler.copy(c, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		
		//String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(newDate());
		double randomValue = Math.random(); 
        String fileName = "Screenshot_" + result.getName() + "_" + randomValue + ".png";

		
        Medikit_Login_TestCase_1 MK1= new Medikit_Login_TestCase_1();
		Reporter.log("Test case is Failed");
		TakesScreenshot s= (TakesScreenshot) MK1.driver ;
		File c= s.getScreenshotAs(OutputType.FILE);
		File d=new File("C:\\Users\\ullas\\eclipse-workspace\\MedikitProgram\\MediKart_Screenshots\\Pass\\"+ fileName);
		try {
			FileHandler.copy(c, d);
		} catch (IOException e) {
			// TODO Auto-generated catch block 
			e.printStackTrace();
		}
}
	
}