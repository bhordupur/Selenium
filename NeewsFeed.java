
/**
Author : bhordupur
Date : Septem 2014
Turku University
*/


package Software_Testing_UTU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NeewsFeed  extends OpenBrowser{
	
	
	@Test
	public void getNewsFeed(){
		
		
		//driver.get("http://www.matkahuolto.fi/fi/index.html");
		//WebElement newsLink1 = driver.findElement(By.xpath("//div[@id='news']//ul/li"));
		
		while(true){
			
			driver.get("http://www.matkahuolto.fi/fi/index.html");
			WebElement newsLink1 = driver.findElement(By.xpath("//div[@id='news']//ul"));
			System.out.print(newsLink1.getText());
			System.out.print(newsLink1.getCssValue("href"));
			break;
		}
	
	}

}
