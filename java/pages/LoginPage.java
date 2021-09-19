package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage enterusername(String userid) {
		driver.findElement(By.id("username")).sendKeys(userid);
		return this;
	}
	
	public LoginPage enterpassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public HomePage clicklogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
	

}
