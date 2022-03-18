package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	//since unit method is static we need to define the variable as static
	// you can't call none static variable into static method 
	
	static WebDriver driver;
	static String browser = "chrome";
	static String url="http://www.techfios.com/billing/?ng=admin/";
	
	
	public static WebDriver init() {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver= (WebDriver) new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")){
//			   set up firefox
			System.setProperty("webdriver.gecko.driver","driver\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		

		
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}
}
