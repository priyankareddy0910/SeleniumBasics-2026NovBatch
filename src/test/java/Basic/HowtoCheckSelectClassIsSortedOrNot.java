package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowtoCheckSelectClassIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
	Select newobj = new Select(driver.findElement(By.id("dropdown-class-example")));
		
	List<WebElement> options = newobj.getOptions();
	
	ArrayList OrginalList = new ArrayList();
	
	ArrayList TempList = new ArrayList();
	
	
	for(WebElement k:options) {
		
		if(!k.getText().equals("Select")) {
		
		OrginalList.add(k.getText());
		
		TempList.add(k.getText());
		
	
	}
		
	}		
	
System.out.println("Before Sorting"+OrginalList);
	
	System.out.println("Before Sorting"+TempList);
	
	
	Collections.sort(TempList);
	
	
	System.out.println("After Sorting"+TempList);
	
	
	if(OrginalList.equals(TempList)) {
		
		System.out.println("sorted");
		
		
	}else {
		
		System.out.println("not sorted");
		
	}
	
	
	
		

}
	
}
