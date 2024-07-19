package seleniumcommandthree;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitCommandMultipleWindowsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.id("selenium143")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(1000);
		
		driver.quit();

	}

}
