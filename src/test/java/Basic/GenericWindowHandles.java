package Basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWindowHandles {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.manage().window().maximize();
    driver.findElement(By.id("openwindow")).click();
    Set<String> ids =driver.getWindowHandles();
    
   String parentwindow = driver.getWindowHandle();
   
   for(String handle:ids) {
	   
	   if(!handle.equals(parentwindow)) {
		   
		   driver.switchTo().window(handle);
		   
		   System.out.println("switched to the child window" + driver.getTitle());
		   
		   driver.close();
		   
	   }
	      
   }
   
   driver.switchTo().window(parentwindow);
   System.out.println("switched to the child window" + driver.getTitle());
   

	
	
		
	}
	
	
	
}
