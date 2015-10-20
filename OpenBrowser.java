
/**

author: bhordupur
Date : Setember 2014
Turku University

*/



package Software_Testing_UTU;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;

public class OpenBrowser {
	
	protected static WebDriver driver;
	
	@BeforeTest
	public void setUpFirefox(){
	//OPEN THE CUSTOM PROFILE
	String path ="C:\\users\\bhordupur\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\4yhwcq77.default_browser";
	FirefoxProfile customProfile = new FirefoxProfile(new File(path));
	driver = new FirefoxDriver(customProfile);
	//MAXIMISE THE BROWSER
	driver.manage().window().maximize();
	
	}
	
	public void tearDownFirefox(){
		
		//CLOSE THE BROWER
		driver.close();
		
		//KILL THE INSTANCE
		//driver.quit();
		
	}

}
