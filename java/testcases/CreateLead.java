package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {
	
	@BeforeClass
	public  void setfileName() {
		// TODO Auto-generated method stu
        excelname = "CreateLead";
	}

	@Test(dataProvider = "fetch")
	public void runLogin(String username, String pass, String companyname, String Fname, String LName) {
		// TODO Auto-generated method stub
		new LoginPage().enterusername(username).enterpassword(pass).clicklogin().clickhomepag().clickLead().clickCreateLead1().enterfname(Fname).enterLname(LName).entercompanyname(companyname).clicksubmit();

	}
}
