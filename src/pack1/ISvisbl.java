package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ISvisbl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive27\\geckodriver.exe");
		//***launch firefox browser****
		WebDriver driver = new FirefoxDriver();
		//*** write facebook.com as url
		driver.get("https://www.spicejet.com/");
		/*
		 * boolean
		 * before=driver.findElement(By.id("ctl00_mainContent_ddl_originStation2_CTXT"))
		 * .isDisplayed(); System.out.println(before);
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_2")).click(); boolean
		 * after=driver.findElement(By.id("ctl00_mainContent_ddl_originStation2_CTXT")).
		 * isDisplayed(); System.out.println(after);
		 */
		
		boolean ff=driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		
		if(ff==false) {
			
			
			driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
			
			
		}
		

	}

}
