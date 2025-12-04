package Medikit.MedikitProgram;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ilisteners.class)
public class Medikit_Login_TestCase_1 extends BaseClass
{
	
	
	
@Test()
public <Assertion> void registratioForm()
{
	
	
	LoginPage lp= new LoginPage(driver);
	lp.LoginBTN();
	lp.CreateAccount();
	lp.EmailTextfeild();
	lp.RegisterButton();
	
	Assert.assertEquals(driver.getTitle(), "My Account | Medikart HealthCare - India’s trustworthy online store for healthcare products");
	
	
}
}
