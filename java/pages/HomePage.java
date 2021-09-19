package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class HomePage extends BaseClass{

	public  LeadPage clickhomepag() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		return new LeadPage();

		
		
	}
}
