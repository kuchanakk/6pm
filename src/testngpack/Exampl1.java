package testngpack;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exampl1 {
	
	@Test (priority =0)
	public static void login() {
		
		System.out.println("login script-----test");
		
	}
	
	
	
	@Test(priority =1)
	public static void inbox() {
		
		System.out.println("inbox script-----test");
	}
	
	@Test(priority =2)
	public static void cemail() {
		
		System.out.println("com email script-----test");
	}
	
	@BeforeTest
	public static void openbrowser() {
		System.out.println("open browser script-----beforetest");
		
	}
	
	@AfterTest
	public static void closebrowser() {
		System.out.println("close browser script-----Aftertest");
		
	}

	@BeforeMethod
	public static void beforemethod() {
		
		System.out.println("before method script");
	}
	
	@AfterMethod
	public static void Aftermethod() {
		
		System.out.println("after method script");
	}
	
}
