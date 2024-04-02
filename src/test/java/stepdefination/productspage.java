package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hooks;

public class productspage  {

	public WebDriver driver=Hooks.getDriver();
	@When("user click on cataloglink and  productspage link")
	public void user_click_on_cataloglink_and_productspage_link() throws InterruptedException {
		WebElement cataloglink = driver.findElement(By.xpath("//i[@class=\"nav-icon fas fa-book\"]"));
		cataloglink.click();
		WebElement productlink = driver.findElement(By.xpath("//a[@href=\"/Admin/Product/List\"]"));
		productlink.click();
		Thread.sleep(2000);
	}

	@Then("product page should be displayed")
	public void product_page_should_be_displayed() {
		String expectedPageTitle = "Products / nopCommerce administration";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}

	@When("^user enter valid\"([^\"]*)\"$")
	public void user_enter_valid_product_name(String Pname) {
		driver.findElement(By.id("SearchProductName")).sendKeys(Pname);
	}

	@When("click on search button")
	public void click_on_search_button() throws InterruptedException {
		driver.findElement(By.id("search-products")).click();
		Thread.sleep(2000);
	}

	
	@Then("^particular product should be displayed as\"([^\"]*)\"$")
	public void particular_product_should_be_displayed(String Pname) {
		String ExpectedProductname = Pname;
		String ActualProductname = driver.findElement(By.xpath("//table/tbody/tr/td[3]")).getText();
        Assert.assertEquals(ExpectedProductname, ActualProductname);
	}
	
	@Then("It should throw some error message")
	public void It_should_throw_some_error_message() {
		String Expectederrormessage = "No data available in table";
		String Actualerrormessage = driver.findElement(By.xpath("//tbody/tr/td")).getText();
        Assert.assertEquals(Expectederrormessage, Actualerrormessage);
		
	}
	@When("user enter invalid product name")
	public void user_enter_invalid_product_name() {
		driver.findElement(By.id("SearchProductName")).sendKeys("abc123");

	}
}
