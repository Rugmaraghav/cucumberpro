package stepdefinitions1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepkg.Createpage;
import pagepkg.Loginpage;

public class CreatePagesteps  {
	WebDriver driver;
	Createpage cpage;
	String actualtitle;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		
	}
	
	@Given("user is on the create page")
	public void user_is_on_the_create_page() {
		cpage=new Createpage(driver);
		driver.get("https://www.facebook.com");
		cpage.createpageclick();
	  
	}

	@When("user get the title of the create page")
	public void user_get_the_title_of_the_create_page() {
		 actualtitle=cpage.Titleverification();
		
	   
	}

	@Then("succesfully validate the title of the create page")
	public void succesfully_validate_the_title_of_the_create_page() {
		Assert.assertEquals(actualtitle,"Facebook","title verified");
	}


}
