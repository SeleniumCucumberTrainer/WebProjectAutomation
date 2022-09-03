package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	
	@FindBy(xpath="//div[@class='header-buttons']/div/a[@id='ul-btn']")
	public WebElement loginButton;
	
	@FindBy(name="btnNext")
	public WebElement Next;
	
	@FindBy(id= "email")
	public WebElement emailOrMobileEle;
	
	@FindBy(xpath="(//div[@id='loginSection']/div/p)[1]")
	public WebElement errorMsg;
	
	
	
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	public void loginPaypalWithInvalid(String mobile){
		
		loginButton.click();
		
		//dobElmenet.sendKeys(07/09/1988);	
		System.out.println("Hi Login");
		
		emailOrMobileEle.sendKeys(mobile);
		
		Next.click();
		
		String errorMessage = errorMsg.getText();
		
		if(!errorMessage.isEmpty()){
			Assert.assertTrue(false);
		}
		else{
			Assert.assertTrue(true);
		}
		
		
		
		
	}
	
public void loginPaypalWithValid(){
		
		loginButton.click();
		
		//dobElmenet.sendKeys(07/09/1988);	
		System.out.println("Hi Login");
		//userId
		//password
		Next.click();
		
	}

}
