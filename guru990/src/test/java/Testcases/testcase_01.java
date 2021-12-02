package Testcases;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
 

public class testcase_01 extends driverSetUp {	
 public static String baseurl="https://www.daraz.com.bd";
 
 @Test
 public static void selection() throws InterruptedException  {
	  
	 driver.get(baseurl);
	 
	 driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
 
	 driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("01991045835");
	  Thread.sleep(2000);
	 driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("kkkkkkkk");
	  Thread.sleep(2000);
	  driver.findElement( By.xpath("//button[contains(text(),'LOGIN')]")).click();
	  
	  
 }
	 
}
