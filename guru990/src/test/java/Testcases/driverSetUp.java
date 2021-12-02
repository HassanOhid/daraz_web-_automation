package Testcases;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetUp {

	public static WebDriver driver ;	
	public static WebElement element ;
	
	
	@BeforeSuite
	public static void setup() {
		 System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe" );
		 driver = new ChromeDriver();
	}
	
	
	
	@AfterSuite
	public static void end() {
			driver.close();	
	}
	
	
	
	
	
}
