package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeClickableDemoTwo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check this']"));
		checkButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement checkBoxField  = wait.until(ExpectedConditions.elementToBeClickable(By.id("dte")));
		checkBoxField .click();
		
		driver.quit();
		
		//DAY 63 VIDEO BATCH ONE
	}

}
