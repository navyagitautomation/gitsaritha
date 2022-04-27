package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class redifrepository {
/*	WebDriver driver;
	
	
	public redifrepository(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Username=By.xpath("//*[@id=\"login1\"]");
	
	*/

	//PAGE FACORY
	WebDriver driver;
	public  redifrepository (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
		
		@FindBy(xpath="//*[@id='login1']")
		WebElement emailid;
		@FindBy(xpath="//*[@id=\"password\"]")
		WebElement password;
		
		public WebElement emailid()
		{
			return emailid;
		}
		public WebElement password()
		{
			return password;
		}
		
		
		}
