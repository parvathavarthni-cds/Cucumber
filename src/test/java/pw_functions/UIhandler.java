package pw_functions;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(portfoliodropdown));
			portfoliodropdown.click();
			wait.until(ExpectedConditions.elementToBeClickable(search_placeholderp));
			search_placeholderp.sendKeys(portfolio_name1);
			//WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"order-table-wrapper\"]/div/div[1]/div/div[2]/div[4]/span"));
			//WebElement checkbox=driver.findElement(By.className("fs-checkbox"));
			//checkbox.click();
			wait.until(ExpectedConditions.elementToBeClickable(search_placeholderp));
			search_placeholderp.sendKeys(Keys.ARROW_DOWN);
			search_placeholderp.sendKeys(Keys.ENTER);
//			wait.until(ExpectedConditions.elementToBeClickable(portfoliodropdown));
//			portfoliodropdown.click();
			Thread.sleep(2000);
			return driver;
	}

	public WebDriver Managed_funddropdowncheck(WebDriver driver,String fundname1) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(managedfunddropdown));
		managedfunddropdown.click();
		wait.until(ExpectedConditions.elementToBeClickable(search_placeholderm));
		search_placeholderm.sendKeys(fundname1);
		wait.until(ExpectedConditions.elementToBeClickable(search_placeholderm));
		search_placeholderm.sendKeys(Keys.ARROW_DOWN);
		search_placeholderm.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(managedfunddropdown));
//		managedfunddropdown.click();
		Thread.sleep(2000);
		return driver;
	}
	public WebDriver Datepicker7days(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		wait.until(ExpectedConditions.elementToBeClickable(last7days));
		last7days.click();
		applybutton.click();
		Thread.sleep(2000);
		return driver;
	}
	public WebDriver Datepickerlastquarter(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		wait.until(ExpectedConditions.elementToBeClickable(lastquarter));
		lastquarter.click();
		applybutton.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver Datepickerlast6months(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		wait.until(ExpectedConditions.elementToBeClickable(last6months));
		last6months.click();
		applybutton.click();
		Thread.sleep(2000);
		return driver;
	}
	
	public WebDriver Datepickerlast12months(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(datepicker));
		datepicker.click();
		wait.until(ExpectedConditions.elementToBeClickable(last12months));
		last12months.click();
		applybutton.click();
		Thread.sleep(2000);
		return driver;
	}
	
public WebDriver valuedropdown(WebDriver driver,String minvalue,String maxvalue) throws InterruptedException
{

	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeClickable(valuedropdown));
	valuedropdown.click();
	wait.until(ExpectedConditions.elementToBeClickable(minimumfield));
	minimumfield.clear();
	minimumfield.sendKeys(minvalue);
	wait.until(ExpectedConditions.elementToBeClickable(maximumfield));
	maximumfield.clear();
	maximumfield.sendKeys(maxvalue);
	value_apply.click();
	Thread.sleep(2000);
	return driver;
}
public WebDriver OrderlistVerification(WebDriver driver) throws InterruptedException
{
	int m = 0;
	Thread.sleep(2000);
	System.out.println("Entering");
	List rowpath=driver.findElements(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr"));
	int j= rowpath.size();
	System.out.println("No.of.Rows are:"+j);
	String before_xpath="/html[1]/body[1]/div[3]/div[2]/div[5]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[";
	String after_xpath="]/td[1]";
		for(int i=1;i<=j;i++)
		{
			driver.findElement(By.xpath(before_xpath +i+ after_xpath)).click();
			Thread.sleep(1000);
			for(int k=1;k<=m;k++)
			{
		 WebElement portfolio_name=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[5]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[i]/td[m]"));
		 String portfolio_nametext=portfolio_name.getText();
			}
		}
	return driver;
}
public WebDriver Ordretabledetailscheck(WebDriver driver)throws InterruptedException
{
	return driver;
}
}
