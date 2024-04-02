package myhooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	public static WebDriver driver;
	
	@Before
	public void launchbrowser() {
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	@After
	public void closeBrowser() {
		driver.close();
	}
	
	public  static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeStep
	public void BS() {
		System.out.println("Hi");
	}
	@AfterStep
	public void AS() {
		System.out.println("Bye");
	}
}
