package Basic;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class DownloadtheFileinSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//I want to download the files in this path
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='j_idt93:j_idt95']")).click();
		
		Thread.sleep(10000);
		
		File newobj = new File("C:\\Users\\ankus\\Downloads");
	
		File [] allfiles =newobj.listFiles();
		
		for(File file:allfiles) {
			
			System.out.println(file.getName());
			
			if(file.getName().contains("TestLeaf")) {
				
				System.out.println("File is downloaded");
				
				break;
			}else {
				
				System.out.println("File is not downloaded");
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		

	}

}
