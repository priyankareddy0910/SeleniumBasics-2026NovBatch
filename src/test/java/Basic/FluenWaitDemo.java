package Basic;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluenWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            
	            
	            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
	            
	            driver.findElement(By.cssSelector("#start button")).click();
	            
	            
	       Wait w =new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).
	            		pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
	           WebElement result = 
	        		   
	        		   
	(WebElement) w.until(ExpectedConditions.visibilityOfElementLocated(By.id("finish")));
	        		   ;
	   
	   System.out.println("Text Found" +result.getText());
	            
	            
	            
	            
	
}
	
}
