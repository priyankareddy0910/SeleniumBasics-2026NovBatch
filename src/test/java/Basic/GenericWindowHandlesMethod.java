package Basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWindowHandlesMethod {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriver driver = new ChromeDriver();
		 driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2017/");
		driver.manage().window().maximize();
		String parenid=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' Click here for Google ']")).click();
		driver.findElement(By.xpath("//a[text()=' Click here for Facebook ']")).click();
		driver.findElement(By.xpath("//a[text()=' Click here for Gmail ']")).click();
		Set<String> ids =driver.getWindowHandles();
		ArrayList newobj = new ArrayList(ids);
		if(swutchtoRightWindow("Facebook",newobj)) {
			System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());
			
		}
		
		SwitchToParentWindow(parenid);
		closeAllwindowsExceptParennt(parenid,newobj);
		
	}
	
	public static void SwitchToParentWindow(String parentwindowd) {
		driver.switchTo().window(parentwindowd);
		
		System.out.println(driver.getCurrentUrl()+" : "+driver.getTitle());	
	}
	
	public static void closeAllwindowsExceptParennt(String parentwindowd,List<String>newobj) {
		
		for(String handle:newobj) {
			
			if(!handle.equalsIgnoreCase(parentwindowd)) {
				
				driver.switchTo().window(handle).close();
			}
			
		}
		
		
	}
	
	
	public  static boolean swutchtoRightWindow(String windowTitle,List<String>newobj) {
		
		for(String window:newobj) {
			
			String title =driver.switchTo().window(window).getTitle();
			
			if(title.contains(windowTitle)) {
				
				System.out.println("i got the right title");
				
				return true;
				
			}
			
		}
		return false;
		
	
		
	}
		
	}
		
		
		
		
		
		

	


