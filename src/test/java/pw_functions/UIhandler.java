package pw_functions;
import java.util.logging.Logger;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIhandler extends pagefactory {
	public static WebDriver driver;
	static Logger logger = Logger.getLogger(UIhandler.class.getName()); 
	public WebDriver login(WebDriver driver,String email,String password) throws InterruptedException
	{
		
		Emailid_field.sendKeys(email);
		Password_field.sendKeys(password);
		Login_button.submit();
		return driver;
	}
	public WebDriver DGadmin_verification(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(DGlogo));		
		return driver;
		
	}
	
	public WebDriver advisor(WebDriver driver) throws InterruptedException
	{

		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.elementToBeClickable(profile_icon));
		profile_icon.click();
		advisor.click();
		logger.info("Switched to advisor");
		return driver;
	}
	
	public WebDriver portfoliovaluation_verification(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(Investment));
		String Investment_text=Investment.getText();
		System.out.println("Pv text is "+Investment_text);
		Assert.assertTrue(Investment_text.contains("Investment"));
		logger.info("User is in Portfolio Valuation page");

		return driver;
		
	}
	public WebDriver orderlist(WebDriver driver) throws InterruptedException
	
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.elementToBeClickable(globalorders));
		globalorders.click();
		return driver;
	}

	public WebDriver portfolio_dropdowncheck(WebDriver driver,String portfolio_name1) throws InterruptedException
	{
			
			WebDriverWait wait = new WebDriverWait(driver,120);
			wait.until(ExpectedConditions.elementToBeClickable(portfoliodropdown));
			portfoliodropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(search_placeholder));
			search_placeholder.sendKeys(portfolio_name1);
			//WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"order-table-wrapper\"]/div/div[1]/div/div[2]/div[4]/span"));
			//WebElement checkbox=driver.findElement(By.className("fs-checkbox"));
			//checkbox.click();
			wait.until(ExpectedConditions.elementToBeClickable(search_placeholder));
			search_placeholder.sendKeys(Keys.ARROW_DOWN);
			search_placeholder.sendKeys(Keys.ENTER);
//			wait.until(ExpectedConditions.elementToBeClickable(portfoliodropdown));
//			portfoliodropdown.click();
			return driver;
	}

	public WebDriver Managed_funddropdowncheck(WebDriver driver,String fundname) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		managedfunddropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(search_placeholder));
		search_placeholder.sendKeys(fundname);
		wait.until(ExpectedConditions.elementToBeClickable(search_placeholder));
		search_placeholder.sendKeys(Keys.ARROW_DOWN);
		search_placeholder.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(managedfunddropdown));
//		managedfunddropdown.click();
		return driver;
	}
	public WebDriver Datepicker(WebDriver driver)
	{
		datepicker.click();
		last7days.click();
		return driver;
	}
public WebDriver valuedropdown(WebDriver driver,String minvalue,String maxvalue)
{
	valuedropdown.click();
	minimumfield.clear();
	minimumfield.sendKeys(minvalue);
	maximumfield.clear();
	maximumfield.sendKeys(maxvalue);
	applybutton.click();
	
	return driver;
}
}
