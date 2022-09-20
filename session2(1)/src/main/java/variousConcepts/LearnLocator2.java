package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator2 {
	
	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/index.php");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	}
    @Test
    public  void learnlocators1() {
       driver.findElement(By.xpath("/html/body/div[3]/input[3]")).sendKeys("im in");
       driver.findElement(By.xpath("/html/body/div[3]/a[1]")).sendKeys("message");
       driver.findElement(By.xpath("/html/body/div[4]/span/select[1]")).sendKeys("message123");
       
    }
    @Test
    public void learnlocator2() {
    driver.findElement(By.xpath("/html/body/div[3]/input[3]")).sendKeys("im out"); 
    driver.findElement(By.xpath("/html/body/div[3]/input[1]")).sendKeys("pulak  on");
    
    }
    @Test
    public void learnlocator3() {
    driver.findElement(By.xpath("/html/body/div[3]/input[1]")).sendKeys("remove all");
    driver.findElement(By.xpath("/html/body/div[3]/input[3]")).sendKeys("functionally on");
    
    }

    
    
    
	@After
	public void tearDown() {
	driver.close();
	driver.quit();
	
	
	
	
	
	}}		   
	 