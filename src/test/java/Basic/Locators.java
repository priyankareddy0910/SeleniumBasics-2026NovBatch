package Basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Locators {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		

		
		

		 driver = new ChromeDriver();
     
    	
    
    	driver.get("https://seleniumpractise.blogspot.com/2017/");
   		driver.manage().window().maximize();
   		String parentid= driver.getWindowHandle();
   		driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
   		driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
   		driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();
   		
   		Set<String> ids = driver.getWindowHandles();
   		
   		ArrayList<String> newobj = new ArrayList(ids);
   		
   		if(switchtoRightwindow(newobj, "Facebook")) {
   			
   			System.out.println(driver.getTitle());
   			
   		}
   		
   		SwitchToparenntWindow(parentid);
   		
   		CloseallwindowsExcpetParent(newobj,parentid);
   		
   	  
   		
   		
  }
	
	public static void CloseallwindowsExcpetParent(ArrayList<String> newobj,String parentid) {
		
		for(String window:newobj) {
			
			if(!parentid.equals(window)) {
				
				driver.switchTo().window(window).close();
				
			}
			
			
		}
		
	}
	
	public static void SwitchToparenntWindow(String parentid) {
		
		driver.switchTo().window(parentid);
		
		
	}
	
	public static boolean  switchtoRightwindow(ArrayList<String> newobj, String title) {
		
		for(String window:newobj) {
			
			String titles = driver.switchTo().window(window).getTitle();
			
			
			if(titles.contains(title)) {
				
				System.out.println("you are on the right window");
				
				return true;
			}
			
		}
		return false;
		
		
		
		
	}
	
	
	
}


				
				
				
				
				
				
				
					  
					  
				  
					
				   
					
					
					
					
					
				
				
				
			
				
				
				
				
				
					 
					 
					 
					 
					 
				 
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
						
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
					
				
				
			   

	


