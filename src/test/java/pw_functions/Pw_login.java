package pw_functions;

import java.util.logging.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pw_login {
	public static WebDriver driver;
	static Logger logger = Logger.getLogger(Pw_login.class.getName()); 

	
	public WebDriver setup(WebDriver driver,String url)

	{
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(url);
		driver.manage().window().maximize();
		String actualtitle=driver.getTitle();
		String expectedtitle="Hive";
		Assert.assertEquals(expectedtitle,actualtitle);
		logger.info("Browser is launched");
		return driver; 

	}

}
