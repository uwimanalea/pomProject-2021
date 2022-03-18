package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomerPage  extends BasePage{

	WebDriver driver;
	public  AddCustomerPage(WebDriver driver) {
		
	this.driver= driver;
	
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement add_contact_header_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")WebElement FULLNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]")WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")WebElement EMAIL_ELEMENT;
	
	public void verifyaddcontactPage() {
		waitForElememt(driver,5,add_contact_header_ELEMENT);
		
		Assert.assertEquals(add_contact_header_ELEMENT.getText(), "Add Contact","wrong page");
	}
	
	
	public void insertFullName(String fullname) {
		String insertedName=fullname+generateRandom(999);
		FULLNAME_ELEMENT.sendKeys(insertedName);	
	}
	
	public void selectCompanyDropDown(String company) {
	SelectFromDropdown(COMPANY_ELEMENT, company);
	}	
}