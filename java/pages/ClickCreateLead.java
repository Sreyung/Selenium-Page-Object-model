package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class ClickCreateLead extends BaseClass {
	
	
	public  CreateLeadPage clickCreateLead1() {
		// TODO Auto-generated method stub
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}

}
