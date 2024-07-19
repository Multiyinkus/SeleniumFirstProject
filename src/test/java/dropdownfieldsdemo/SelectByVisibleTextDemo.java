package dropdownfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownFieldElement = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownFieldElement);
		
		select.selectByVisibleText("doc 3");
		
		//VIDEO 72 BATCH ONE

	}

}
