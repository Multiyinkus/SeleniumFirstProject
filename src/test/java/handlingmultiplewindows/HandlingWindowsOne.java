package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsOne {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");
		String omayoWindowId = driver.getWindowHandle();

		WebElement bloggerLink = driver.findElement(By.linkText("Blogger"));
		bloggerLink.click();

		Set<String> windowIds = driver.getWindowHandles();

		for (String windowid : windowIds) {

			driver.switchTo().window(windowid);
			String expectedTittle = "Blogger.com - Create a unique and beautiful blog easily.";
			String actualTittle = driver.getTitle();

			if (actualTittle.equals(expectedTittle)) {

				break;
			}

		}
		WebElement signInButton = driver.findElement(By.xpath("/html/body/header/div[1]/div[2]/a[1]/span"));
		signInButton.click();

		driver.close();

		driver.switchTo().window(omayoWindowId);
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		
		textAreaField.sendKeys("Arun Motoori");

		driver.close();
		
		System.out.println("End of program");

	}

}
