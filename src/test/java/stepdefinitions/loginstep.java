package stepdefinitions;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Resources.Dataprovider;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pw_functions.Pw_login;
import pw_functions.UIhandler;


public class loginstep extends Dataprovider
{
	
	
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(loginstep.class.getName()); 

	//Login Page -->
	
	@Given("^the user is in Login page$")
		public void the_user_is_in_Login_page() throws Throwable
		{
			Pw_login loginobj = PageFactory.initElements(driver,Pw_login.class);
			driver=loginobj.setup(driver, url);
		}
	@When("^the user enters the valid email and valid password$")
		public void the_user_enters_the_valid_email_and_valid_password() throws Throwable
		{
			UIhandler ordersobj= PageFactory.initElements(driver,UIhandler.class);
			driver=ordersobj.login(driver, email, password);
	
		}
	@Then("^the user should be in the Portfolio Valutaion page$")
		public void the_user_should_be_able_to_login_to_the_Hive_application() throws Throwable
		{
			logger.info("User is in PV page");
		}
}