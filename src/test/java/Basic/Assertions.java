package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
    
		
		
		ChromeOptions chromeOptions = new ChromeOptions(); 
		
		chromeOptions.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
	   
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();//maxixmize
		
		WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));
		
		int rows =table.findElements(By.tagName("tr")).size();
		
		int cols =table.findElements(By.tagName("th")).size();
		
		for(int i=1;i<=1;i++) {
			
			for(int j=1;j<cols;j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/th["+j+"]")).getText()+" ");
				
						
					
				
			}
		}
		
		
		for(int i=2;i<=rows;i++) {
			
			for(int j=1;j<cols;j++) {
				
				System.out.print(driver.findElement(By.xpath("//table[@name='courses']//tr["+i+"]/td["+j+"]")).getText()+" ");
				
				
			}
			
			System.out.println();
			
			
		}
		
		

		
		
		   

	}

}
