package ReadProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readconfigfile {

	
	  public static void main(String[] args) throws IOException {
	/*	
		  //set the path of property file
		  FileInputStream fis = new FileInputStream("./src/main/resources/Config.properties"); 
		  //create object
		  Properties pp = new Properties();
		  
		  pp.load(fis);
		  
		  WebDriverManager.chromedriver().browserVersion("91").setup();
		  
		  ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			driver.findElement(By.id("username")).sendKeys(pp.getProperty("username"));
			driver.findElement(By.id("password")).sendKeys(pp.getProperty("password"));*/
			
	}
}
