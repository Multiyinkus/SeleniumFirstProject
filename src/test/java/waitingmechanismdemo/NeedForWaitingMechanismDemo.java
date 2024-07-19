package waitingmechanismdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedForWaitingMechanismDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropDownButton = driver.findElement(By.className("dropbtn"));
		dropDownButton.click();
		
		Thread.sleep(20000); // This is not recommended on a live project
		
		WebElement flipkartOption = driver.findElement(By.linkText("Flipkart"));
		flipkartOption.click();
		
		//DAY 63 VIDEO BATCH ONE

	}

}
