package seleniumcommandstwo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearCommandDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("textbox1")).clear();
		driver.findElement(By.cssSelector("div[id='HTML11'] textarea")).clear();*/
		driver.get("https://www.aldi.co.uk/c/specialbuys/leaflet");
		String aldiHandle = driver.getWindowHandle();
		System.out.println(aldiHandle);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		/*WebElement weekendSpecialLink = driver.findElement(By.xpath("(//picture/img[@src])[9]"));
		weekendSpecialLink.click();
		
		Set<String> windowIds = driver.getWindowHandles();
		
		String weekendWindowId = null;
		
		for(String windowId : windowIds) {
			
			if(!windowId.equals(aldiHandle)) {
				
				weekendWindowId = windowId;
				driver.switchTo().window(windowId);
				break;
			}
			
		}*/
		
				
		driver.close();

	}

}
