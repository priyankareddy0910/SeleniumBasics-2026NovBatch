package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//I want to download the files in this path
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		String year ="2024";
		
		String month="October";
		
		String date ="28";
		
		SelectMonthAndYear(driver,month,year);
		
		selectData(driver,date);
		
	}
	public static void SelectMonthAndYear(WebDriver driver,String month,String year) {
		
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String CurrentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && CurrentYear.equals(year)) {
				
				break;
				
				
			}
			
//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}

		
	}
	
public static void selectData(WebDriver driver,String date) {

List<WebElement> allDates =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));

 for(WebElement dt:allDates) {
	 
	 if(dt.getText().equals(date)) {
		 
		 dt.click();
		 
		 break;
		 
		 
	 }
	 
	 
 }

		
}
	
}
