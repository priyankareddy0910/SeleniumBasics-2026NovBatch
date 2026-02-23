package Basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.amazon.in/");
			
			try {
			    // Code that may throw an exception
			    WebElement element = driver.findElement(By.id("submit_button"));
			    element.click();
			} catch (Exception e) {
			    System.out.println("Element not found: " + e.getMessage());
			}
			

			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
			
			WebElement iphone = driver.findElement(By.id("twotabsearchtextbox"));
	
			iphone.sendKeys("Iphone x");
			
			driver.findElement(By.id("nav-search-submit-button")).click();		
			
			driver.findElement(By.linkText("Apple iPhone 13 (128GB) - Midnight")).click();
			
			Set<String> ids = driver.getWindowHandles();
			
			Iterator its = ids.iterator();
			
			while(its.hasNext()) {
				
				String Parentwindow =(String) its.next();
				
				String Childwindow =(String) its.next();
				
				driver.switchTo().window(Childwindow);
				
			}
			
			Thread.sleep(8000);
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']")));
			
			WebElement element = driver.findElement(By.xpath("//div[@class='a-section a-spacing-none a-padding-none']//input[@id='add-to-cart-button']"));
			
			element.click();
			
			driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']")).click();
			
			
			
			
			
			
			
			
			
			
			
			

	}

}
