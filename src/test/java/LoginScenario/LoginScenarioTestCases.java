package LoginScenario;

import org.testng.annotations.Test;

import baseClass.BaseWebPage;

public class LoginScenarioTestCases extends BaseWebPage{
	
	@Test
	public void TC_01_VerifyLoginWithInvalidCredential(){
		
	   loginPage.loginPaypalWithInvalid("8834534543534");
		
	}
	
	@Test
	public void TC_02_VerifyLoginWithValidCredential(){
		
	   //loginPage.loginPaypal();
		
	}
	
	@Test
	public void TC_03_VerifySignUp(){
		
	   //loginPage.loginPaypal();
		
	}
	@Test
	public void TC_04_VerifySign(){
		
	   //loginPage.loginPaypal();
		
	}
	
	

}
