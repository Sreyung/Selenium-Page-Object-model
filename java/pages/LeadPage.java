package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class LeadPage extends BaseClass {
	
	public  ClickCreateLead clickLead() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("Leads")).click();
		
		return new ClickCreateLead();

	}

}


