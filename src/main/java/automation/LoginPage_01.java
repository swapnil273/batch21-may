package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage_01 
{
	@FindBy(xpath="//input[contains(@type,'text')]")
	private WebElement userName;
	
	@FindBy(xpath="//span[contains(text(),'Next')]")
	private WebElement Next;
	
	
	@FindBy(xpath="//input[contains(@type,'password')]")
	private WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Log in')]")
	private WebElement Login;
	
	public LoginPage_01(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendUserName()
	{
		userName.sendKeys("swapnilgawali");
	}
	public void clickOnNextButton()
	{
		Next.click();
	}
	public void sendPassword()
	{
		password.sendKeys("swap@123#");
	}
	public void clickOnLoginButton()
	{
		Login.click();
	}
	
	
	

}
