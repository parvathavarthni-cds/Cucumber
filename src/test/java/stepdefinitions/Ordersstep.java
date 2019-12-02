package stepdefinitions;
//Orders table workflow --->

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pw_functions.Dataprovider;
import pw_functions.Pw_login;
import pw_functions.UIhandler;
public class Ordersstep extends Dataprovider
{
	public static WebDriver driver;
	public static Logger logger = Logger.getLogger(Ordersstep.class.getName()); 
	

	@Given("^the user is in portfolio valuation page$")
		public void the_user_is_in_portfolio_valuation_page() throws Throwable 
		{
			Pw_login loginobj = PageFactory.initElements(driver,Pw_login.class);
			driver=loginobj.setup(driver, url);
			UIhandler ordersobj= PageFactory.initElements(driver,UIhandler.class);
			driver=ordersobj.login(driver, email, password);
			
			}
	@When("^the user clicks on the global orders$")
		public void the_user_clicks_on_the_global_orders() throws Throwable 
		{
			UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
			driver=ordersobj.portfoliovaluation_verification(driver);
			driver=ordersobj.orderlist(driver);
				
		}
	@Then("^the orders list table should get populated$")
		public void the_orders_list_table_should_get_populated() throws Throwable
		{
		logger.info("order table got populated");
		}
	@Given("^the user is in Global orders table$")
	public void the_user_is_in_Global_orders_table() throws Throwable {
		logger.info("User is in Orders table");
	}

	@When("^the user click on the portfolio dropdown$")
	public void the_user_click_on_the_portfolio_dropdown() throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.portfolio_dropdowncheck(driver, Portfolio_name1);
	    
	}

	@Then("^the user should be able to see the results based on the filter applied$")
	public void the_user_should_be_able_to_see_the_results_based_on_the_filter_applied() throws Throwable {
		logger.info("filtered");
	}

	@Given("^the user is in Global orders table list$")
	public void the_user_is_in_Global_orders_table_list() throws Throwable {
		logger.info("user is in orders table");
	}

	@When("^the user clicks on the managed fund dropdown$")
	public void the_user_clicks_on_the_managed_fund_dropdown() throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.Managed_funddropdowncheck(driver, fundname1);
	    
	}
	@Given("^the user is in datepicker$")
	public void the_user_is_in_datepicker() throws Throwable {
	    logger.info("User is in datepicker");
	}

	@When("^the user clicks the last (\\d+) days option$")
	public void the_user_clicks_the_last_days_option(int arg1) throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.Datepicker7days(driver);
	}

	@Then("^the user should be able to see the results for last (\\d+) days$")
	public void the_user_should_be_able_to_see_the_results_for_last_days(int arg1) throws Throwable {
	    logger.info("last 7 days result found");
	}
	
	
	@When("^the user clicks the last quarter option$")
	public void the_user_clicks_the_last_quarter_option() throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.Datepickerlastquarter(driver);
	  
	}

	@Then("^the user should be able to see the results for the last quarter$")
	public void the_user_should_be_able_to_see_the_results_for_the_last_quarter() throws Throwable {
		 logger.info("last quarter result found");
	}

	@When("^the user clicks the last (\\d+) months option$")
	public void the_user_clicks_the_last_months_option(int arg1) throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.Datepickerlast6months(driver);
	    
	}

	@Then("^the user should be able to see the results for the (\\d+) months$")
	public void the_user_should_be_able_to_see_the_results_for_the_months(int arg1) throws Throwable {
		logger.info("last 6 months result found");
	}
	
	@When("^the user clicks on the last (\\d+) months option$")
	public void the_user_clicks_on_the_last_months_option(int arg1) throws Throwable {
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.Datepickerlast12months(driver);
	    
		
	}

	@Then("^the user should be able to see the results for the last (\\d+) months date$")
	public void the_user_should_be_able_to_see_the_results_for_the_last_months_date(int arg1) throws Throwable {
		logger.info("Last 12 months result found");
	}


	

	@Given("^the user is in Global Orders$")
	public void the_user_is_in_Global_Orders() throws Throwable {
	   
	   logger.info("User is in global orders");
	}

	@When("^the user clicks the value dropdown$")
	public void the_user_clicks_the_value_dropdown() throws Throwable {
		
		UIhandler ordersobj = PageFactory.initElements(driver,UIhandler.class);
		driver=ordersobj.valuedropdown(driver, minvalue, maxvalue);
	}

	@And("^the user enters the minimum and maximum values$")
	public void the_user_enters_the_minimum_and_maximum_values() throws Throwable {
	    
	}

	@Then("^the user should get result based on the value applied$")
	public void the_user_should_get_result_based_on_the_value_applied() throws Throwable {
	   
	}
	


}