package Windowhandle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows {
	static WebDriver driver;
public static void main(String[] args) {
			 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		//String parentwindow =driver.getWindowHandle();
		String parent = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[normalize-space()='Click here for Google']")).click();
		WebElement data = driver.findElement(By.xpath("//a[normalize-space()='Click here for Facebook']"));
		data.click();
		driver.findElement(By.xpath("//a[normalize-space()='Click here for Gmail']")).click();
		
		

		Set<String> ids = driver.getWindowHandles();
		//Iterator<String> it = ids.iterator();
		
		
	
		for(String window:ids) {
			
			
			driver.switchTo().window(window);
			
			if(driver.getTitle().contains("Facebook")) {
				
				System.out.println("switched to facebook");
				
				break;
				
				
			}
			
			
		}

		
						
		
		
		
		
	
	
		
				
		
			
		}


}
		
		
		
	

		
		