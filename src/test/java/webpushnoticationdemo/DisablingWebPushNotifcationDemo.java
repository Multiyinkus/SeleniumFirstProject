package webpushnoticationdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisablingWebPushNotifcationDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		driver.findElement(By.xpath("//p[text()='Consent']")).click();
		
		driver.quit();
		
		//	DAY 66 BATCH ONE

	}

}
