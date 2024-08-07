package framedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement firstNameField = driver.findElement(By.name("fname"));
		firstNameField.sendKeys("Arun");
		
		WebElement lastNameField = driver.findElement(By.name("lname"));
		lastNameField.sendKeys("Motoori");
		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(innerFrame);
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("arun@gmail.com");
		
		//DAY 79 Video Batch one

	}

}
