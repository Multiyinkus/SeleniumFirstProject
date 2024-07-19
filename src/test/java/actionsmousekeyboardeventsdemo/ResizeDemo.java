package actionsmousekeyboardeventsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		Actions actions = new Actions(driver);
		
		WebElement optionElement = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-se')]"));
		
		actions.pause(3000).dragAndDropBy(optionElement,270,170).perform();
		//exception will come if move to 280 on the X

//Day 84 video batch one

	}

}
