package Basic;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithOutUsingSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("dropdown-class-example")).click();
			
			
			List<WebElement> allOptions =driver.findElements(By.tagName("option"));
			for (WebElement option : allOptions) {
	            if (option.getText().equals("Option1")) {
	                option.click();
	                break;
	            }
	        }
				
				
			}
			
		

	
				
				
			

	}


