package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import pageElements.LoginPage;


public class Setup extends LoginPage
{
	// Declare the WebDriver as public and static
	public static WebDriver driver;
	
	// Create constructor of class by creating WebDriver reference variable
	public Setup(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	

	// Reading data from property file
	public static String getdata(String File, String key) 
	{
		Properties prop = new Properties();
		Object  value="";
		FileInputStream fis;
		
		try 
		{
			fis = new FileInputStream(System.getProperty("user.dir") + "/Test_Data/"+File + ".properties");
			prop.load(fis);
			value = prop.get(key);
		} 
		catch (FileNotFoundException e) 
		{
			
		}
		catch (IOException e) 
		{
			
		}
		return (String) value;
	}
	
	// Capturing Screenshot and storing
	public void screenshot(String filename)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\Users\\sammed.khurpe\\Desktop\\Proof\\"+filename+".jpg");
		try 
		{
			FileUtils.copyFile(source, target);
		} 
		catch (IOException e) 
		{
			
		}
	}
	
	public void username(String username) 
	{
		if(Username.isDisplayed())
		{
			if(Username.isEnabled())
				{
					Username.sendKeys(username);
					System.out.println("Entered Username= "+username);
				}
			else
			{
				System.out.println("Failed: Username field is not enabled..");
			}
		}
		else
		{
			System.out.println("Failed: Username field is not displayed....");
		}
	}
	
	public void next()
	{
		if(Next.isDisplayed())
		{
			if(Next.isEnabled())
			{
				Next.click();
				System.out.println("Clicked NEXT");
			}
			else
			{
				System.out.println("Failed: Next button is not enabled..");
			}
		}
		else
		{
			System.out.println("Failed: Next button is not displayed...");
		}
	}

	public void password(String pwd)
	{
		if(Password.isDisplayed())
			{
				if(Password.isEnabled())
				{
					Password.sendKeys(pwd);
					System.out.println("Entered Password= "+pwd);
				}
				else 
				{
					System.out.println("Failed: Password field is not enabled..");
				}
			}
		else 
		{
			System.out.println("Failed: Password field is not displayed...");
		}
	}
	
	public void facility()
	{
		if(Facility.isDisplayed())
		{
				if(Facility.isEnabled())
				{	
						Facility.click();
						driver.findElement(By.id("select_option_8")).click();
						System.out.println("Selected Facility= Facility-1");
				}
				else
				{
					System.out.println("Failed: Facility field is not enabled..");
				}
		}
		else
		{
			System.out.println("Failed: Facility field is not displayed....");
		}
	}
	
	public void terminate()
	{
		if(TerminateCheckbox.isDisplayed())
		{
			if(TerminateCheckbox.isEnabled())
			{
				TerminateCheckbox.click();
				System.out.println("Remind: Closed active session and new session has been started....");
			}
			else
			{
				System.out.println("Failed: Checkbox is not enabled...");
			}
		}
		else
		{
			System.out.println("No previous active sessions......");
		}
	}
	
	public void signin()
	{
		if(Signin.isDisplayed())
		{
			if(Signin.isEnabled())
				{
					Signin.click();
					System.out.println("Clicked Sign-In");
				}
			else
			{
				System.out.println("Failed: Sign-In button is not enabled..");
			}
		}
		else
		{
			System.out.println("Failed: Sign-In button is not displayed..");
		}
	}
	
	public void forgotpassword()
	{
		if(ForgotPassword.isDisplayed())
		{
			if(ForgotPassword.isEnabled())
			{
				ForgotPassword.click();
			}
			else
			{
				System.out.println("ForgotPassword link is not enabled..");
			}
		}
		else
		{
			System.out.println("ForgotPassword link is not displayed...");
		}
	}
	
	public void homepage()
	{
		if(HomePage.isDisplayed())
		{
			System.out.println();
		}
		else
		{
			System.out.println();
		}
	}
	
	public void profile()
	{
		if(Profile.isDisplayed())
		{
			if(Profile.isEnabled())
			{
				Profile.click();
				System.out.println("Clicked Profile_section");
			}
			else
			{
				System.out.println("Failed: Profile section is not enabled..");
			}
		}
		else
		{
			System.out.println("Failed: Profile section is not displayed...");
		}
	}
	
	public void closeapp()
	{
		if(Logout.isDisplayed())
			{
				if(Logout.isEnabled())
				{
					Logout.click();
					System.out.println("Clicked Logout");
				}
				else
				{
					System.out.println("Failed: Logout button is not enabled..");
				}
			}
		else
		{
			System.out.println("Failed: Logout button is not displayed..");
		}
	}
	

	
}
