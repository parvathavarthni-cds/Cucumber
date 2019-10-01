package Resources;
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
	
	@FindBy (xpath="/html/body/div[2]/header/div/div/div[4]/div/ul/li")
	public static WebElement profile_icon;
	
	@FindBy(xpath="//*[@id=\"m_header\"]/div/div/div[4]/div/ul/li/div/div/div/div/ul/li[2]/a/span")
	public static WebElement advisor;
	
	//Portfolio valuation page Elements
	
	@FindBy(xpath="//*[@id=\"raise_a_request\"]")
	public static WebElement newactivity;
	
	@FindBy(xpath="//a[@class='nav-link menu-text'][contains(text(),'Orders')]")
	public static WebElement globalorders;
	@FindBy(css = ".primary-logo") // app logo
	public static WebElement product_logo;
	@FindBy(xpath="//*[@id=\"horizontal-menu\"]/ul/li[2]/a")
	public static WebElement ordersdrop;
	
//	@FindBy(xpath="//p[contains(text(),'Investment - Personal')]")
//	public static WebElement Investment;
	
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
