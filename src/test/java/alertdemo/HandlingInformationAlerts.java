package alertdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingInformationAlerts {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement informationAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		informationAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		
		alert.accept();
		driver.switchTo().defaultContent();
		
		WebElement result = driver.findElement(By.id("result"));
		String resultText = result.getText();
		System.out.println(resultText);
		
				
		driver.quit();
		
		
		//Video 64 for Batch one

	}

}
