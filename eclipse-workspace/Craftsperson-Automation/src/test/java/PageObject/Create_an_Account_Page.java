package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_an_Account_Page {
	
	public WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory elements
    public Create_an_Account_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    private WebElement CreateAccountLink;
    
    @FindBy(id = "firstname")
    private WebElement FirstName;
    
    @FindBy(id = "lastname")
    private WebElement LastName;
    
    @FindBy(id = "email_address")
    private WebElement Email;
    
    @FindBy(id = "password")
    private WebElement Password;
    
    @FindBy(id = "password-confirmation")
    private WebElement ConfirmPassword;
    
    @FindBy(xpath = "//button[@class='action submit primary']")
    private WebElement CreateAccountButton;

    
    ///////////////////////////
    
    
	public WebElement getCreateAccountLink() {
		CreateAccountLink.click();
		return CreateAccountLink;
		}

	public WebElement getFirstName() {
		FirstName.sendKeys("Pramod");
		return FirstName;
	}

	public WebElement getLastName() {
		LastName.sendKeys("Pawar");
		return LastName;
	}

	public WebElement getEmail() {
		Email.sendKeys("pawarpramod6154@gmail.com");
		return Email;
	}

	public WebElement getPassword() {
		Password.sendKeys("Pramod@123");
		return Password;
	}

	public WebElement getConfirmPassword() {
		ConfirmPassword.sendKeys("Pramod@123");
		return ConfirmPassword;
	}

	public WebElement getCreateAccountButton() {
		CreateAccountButton.click();
		
		return CreateAccountButton;
	}
    
    
    /////////////////////////////////////
    
    

}
