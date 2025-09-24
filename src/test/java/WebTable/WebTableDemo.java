		package WebTable;
		
		import java.time.Duration;
		import java.util.List;
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class WebTableDemo {
		
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\ankus\\Desktop\\chromedriver.exe");	
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
				driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
				driver.manage().window().maximize();
				
				WebElement Table = driver.findElement(By.xpath("//table[@class='table-display']"));
				
				List<WebElement> rows = Table.findElements(By.tagName("tr"));
				
				System.out.println(rows.size());
				
				
				List<WebElement> cols = Table.findElements(By.tagName("th"));
				Table.findElement(By.tagName("th"));
				
					
				System.out.println(cols.size());
				
				for(int i=1;i<=1;i++) {
					
					for(int j=1;j<=cols.size();j++) {
						
						System.out.print(driver.findElement(By.xpath("//*[@name='courses']/tbody/tr["+i+"]/th["+j+"]")).getText()+"  ");
						
						
					}
				
				}for(int i=2;i<=rows.size();i++) {
					
					for(int j=1;j<=cols.size();j++) {
						
						System.out.print(driver.findElement(By.xpath("//*[@name='courses']/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
						
						
					}
					
					System.out.println();
				
				}
				
				
				
				
				
				
		
			}
		
		}
