package seleniumcommandthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement buttonOne = driver.findElement(By.id("but2"));
		boolean enableButton = buttonOne.isEnabled();
		
		if (enableButton) {
			System.out.println("EnableButton is in enable state");
			
		}else {
			System.out.println("EnableButton is not disable state");
			
		}
		
		WebElement buttonTwo = driver.findElement(By.id("but1"));
		boolean enableButton2 = buttonTwo.isEnabled();
		
		if(enableButton2) {
			System.out.println("EnableButton2 is in enable state");
			
		}else {
			System.out.println("EnableButton2 is in disable state");
		}
		
		driver.quit();
		

	}

}
