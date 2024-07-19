package alertdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingConfirmationAlertsDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement cofirmAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		cofirmAlertButton.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String textOnAlert = alert.getText();
		System.out.println(textOnAlert);
		
		//Thread.sleep(3000);
		
		//alert.accept();
		alert.dismiss();
		
		driver.switchTo().defaultContent();
		
		WebElement result = driver.findElement(By.id("result"));
		String resultText = result.getText();
		System.out.println(resultText);
		
		//Thread.sleep(3000);
		
		driver.quit();
		
		//DAY 65 VIDEO BATCH ONE
	}

}
