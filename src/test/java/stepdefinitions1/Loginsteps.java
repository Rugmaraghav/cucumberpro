package stepdefinitions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepkg.Loginpage;

public class Loginsteps {
	WebDriver driver;
	Loginpage loginpage;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println(driver);
		loginpage=new Loginpage(driver);
		driver.get("https://www.facebook.com");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
	   loginpage.setvalues("abc@gmail.com", "abc123");
		
	}

	@And("click login button")
	public void click_login_button() {
	   loginpage.loginclick();
	}

	@Then("user is naviagted to the home page")
	public void user_is_naviagted_to_the_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com","valid login");
	}



}
