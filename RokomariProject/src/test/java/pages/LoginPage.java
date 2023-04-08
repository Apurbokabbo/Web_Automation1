package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	 
	 public String loginPageUrl = "https://www.rokomari.com/login";
	 public String email ="testingboss00@gmail.com";
	 public String mobile ="01532312199";
	 public String password = "87654321";
	 public String waringMessage ="This field is required!";
	 public String suggestionMesage ="Login easily with your facebook or google account";
	 
	 public By signInTabButton = By.xpath("//p[contains(text(),'Sign in')]"); 
	 public By signUpTabButton = By.xpath("//p[contains(text(),'Sign up')]");
	 public By facebookButton = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[1]");
	 public By googleButton = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/button[2]");
	 public By emailOrMobileInputFieldLocator =By.xpath("//input[@id='j_username']");
	 public By passwordFieldLocator=By.xpath("//input[@id='j_password']");
	 public By rememberMeCheckboxLocator = By.xpath("//label[contains(text(),'Remember Me')]");
	 public By forgetPasswordButton = By.xpath("//a[contains(text(),'Forgot Password?')]");
	 public By signInButton = By.xpath("//button[contains(text(),'Sign In')]");
	 public By WarningMessageMailLocator = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/form[1]/div[1]/div[1]/p[1]");
	 public By WarningMessagePhoneLocator = By.xpath("//body/div[@id='login-registration']/div[1]/section[1]/div[2]/div[2]/form[1]/div[2]/div[1]/p[1]");
	 public By suggestionMessageLocator = By.xpath("//p[contains(text(),'Login easily with your facebook or google account')]");
	 
	 
}
