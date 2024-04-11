package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createpage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpagelink;
	
	
	public Createpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void createpageclick()
	{
		createpagelink.click();
	}
	
	public String Titleverification()
	{
		return driver.getTitle();
		
	}
}
