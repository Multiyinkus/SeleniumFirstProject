package gettingstarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumCommand {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.get("https://tutorialsninja.com/demo/");
		 WebElement searchBoxField = driver.findElement(By.name("search"));
		 searchBoxField.sendKeys("HP");
		 
		 WebElement searchButton = driver.findElement(By.cssSelector("#search > span > button"));
		 searchButton.click();
		 
		 WebElement hpProduct = driver.findElement(By.linkText("HP LP3065"));
		 boolean displayStatus = hpProduct.isDisplayed();
		 
		 if(displayStatus) {
			 
			 System.out.println("HP product is displayed in search result. Hence, the test have passed");
		
		 }else {
			 
			 System.out.println("HP product not displayed in search result. Hence, the test have failed");
		 }
		 
		 		driver.quit();

	}


}
