package Medikit.MedikitProgram;

import  org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Ilisteners.class)
public class Medikit_Login_TestCase_1 extends BaseClass
{
	
	
	
@Test()
public void registratioForm()
{
	
	
	LoginPage lp= new LoginPage(driver);
	lp.LoginBTN();
	lp.CreateAccount();
	lp.EmailTextfeild();
	lp.RegisterButton();
	
	
	
	
}
}
