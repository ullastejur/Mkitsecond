package Medikit.MedikitProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Medikit_ProductSearch_testcase3 extends BaseClass
{

	
	@Test
	public void Searchproduct() 
	{
//		LoginPage lp= new LoginPage(driver);
//		lp.LoginBTN();
//		lp.CreateAccount();
//		lp.EmailTextfeild();
//		lp.RegisterButton();
//		
		SearchAProductPage SAP= new SearchAProductPage(driver);
		
		SAP.SearchTextFeild();
		SAP.WheelChair();
		Assert.assertEquals(driver.getTitle(), "Medikart Foldable Wheelchair Regular Capacity & Commode Use | Medikart HealthCare - India’s trustworthy online store for healthcare products");
	}
}
