package hachion.navyamaven;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import repository.redifrepository;

public class rediffloginTest {

	@Test
	public void redifflogintest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbnav\\Documents\\javaselenium\\driverchrome\\chromedriver.exe");
	
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		redifrepository r=new redifrepository(driver);
		r.emailid().sendKeys("Aaa");
		r.password().sendKeys("aqww");
		
		
	//	r.emailid().sendKeys("Navya");
		
		
	}
/*
	@Test
	public void rediffpagefactorytest()
	{
		
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbnav\\Documents\\javaselenium\\driverchrome\\chromedriver.exe");
	
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		redifrepository r=new redifrepository(driver);
		
		r.emailid().sendKeys("Navya");
		
		
	}
*/	
}
