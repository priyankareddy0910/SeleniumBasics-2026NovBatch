package Windowhandle;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",button);
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[1].scrollIntoView();",button,buttob2);
		button.click();
		String parentid = driver.getWindowHandle();
		Set<String> ids= driver.getWindowHandles(); // parent id , child id  22 33
		
		for(String window:ids) { // window // parent id , child id 
			
			if(!parentid.equals(window)) { //
				
				driver.switchTo().window(window);
				
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("priyanka");	
driver.switchTo().defaultContent();
				driver.close();
				
				
			}
			
		}
		
		
		
}
}
			
			
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		 
	
	      
	    
	
	


