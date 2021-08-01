package javapack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive27\\geckodriver.exe");
		//***launch firefox browser****
		WebDriver driver = new FirefoxDriver();
		//*** write facebook.com as url
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		WebElement dragitem=driver.findElement(By.id("draggable"));
		WebElement dropitem=driver.findElement(By.id("droptarget"));
		
		Actions ac = new Actions(driver);
		
		//ac.dragAndDrop(dragitem, dropitem).build().perform();
		ac.clickAndHold(dragitem).moveToElement(dropitem).release().build().perform();
	}

}
