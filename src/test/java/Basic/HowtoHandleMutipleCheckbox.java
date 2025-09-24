package Basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtoHandleMutipleCheckbox {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		

	   driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		SelectCheckbox("Apply the filter Get It by Tomorrow to narrow results");
		SelectCheckbox("Apply the filter Get It in 2 Days to narrow results");
	

	}
	
	private static void SelectCheckbox(String displayText) throws InterruptedException {
		
WebElement iphone = driver.findElement(By.id("twotabsearchtextbox"));

Thread.sleep(4000);
		
		iphone.sendKeys("iphone",Keys.ENTER);
		
		WebElement input = driver.findElement(By.xpath("//a[@aria-label='"+displayText+"']//i[@class='a-icon a-icon-checkbox']"));
		
		boolean b = input.isSelected();
       
		if(!b) {
			
			input.click();
		}

	}
	
	
		
		
		
		
	

}


