package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // Declare the WebDriver variable
    public WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory elements
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators using @FindBy annotations
    @FindBy(xpath = "(//li[@class='authorization-link'])[1]")
    private WebElement SignInLink;
    
    @FindBy(xpath = "(//input[@class='input-text'])[2]")
    private WebElement Email;
    
    @FindBy(xpath = "(//input[@class='input-text'])[3]")
    private WebElement Password;
    
    @FindBy(xpath = "(//span[text()='Sign In'])[1]")
    private WebElement SignIn;

	public WebElement getSignInLink() {
		SignInLink.click();
		return SignInLink;
	}

	public WebElement getEmail() {
		Email.sendKeys("pawarpramod6154@gmail.com");
		return Email;
	}

	public WebElement getPassword() {
		Password.sendKeys("Pramod@123");
		return Password;
	}

	public WebElement getSignIn() {
		SignIn.click();
		return SignIn;
	}


   
    
}
