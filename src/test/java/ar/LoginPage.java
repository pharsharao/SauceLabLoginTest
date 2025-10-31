package ar;
import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
	WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void enterUsername(String Username) {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	public void enterPassword(String Password ) {
		driver.findElement(By.id("password"));
	}

	public void cLickLoginButton() {
		driver.findElement(By.id("login-button")).click();;
	}
	

}
