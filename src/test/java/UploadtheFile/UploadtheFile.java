package UploadtheFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadtheFile {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
             WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.foundit.in/upload");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//input[@id='file-upload']")));
		

		StringSelection filepath = new StringSelection("C:\\Users\\ankus\\Desktop\\priyanka.txt");
	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
		
		
		 Thread.sleep(5000);
		
		Robot s = new Robot();
		
		s.keyPress(KeyEvent.VK_CONTROL);
		s.keyPress(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_V);
		s.keyRelease(KeyEvent.VK_CONTROL);
		
	    Thread.sleep(5000);
		
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);

	    Thread.sleep(5000);
	    
	    driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
