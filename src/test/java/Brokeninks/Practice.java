package Brokeninks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         
         driver.findElement(By.id("openwindow")).click();
         
         Set<String> ids  =driver.getWindowHandles();
         
         List<String> links=new ArrayList(ids);
         
         
        for(String k:links) {
        	
        	String data = driver.switchTo().window(k).getTitle();
        	
        	if(data.contains("Earn and Shine")) {
        		
        		System.out.println("found right window");
        		
        		
        		
        	}else {
        		
        		System.out.println("not found right window");
        	}
        	
        	
        }
         
        
         
         
		
		

	}

}
