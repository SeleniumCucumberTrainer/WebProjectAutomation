package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import pages.LoginPage;
import pages.PaymentPage;

public class BaseWebPage {
	
	public WebDriver driver;
	public LoginPage loginPage;
	public PaymentPage paymentPage;
	
	
	@BeforeTest
	public void init(){
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC2\\Downloads\\seleniumjar\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://www.paypal.com/");
		 
		 loginPage = new LoginPage(driver);
		 paymentPage = new PaymentPage(driver);
		 
		 
		
	}
	

}
