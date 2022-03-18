package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomeTest {
WebDriver driver;

@Test
public void validUserShouldbeCreateCustomer() {
driver = BrowserFactory.init();	
LoginPage login = PageFactory.initElements(driver, LoginPage.class);
login.insertUserName("demo@techfios.com");
login.insertPassword("abc123");
login.clickSigninButton();

DashboardPage dashboardPage= PageFactory.initElements(driver, DashboardPage.class);
dashboardPage.verifyDashboardPage();
dashboardPage.ClickUstomerMenuButton();
dashboardPage.clickAddCustomerMenuButton();

AddCustomerPage addcustomerPage = PageFactory.initElements(driver, AddCustomerPage.class);
addcustomerPage.verifyaddcontactPage();
addcustomerPage.insertFullName("selenium osctober");
addcustomerPage.selectCompanyDropDown("Techfios");
}
}
