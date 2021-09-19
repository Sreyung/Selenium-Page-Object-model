package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass {

	public static ChromeDriver driver;

	public String excelname;

	@DataProvider(name = "fetch")

	public String[][] senddata() throws IOException {

		ReadExcel re = new ReadExcel();

		return re.leaddata(excelname);

		// String[][] data = re.leaddata();
		// return data;
	}

	@BeforeMethod
	public void precondition() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().browserVersion("92").setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void postcondition() {
		// TODO Auto-generated method stub

		driver.close();

	}

}
