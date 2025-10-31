package ar;
import org.testng.*;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestRunner {
	WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	
	
	@BeforeTest
	public void setup() {
		ChromeOptions coptions = new ChromeOptions();
		coptions.addArguments("--no-infobars");
		driver = new ChromeDriver(coptions) ;
		driver.get("https://www.saucedemo.com/");
		loginpage = new LoginPage(driver);
		
	}
	
	@Test
	public void test() {
		loginpage.enterUsername("standard_user");
		loginpage.enterPassword("secret_sauce");
		loginpage.cLickLoginButton();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
		
	}

}
