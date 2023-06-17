package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{


	@FindBy(xpath="//input[contains(@type,'text')]")
	private WebElement userName;
	
	@FindBy (xpath="//span[contains(text(),'Next')]")
	private WebElement Next;
	
	@FindBy(xpath="")
	private WebElement Password;
	
	@FindBy(xpath="")
	private WebElement Login;
	
/*	@FindBy(xpath="")
	private WebElement t;

*/	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void verifyAdminTab()
	{
		userName.isDisplayed();
		System.out.println(userName.isDisplayed());
	}
	public void verifyNextTab()
	{
		Next.isDisplayed();
		System.out.println(Next.isDisplayed());
	}
	public void verifyPassword()
	{
		Password.sendKeys("@swap@123#");
	}
	
	public void verifyLoginButton()
	{
	Login.click();
	}

	System.out.println("This is the filr for pulled");

	
}
