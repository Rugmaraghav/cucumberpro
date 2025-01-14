package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpswd;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	public Loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setvalues(String username,String pswd)
	{
		fbemail.sendKeys(username);
		fbpswd.sendKeys(pswd);
	}
	
	public void loginclick()
	{
		fbloginbutton.click();
		
	}

}
