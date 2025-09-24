package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCheckBox {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
		SelectCheckBox("Apply the filter Get It by Tomorrow to narrow results");
		
	}
	
	private static void SelectCheckBox(String displayText) {
		
		WebElement iphone = driver.findElement(By.id("twotabsearchtextbox"));

		iphone.sendKeys("iphone", Keys.ENTER);
		
		WebElement input = driver.findElement(By.xpath("//a[@aria-label='"+ displayText+"']//i[@class='a-icon a-icon-checkbox']"));
		boolean b = input.isSelected();
		
		if(!b) {
			input.click();
		}
		
		System.out.println(input.isSelected());
		
		
		
	}

}
