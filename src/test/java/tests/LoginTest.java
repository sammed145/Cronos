package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.Setup;


public class LoginTest 
{
	static WebDriver driver=new ChromeDriver();
	
	Setup s=new Setup(driver);
	
	@BeforeTest
	public void launch() 
	{
		driver.manage().window().maximize();
		driver.get(Setup.getdata("Login_Data", "url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(priority=1)
	public void login() throws InterruptedException 
	{	
		s.username(Setup.getdata("Login_Data", "username"));	Thread.sleep(1000);  
		s.next(); 												Thread.sleep(1000);
		s.password(Setup.getdata("Login_Data", "password"));
		s.facility(); 										
		s.terminate();										Thread.sleep(3000);
		s.signin(); 										Thread.sleep(10000);
		s.homepage();									    Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void logout() throws InterruptedException 
	{
		s.profile();  
		s.closeapp();										Thread.sleep(10000);
	}
	
	@AfterTest
	public void quit()
	{
		driver.quit();
	}
	
	
}
