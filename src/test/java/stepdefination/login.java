package stepdefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hooks;

public class login  {
	
	public WebDriver driver=Hooks.getDriver();
	

	@When("user enter valid username")
	public void user_enter_valid_username() {
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("admin@yourstore.com");

	}

	@And("User Enter valid Password")
	public void User_Enter_valid_Password() {
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin");
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() {
	WebElement	btn=driver.findElement(By.xpath("//button[@type='submit']"));
	btn.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Then("it should naviagte to Dashboarboard page and Text should be Dashboard")
	public void it_should_naviagte_to_Dashboarboard_page() {
	String ActualValue	= driver.getTitle();
	String Expectedvalue="Dashboard / nopCommerce administration";
	Assert.assertEquals(Expectedvalue, ActualValue);
	}
	
	
	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("abc1234@yourstore.com");
	}

	@When("user enter invaid password")
	public void user_enter_invaid_password() {
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("admin12345");
	}

	@Then("it should throw an error message as invalid username and password")
	public void it_should_throw_an_error_message_as_invalid_username_and_password() {
    String ExpcetedValue="No customer account found";
   WebElement errormessage=driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]"));
	String actualValue=  errormessage.getText();
	Assert.assertEquals(ExpcetedValue, actualValue);
		
	}
	
	
	@Then("it should throw error message")
	public void it_should_throw_error_message() {
		
		String expected ="The credentials provided are incorrect";
WebElement errormessage=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/ul/li"));
      String actualvalue=errormessage.getText();
      Assert.assertEquals(expected, actualvalue);
	}
	
	
	@When("user keep username and password Fileds Empty")
	public void user_keep_username_and_password_Fileds_Empty() {
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
	}
	
	@Then("it should throw error message as please enter your email")
	public void it_should_throw_error_messageAs() {
		
	String expected="Please enter your email";
	String actual=driver.findElement(By.id("Email-error")).getText();
     Assert.assertEquals(expected, actual);
		
		
	}
	
	
	
//	@When("user click on cataloglink and  productspage link")
//	public void user_click_on_cataloglink_and_productspage_link() throws InterruptedException {
//		WebElement cataloglink = driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]"));
//		cataloglink.click();
//		WebElement productlink = driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]"));
//		productlink.click();
//		Thread.sleep(2000);
//	}
//
//	@Then("product page should be displayed")
//	public void product_page_should_be_displayed() {
//		String expectedPageTitle = "Products / nopCommerce administration";
//		String actualPageTitle = driver.getTitle();
//		Assert.assertEquals(expectedPageTitle, actualPageTitle);
//	}
//
//	@When("^user enter valid \"([^\"]*)\"$")
//	public void user_enter_valid_product_name(String Pname) {
//		driver.findElement(By.id("SearchProductName")).sendKeys(Pname);
//	}
//
//	@When("click on search button")
//	public void click_on_search_button() throws InterruptedException {
//		driver.findElement(By.id("search-products")).click();
//		Thread.sleep(2000);
//	}
//
//	
//	@Then("^particular product should be displayed as ([^\"]*) $")
//	public void particular_product_should_be_displayed(String Pname) {
//		String ExpectedProductname = Pname;
//		String ActualProductname = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
//        Assert.assertEquals(ExpectedProductname, ActualProductname);
//	}
	
//	@Then("It should throw some error message")
//	public void It_should_throw_some_error_message() {
//		String Expectederrormessage = "No data available in table";
//		String Actualerrormessage = driver.findElement(By.xpath("//tbody/tr/td")).getText();
//        Assert.assertEquals(Expectederrormessage, Actualerrormessage);
//		
//	}
//	@When("user enter invalid product name")
//	public void user_enter_invalid_product_name() {
//		driver.findElement(By.id("SearchProductName")).sendKeys("abc123");
//
//	}
}
