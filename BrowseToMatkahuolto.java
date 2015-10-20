

/**
author: bhordupur
date:  september 2014
Place: Turku University
*/

package Software_Testing_UTU;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

//@Test(description="Testing the class BrowseToMatkahuolto", successPercentage=100)
@Test
public class BrowseToMatkahuolto extends Home {

	
	public static void testMatkahuolto() throws IOException {
		
		try{
			

		//BROWSER TO matkahuolto.fi
		driver.navigate().to("http://matkahuolto.fi/fi/index.html");

		//let the browser load the page 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		Home home = new Home();
	
		//WRITE TURKU WITH UPPER CASE
		home.departure(driver).click();
		home.departure(driver).clear();
		home.departure(driver).sendKeys(Keys.chord(Keys.SHIFT,"Turku"));
		
		//WRITE HELSINKI
		home.destination(driver).click();
		home.destination(driver).clear();
		home.destination(driver).sendKeys("Helsinki");
		
		//USE ROBOT CLASS 
		home.day(driver).click();
		Robot robot = new Robot();
		//WAIT FOR ONE SEC
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Home.day(driver).clear();
		home.day(driver).sendKeys("27");
		
		home.month(driver).clear();
		home.month(driver).sendKeys("11");
		
		home.year(driver).clear();
		home.year(driver).sendKeys("2014");
		
		//driver.switchTo().window("");
		
		//driver.switchTo().defaultContent();
		
		
		
		}catch(Exception e){
			//TRACE THE ERROR
			e.printStackTrace();
			//GET THE SCREEN SHOT ON UR LOCAL MACHINE
			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(sourceFile, new File("C:\\Users\\bhordupur\\Desktop\\erros_matkahuolto_frontpage.png"));
		}
		

	}
	
	
	
	@Test(dependsOnMethods={"testMatkahuolto"})
	public void seeTheSuggestedConnections() throws InterruptedException, AWTException{
		
		/**
		
		Home h = new Home();
		h.calendar(driver).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.print(a.getText());
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		//SEE THE ORIGINAL WINDOW SIZE
		System.out.print("Window size is  :" + driver.manage().window().getSize());
		
		String w2 = driver.getWindowHandle();
		driver.switchTo().window(w2);
		
		System.out.print("How many windows open ? "+"\n"+ "Ans is : " + driver.getWindowHandles().size());
		
		//driver.manage().window().maximize();
		//Dimension d = new Dimension(800,800);
		//driver.manage().window().setSize(d);
		//driver.findElement(By.linkText("29")).click();
		
		**/
		
		Home h = new Home();
		
		String window1 = driver.getWindowHandle();
		h.hae(driver).click();
		//LET THE WINDOW LOAD
		//WAIT FOR 5 SECS
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.print("Window size is  :" + driver.manage().window().getSize());
		String window2 = driver.getWindowHandle();
		driver.switchTo().window(window2);
		System.out.print("How many windows open ? "+"\n"+ "Ans is : " + driver.getWindowHandles().size());
		
		//GO BACK TO THE PREVIOUS WINDOW
		//SEE THE WINDOW SWITCHING
		Thread.sleep(3000);
		driver.switchTo().window(window1);
		
		Robot closeWindow = new Robot(); 
		//WAIT 2 SECS
		closeWindow.delay(2000);
		closeWindow.keyPress(KeyEvent.VK_CONTROL);
		closeWindow.keyPress(KeyEvent.VK_W);
		closeWindow.keyRelease(KeyEvent.VK_CONTROL);
		closeWindow.keyRelease(KeyEvent.VK_W);
		closeWindow.delay(1000);
		
		//ALT+SPACE+X
		closeWindow.delay(1000);
		closeWindow.keyPress(KeyEvent.VK_ALT);
		closeWindow.keyPress(KeyEvent.VK_SPACE);
		closeWindow.keyPress(KeyEvent.VK_X);
		closeWindow.keyRelease(KeyEvent.VK_ALT);
		closeWindow.keyRelease(KeyEvent.VK_SPACE);
		closeWindow.keyRelease(KeyEvent.VK_X);

		
		//MOVE TO THE DEFAULT WINDOW
		//driver.switchTo().window(window2);
		
		//CLICK ON THE CALENDAR
		h.iconCalendar(driver).click();
		
		//SCROLL DOWN AND UP
		/**
		Actions action = new Actions(driver);
		action.keyDown(Keys.ARROW_DOWN).build().perform();
		action.keyUp(Keys.ARROW_UP).build().perform();
		*/
		JavascriptExecutor e = (JavascriptExecutor)driver;
		e.executeScript("window.scrollBy(0,400)", " ");
	  ((JavascriptExecutor) driver).executeScript("scroll(0,250);");
		
		
		
	}


}
