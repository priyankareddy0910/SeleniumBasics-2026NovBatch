package CheckBoxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//when you want to check all the checkboxes 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("monday")).click();
	List<WebElement> data = driver.findElements(By.xpath("//label[text()='Days:']/ancestor::div[@class='form-group']/child::div[@class='form-check form-check-inline']/child::input"));
	int count = data.size();
	//7-2=5
		for(int i=count-2;i<count;i++) {
				data.get(i).click();
			}	
			
		}
		
		
		
		
		
		
		

	}
	



