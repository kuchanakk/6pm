package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocExampl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		//****************ID**********************
		//driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		
		//******************Name*******************
		
		//driver.findElement(By.name("pass")).sendKeys("bhbh767");
		
		//****************Link Text******************
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//************P link text*****************
		
		//driver.findElement(By.partialLinkText("Create a")).click();
	
	// ****Find total links in fb page using Tagname*********
	//	int linksize=driver.findElements(By.tagName("a")).size();
	//	System.out.println(linksize);
		
		//int editsize=driver.findElements(By.className("inputtext")).size();
		//System.out.println(editsize);
	
		//*****************Xpath****************
		
	//	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kiarn@gmail.com");
		
	//******* css**********
		driver.findElement(By.cssSelector("#pass")).sendKeys("njnj878");
	
	
	}

}
