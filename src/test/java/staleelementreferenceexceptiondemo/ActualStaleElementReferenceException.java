package staleelementreferenceexceptiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActualStaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		WebElement selenium143Link = driver.findElement(By.id("link1"));
		selenium143Link.click();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.navigate().back();
		
		//driver.navigate().refresh();
		
		Thread.sleep(15);
		
		textAreaField = driver.findElement(By.id("ta1"));//web element is redeclared to establish the connection again after navigating to another website
		
		Thread.sleep(15);
		textAreaField.clear();
		textAreaField.sendKeys("Varun Dhawath");
		
		driver.quit();

	}

}
