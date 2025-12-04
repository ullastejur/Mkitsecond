package Medikit.MedikitProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MediKit_Logout_Testcase2 extends BaseClass

{
@Test()
public void Logoot()
{
	LoginPage lp= new LoginPage(driver);
	lp.LoginBTN();
	lp.CreateAccount();
	lp.EmailTextfeild();
	lp.RegisterButton();
	Assert.assertEquals(driver.getTitle(), "My Account | Medikart HealthCare - India’s trustworthy online store for healthcare products");
	
    LogoutPage Lo= new LogoutPage(driver);
	Lo.LogOut();
	Assert.assertEquals(driver.getTitle(), "Medikart HealthCare - India’s trustworthy online store for healthcare products");
	Assert.assertEquals(driver.getCurrentUrl(), "https://medikart.co.in/");
	//Lo.logout();
}
}
	
