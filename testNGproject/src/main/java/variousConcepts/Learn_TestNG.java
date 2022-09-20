package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Learn_TestNG {
	
	WebDriver driver;
	
	String usernsme ="demo@techfios.com";
	String password = "abc123";
	String loginbutton ="click";
    String dashboardHeader = "Dashboard";

	private By USER_NAME_FIELD =By.xpath("//*[@id=\"username\"]");

	private By PASSWORD_FIELD =By.xpath("//*[@id=\"password\"]");

	private By LOGIN_BUTTON_FIELD = By.xpath("/html/body/div/div/div/form/div[3]/button");

	private By DASHBOARD_HEADER_FIELD = By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/h2");

	
	@BeforeMethod
	public void init() {
		
		//System.setProperty("webdriver.gecko.driver", "C:\Users\Pulak\eclipse-workspace\New Workspace\testNGproject\geckodriver\geckodriver.exe");
		//driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@Test
	public void learnTestNG() {
		
		driver.findElement(USER_NAME_FIELD).sendKeys(usernsme);
		driver.findElement(PASSWORD_FIELD).sendKeys(password);
		driver.findElement(LOGIN_BUTTON_FIELD).click();
		Assert.assertEquals(driver.findElement(DASHBOARD_HEADER_FIELD).getText(),dashboardHeader,"Dashboardheader is");
		
		
	}
	public void addcustomer() {
		learnTestNG();
	}
	
	@AfterMethod
	public void tearDown() {
	driver.close();
	}
	

}
