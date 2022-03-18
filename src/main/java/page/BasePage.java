package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

public int generateRandom(int bounderyNum) {
	Random rnd = new Random();
	int generatedNum= rnd.nextInt(bounderyNum);
	return generatedNum;
	
}
public void SelectFromDropdown(WebElement webElement, String visibleText) {
	Select sel = new Select(webElement);
	sel.selectByVisibleText(visibleText);
}
public void waitForElememt(WebDriver driver, int timeInSeconds, WebElement webElement) {
	WebDriverWait wait= new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOf(webElement));

}
}
