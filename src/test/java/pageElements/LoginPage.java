package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{ 
	// Username
	@FindBy(id="input_3")
	public WebElement Username;
	
	//Next
	@FindBy(xpath="(//button[@type='submit'])[1]")
	public WebElement Next;
	
	//Password
	@FindBy(xpath="//input[@ng-model=\"vm.form.password\"]")
	public WebElement Password;
	
	//Facility
	@FindBy(name="facility")
	public WebElement Facility;
	
	//Session Terminate Checkbox
	@FindBy(xpath="//div[@class=\"md-ripple-container\"]")
	public WebElement TerminateCheckbox;
	
	//Sign-In
	@FindBy(xpath="(//button[@type='submit'])[2]")
	public WebElement Signin;
	
	// Forgot Password
	@FindBy(xpath="//span[text()='Forgot Password?']")
	public WebElement ForgotPassword;
	
	//Home Page
	@FindBy(xpath="//div[@class=\"center flex\"]")
	public WebElement HomePage;
	
	// Profile
	@FindBy(xpath="//button[@ng-click=\"$mdMenu.open()\"]")
	public WebElement Profile;
	
	// Logout
	@FindBy(xpath="(//button[@type=\"button\"])[74]")
	public WebElement Logout;
}
