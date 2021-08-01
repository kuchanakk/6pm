package testngpack;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assrt {
	
	
	@Test
	public static void fb() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String acttitle=driver.getTitle();
		String expectedtitle="Facebook – log in ";
		
		Assert.assertEquals(acttitle, expectedtitle);
		System.out.println("script after assert");
	
	
	}
	
	@Test
	public static void nexttest() {
		
		System.out.println("script in next test");
	}
	
	
	
	

}
