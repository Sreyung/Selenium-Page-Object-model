package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	
	
	
	public CreateLeadPage entercompanyname(String company) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;
	}
	
	public CreateLeadPage enterfname(String fname) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	
	public  CreateLeadPage enterLname(String Lname) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
		return this;
	}
	
	public CreateLeadPage enterphnumber(String num) {
		// TODO Auto-generated method stub
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(num);
		return this;
	}
	
	public ViewLeadPage clicksubmit() {
		// TODO Auto-generated method stub
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}
	

	
}
