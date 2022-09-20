package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Learn_Test101 {
	

	WebDriver driver;

	
	String catagoryNAME = "testngPulak";
	String addcaragory ="testngPulak";
    String date ="20";
	String month ="september";
	String year ="2022";

	
	By CATAGORY_NAME_FIELD = By.xpath("/html/body/div[4]/span/select[1]");
	By ADDCATAGORY_NAME_FIELD = By.xpath("//*[@id=\"extra\"]/select[1]");
    By CURRENT_DATE_FIELD = By.xpath("//*[@id=\"extra\"]/select[2]/option[21]");
    By CURRENT_MONTH_FIELD = By.xpath("//*[@id=\"extra\"]/select[3]/option[10]");
	By CURRENT_YEAR_FIELD = By.xpath("//*[@id=\"extra\"]/select[4]/option[1]");
	

	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver","driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/test/101/");
	}

	@Test
	public void validtest1() {
		
		driver.findElement(CATAGORY_NAME_FIELD).sendKeys(catagoryNAME);
		driver.findElement(ADDCATAGORY_NAME_FIELD).sendKeys("testngPulak");
		
		
		
	}
	@Test
	public void validtest2() {
	   validtest1();
	   
	   driver.findElement(CURRENT_DATE_FIELD).click();
	   driver.findElement(CURRENT_MONTH_FIELD).click();
	   driver.findElement(CURRENT_YEAR_FIELD).click();
	
	}
	@AfterMethod
	public void tearDown() {
    driver.close();
    driver.quit();
    
	}

}
