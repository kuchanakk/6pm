package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgexampl2 {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void TestStart() {
		
		System.out.println("****TEST STARTED*****");
		
	}
	
	@BeforeMethod
	public static void openbrowser() {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		
		 driver = new FirefoxDriver();
		
	}
	
	@Test
	public static void amaz() {
		
		
		driver.get("http://www.amazon.in");
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public static void fb() {
		driver.get("http://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	
	
	@AfterTest
	public static void endtest() {
		
		System.out.println("****TEST END*****");
		
	}
	
	@AfterMethod
	public static void closebrowser() {
		
		 driver.close();
		
	}
	

}
