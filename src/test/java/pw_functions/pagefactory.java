package pw_functions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pagefactory {
	//Login page Elements

	@FindBy (xpath="//*[@id=\"user_email\"]")
	public static WebElement Emailid_field;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	
	public static WebElement Password_field;
	
	@FindBy(xpath="//*[@id=\"m_login_signin_submit\"]")
	
	public static WebElement Login_button;
	//admin page Elements 
	
	@FindBy (xpath="//li[contains(@class,'m-dropdown m-dropdown--medium m-dropdown--arrow m-dropdown--header-bg-fill m-dropdown--align-right m-dropdown--mobile-full-width m-dropdown--skin-light m--padding-10')]//span[contains(@class,'m-topbar__userpic')] ")
	public static WebElement profile_icon;

	@FindBy(xpath="//*[@id=\"m_header\"]/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a/span")
	public static WebElement advisor;
	
	@FindBy(xpath="//*[@id=\"m_header\"]/div/div/div[1]/a")
	public static WebElement DGlogo;
	//Portfolio valuation page Elements
	
	@FindBy(xpath="//*[@id=\"raise_a_request\"]")
	public static WebElement newactivity;
	@FindBy(xpath=("//p[contains(text(),'Investment - Personal')]"))
	public static WebElement Investment;

	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	public static WebElement globalorders;
	
	@FindBy(xpath=("//*[@id=\"order-table-wrapper\"]/div/div[1]/div/div[1]/div"))
	public static WebElement portfoliodropdown;
	
	@FindBy(xpath="//div[contains(text(),'All managed funds')]")
	public static WebElement managedfunddropdown;
	
	@FindBy(xpath="//div[@class='fs-dropdown']//input[@placeholder='Choose something']")
	public static WebElement search_placeholder;
	
	@FindBy(xpath="//div[@id='amt-container']")
	public static WebElement valuedropdown;
	
	@FindBy(xpath="//input[@id='low-value-slider']")
	public static WebElement minimumfield;
	
	@FindBy(xpath="//input[@id='high-value-slider']")
	public static WebElement maximumfield;
	

	@FindBy(css = ".primary-logo") // app logo
	public static WebElement product_logo;
	@FindBy(xpath="//*[@id=\"horizontal-menu\"]/ul/li[2]/a")
	public static WebElement ordersdrop;
	
	@FindBy(xpath="//*[@id=\"date_range\"]")
	public static WebElement datepicker;
	
	@FindBy(xpath="//a[@id='amount-apply']")
	public static WebElement applybutton;
	
	@FindBy(xpath="//li[contains(text(),'Last 7 Days')]")
	public static WebElement last7days;
	//sd forms
	
	@FindBy(xpath="//*[@id=\"m_accordion_sd_item_0_head\"]/span[1]")
	public static WebElement newaccount_creation;
	
	@FindBy(xpath="//*[@id=\"m_accordion_sd_item_0_body\"]/div")
	public static WebElement open_a_new_account;
	
	@FindBy(xpath="/html/body/div[2]/div[8]/div[1]/div[4]/div/div/div")
	public static WebElement pagetitle;
	
	@FindBy(xpath="//*[@id=\"customfield_10106\"]")
	public static WebElement portfolio_idbox;
	
	@FindBy(xpath="//*[@id=\"customfield_10107\"]")
	public static WebElement portfolio_namebox;
	
	@FindBy(xpath="//*[@id=\"customfield_10600_hash_10500\"]")
	public static WebElement withassets;
	
	@FindBy (xpath="//*[@id=\"sd-form\"]/div[2]/div[2]/button[2]")
	public static WebElement submit_button;
	
	

}
