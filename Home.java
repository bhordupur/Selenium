/**
 * 
 * author: bhordupur
 * date : September 2014
 * Turku University
 * /


package Software_Testing_UTU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home extends OpenBrowser {
	
	private static WebElement element = null;
	
	public WebElement departure( WebDriver driver){
		
		//locate the element 
		element = driver.findElement(By.name("departureStopAreaName"));
		return element;
	}
	
	public WebElement destination(WebDriver driver){ 
		
		//locate the destination element
		
		element = driver.findElement(By.name("arrivalStopAreaName"));
		
		return element;
		
		
	}
	public WebElement hae(WebDriver driver){
		
		element = driver.findElement(By.xpath("//form[@name='aikatauluhaku']//table/tbody/tr/td/input[@name='search']"));
		return element;	
		
	}
	
	public WebElement iconCalendar(WebDriver driver){
		
		element = driver.findElement(By.id("iconCalendar"));
		return element;
	}
	public WebElement day(WebDriver driver){
		
		//TO CHANGE THE DAY
		element = driver.findElement(By.id("departureDay"));
		return element;
	}
	
	public  WebElement month(WebDriver driver){
		
		//LOCATE THE MONTH
		
		element = driver.findElement(By.id("departureMonth"));
		
		return element;
	}
	
	public WebElement year(WebDriver driver){
		
		//LOCATE THE YEAR
		element = driver.findElement(By.id("departureYear"));
		return element;
	}
	
	public WebElement calendar(WebDriver driver){
		
		//LOCATE THE YEAR
		//("//form//table/tbody/tr/td[4]/a/img")
		////form[@name='aikatauluhaku']//table/tbody/tr/td/a/img[@width=16 and @height=16]"
		element = driver.findElement(By.xpath("//form[@name='aikatauluhaku']//table/tbody/tr//td/a/img"));
		return element;
	}
	
	
	
	/**
	//CLOSE THE BROWSER
	public static void tear_drwn_firefox(WebDriver driver){
		
		//CLOSE THE BROWSER
		driver.close();
		
		//KILL THE BROWSER INSTANCE
		//driver.quit();
				
	}*/

}
