package Basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver  driver = new ChromeDriver();
			
			driver.get("https://practice.expandtesting.com/upload");
			
			driver.manage().window().maximize();
			
			WebElement uploadElement = driver.findElement(By.id("fileInput"));
			
			Robot newobj = new Robot();
			
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", uploadElement);
			
			
			Thread.sleep(3000);
			
			js.executeScript("arguments[0].click();", uploadElement);
			
			StringSelection ss = new StringSelection("C:\\newhtml.html");
			
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			newobj.keyPress(KeyEvent.VK_CONTROL);//control
			newobj.keyPress(KeyEvent.VK_V); //v
			
			
			newobj.keyRelease(KeyEvent.VK_CONTROL);//control
			newobj.keyRelease(KeyEvent.VK_V); //v
			
			newobj.keyPress(KeyEvent.VK_ENTER);
			
			
			
			
			
			
			
	

	        // enter the file path onto the file-selection input field
	      //  uploadElement.sendKeys("C:\\newhtml.html");

	        // check the "I accept the terms of service" check box
	        //driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
	        //driver.findElement(By.name("send")).click();
			
			
	}

}
