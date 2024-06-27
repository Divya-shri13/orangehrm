package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Page.LoginPage;

public class LoginTest extends BaseTest{
	@Test
	
	

	
	
	public void Login() throws InterruptedException {
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage();
		Thread.sleep(5000);
		lp.clickLogin1();
		lp.enterEmail("divya.redroses9@gmail.com");
		lp.enterPassword("Divya@27");
		
		lp.clickLogin1();
		
		
	}
	

}
