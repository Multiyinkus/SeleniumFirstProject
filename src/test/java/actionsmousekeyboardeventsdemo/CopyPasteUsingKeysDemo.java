package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteUsingKeysDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement ta2 = driver.findElement(By.xpath("//h2[text()='Text Area Field Two']/following::textarea"));
		ta2.click();
		ta2.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		ta2.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement ta1 = driver.findElement(By.id("ta1"));
		ta1.click();
		ta1.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		/*Perform Ctrl+A to select all the text in the source area
		 * SourceElement.sendkeys(Keys.chord(Keys.CONTROL,"a"))
		 * 
		 * Perform Ctrl+ C to Copy all the selected text in the source area
		 * SourceElement.sendkeys(Keys.chord(Keys.CONTROL,"c"))
		 * 
		 * Click on the destination element to focus on it
		 * destinationElement.click()
		 * 
		 * Perform Ctrl+V to paste the copied text into the destination element
		 * destinationElement.sendkeys(Keys.chord(Keys.CONTROL,"v"))
		 * 
		 */
  //Day 82 Video batch one
	}

}
