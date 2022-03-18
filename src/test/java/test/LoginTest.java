package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest  {
	WebDriver driver;
@Test
public void validUserShouldBeAbleToLogin() {	
	// call class methode
	
	 	driver= BrowserFactory.init();
	 	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	 	loginPage.insertUserName("demo@techfios.com");
	 	loginPage.insertPassword("abc123");
	 	loginPage.clickSigninButton();
	 	DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
    	dashboard.verifyDashboardPage();
	 	
	 	BrowserFactory.tearDown();
	}
}
