package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isenabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive27\\geckodriver.exe");
		//***launch firefox browser****
		WebDriver driver = new FirefoxDriver();
		//*** write facebook.com as url
		driver.get("http://advantageonlineshopping.com/#/");
		Thread.sleep(10000);
		driver.findElement(By.id("menuUser")).click();
		
		boolean before=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();

		System.out.println(before);
		driver.findElement(By.name("username")).sendKeys("kiramk");
		driver.findElement(By.name("password")).sendKeys("jnj8787");
		
		boolean after=driver.findElement(By.id("sign_in_btnundefined")).isEnabled();
		System.out.println(after);

	
	}

}
