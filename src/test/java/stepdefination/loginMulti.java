package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hooks;

public class loginMulti {
	
	WebDriver driver=Hooks.getDriver();
	@When("User Enter username as{string}")
	public void user_enter_username_as(String uname) {
	
		driver.findElement(By.id("username")).sendKeys(uname);
		
	    	}

	@When("user Enter password as{string}")
	public void user_enter_password_as(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("user click on login Btn")
	public void user_click_on_login_btn() {
		 driver.findElement(By.id("submit")).click();
	}

	@Then("it should display loginsucessfullypage")
	public void it_should_display_loginsucessfullypage() {
	  System.out.println("naviagted");
	}


}
