package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
//constructor
	
	public DashboardPage(WebDriver driver) {
		this.driver= driver;
		
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2")WebElement Dashboard_header_element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a")WebElement CUSTOMER_MENU_element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a")WebElement ADD_CUSTOMER_MENU_element;

	public void verifyDashboardPage() {
		Assert.assertEquals(Dashboard_header_element.getText(), "Dashboard", "page not found");
	}
public void ClickUstomerMenuButton() {
	CUSTOMER_MENU_element.click();
}
public void clickAddCustomerMenuButton() {
	ADD_CUSTOMER_MENU_element.click();
}

}
