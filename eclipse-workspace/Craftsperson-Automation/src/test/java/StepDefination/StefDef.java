package StepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.Create_an_Account_Page;
import PageObject.LoginPage;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StefDef {
	
	public WebDriver driver;
	
	public LoginPage loginpg;
	public Create_an_Account_Page CreatePg;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() throws Exception {
		
		 System.setProperty("webdriver.chrome.driver",				 
		"C:\\Users\\hp\\eclipse-workspace\\CucumberJava\\src\\test\\resources\\Driver1\\chromedriver.exe");

	        // Chrome Options for remote connection issues
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");

	        // Initialize ChromeDriver
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();

	        // Set implicit and page load timeouts
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

	        System.out.println("Browser is open");
		loginpg = new LoginPage(driver);
		CreatePg=new Create_an_Account_Page(driver);
		
		Thread.sleep(2000);
		
	  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		
		driver.get(url);
		
	    
	}

	
	@Then("Click on Create an Account link")
	public void click_on_create_an_account_link() throws Exception {
		CreatePg.getCreateAccountLink();
		Thread.sleep(2000);
		
	   
	}

	@Then("Enter the First Name")
	public void enter_the_first_name() throws Exception {
		
		CreatePg.getFirstName();
		Thread.sleep(2000);
	    
	}

	@Then("Enter the Last Name")
	public void enter_the_last_name() throws Exception {
		CreatePg.getLastName();
		Thread.sleep(2000);
	   
	}

	@Then("Fill up the Email id")
	public void fill_up_the_email_id() throws Exception {
		CreatePg.getEmail();
		Thread.sleep(2000);
	   
	}

	@Then("Fill up the Password")
	public void fill_up_the_password() throws Exception {
		CreatePg.getPassword();
		Thread.sleep(2000);
	   
	}

	@Then("Fill up the Confirm Password")
	public void fill_up_the_confirm_password() throws Exception {
		CreatePg.getConfirmPassword();
		Thread.sleep(2000);
	    
	}

	@Then("Click on Create an Account button")
	public void click_on_create_an_account_button() throws Exception {
		CreatePg.getCreateAccountButton();
		Thread.sleep(2000);
	    
	}	

	////////////////////////////////////////////
	
	//Sign In
	
	@Then("Click on Sign In link")
	public void click_on_sign_in_link() throws Exception {
		loginpg.getSignInLink();
		Thread.sleep(2000);
		
	    
	}

	@Then("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String Email, String Password) throws Exception {
		loginpg.getEmail();
		Thread.sleep(2000);
		loginpg.getPassword();
		Thread.sleep(2000);
	   
	}

	@Then("Click on SignIn")
	public void click_on_sign_in() {
		loginpg.getSignIn();
	    
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@And("close browser")
	public void close_browser() {
		
		driver.close();
		driver.quit();
	    
	}
	
	
	
	
	
	
	
	
	
}
