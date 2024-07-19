package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOne {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		String omayoWindowId = driver.getWindowHandle();

		WebElement popUpLink = driver.findElement(By.linkText("Open a popup window"));
		popUpLink.click();

		WebElement bloggerWindowLink = driver.findElement(By.linkText("Blogger"));
		bloggerWindowLink.click();

		Set<String> windowIds = driver.getWindowHandles();

		for (String windowID : windowIds) {

			driver.switchTo().window(windowID);

			String actualTittle = driver.getTitle();

			if (actualTittle.equals("New Window")) {

				WebElement popupWindowHeading = driver.findElement(By.xpath("//h3"));
				String popupWindowHeadingText = popupWindowHeading.getText();
				System.out.println(popupWindowHeadingText);
				break;
			}

		}
		for (String windowID : windowIds) {

			driver.switchTo().window(windowID);

			String actualTittle = driver.getTitle();

			if (actualTittle.equals("Blogger.com - Create a unique and beautiful blog easily.")) {

				WebElement siginOption = driver.findElement(By.xpath("//span[text()='Sign in']"));
				siginOption.click();
				break;
			}

		}
		driver.switchTo().window(omayoWindowId);
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");
		
		driver.quit();
	}
	//Day 47 video inspired

}
