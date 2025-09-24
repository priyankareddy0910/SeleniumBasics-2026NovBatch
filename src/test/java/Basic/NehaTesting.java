package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NehaTesting {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://blinkit.com/");
		driver.manage().window().maximize();
		//List<WebElement> cards =driver.findElements(By.xpath("//div[text()='Candies & Gums']//following::div[@class='Product__UpdatedPriceAndAtcContainer-sc-11dk8zk-10 ljxcbQ']//div[contains(text(),'₹')][1]"));
		List<WebElement> cards = driver.findElements(
			    By.xpath("//div[normalize-space(.)='Candies & Gums']/following::div[contains(@class,'Product__UpdatedContentContainer')]")
			);

			int sum = 0;	
			for (WebElement card : cards) {
				    WebElement priceEl = card.findElement(
				        By.xpath(".//div[contains(@class,'Product__UpdatedPriceAndAtcContainer')]//div[contains(text(),'₹')][1]")
				    );
				    
				    System.out.println(priceEl.getText());
			    String priceText = priceEl.getText().replace("₹","").trim();
			    sum = sum + Integer.parseInt(priceText);   // layman way
			}		
			System.out.println("Total = ₹" + sum);
		
		
			
		
		
		

	}

}
