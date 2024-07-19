package handlingmultiplewindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsFive {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String omayoWindowId = driver.getWindowHandle();
		
		WebElement popupWindowLink = driver.findElement(By.linkText("Open a popup window"));
		popupWindowLink.click();
		
		WebElement bloggerWindowLink = driver.findElement(By.linkText("Blogger"));
		bloggerWindowLink.click();
		
		switchToWindow("New Window",driver); //passing the argument from the method (actual window tittle and windowdriver
		
		WebElement popupWindowHeading = driver.findElement(By.xpath("//h3"));
		String popupWindowHeadingText = popupWindowHeading.getText();
		System.out.println(popupWindowHeadingText);

		switchToWindow("Blogger.com - Create a unique and beautiful blog easily.",driver);
		
		WebElement siginOption = driver.findElement(By.xpath("//span[text()='Sign in']"));
		siginOption.click();
		
		driver.switchTo().window(omayoWindowId);
		
		WebElement textAreaField = driver.findElement(By.id("ta1"));
		textAreaField.sendKeys("Arun Motoori");

	}
	
	
	public static void switchToWindow(String windowTitle,ChromeDriver driver) {//windowTitle to be input here and driver represent the window driver
		
		Set<String> windowIds = driver.getWindowHandles();//windowIds currently have all 3 window inside it
		
		for(String windowId : windowIds) { //windowId can be any name and windowIds will pick one at random
			
			driver.switchTo().window(windowId); //Once the driver pick a window
			
			String actualTitle = driver.getTitle(); //We declare the driver to capture the page title and variable name to be actualTitle
			
			if(actualTitle.equals(windowTitle)) { //We check to see if actualTitle equal to windowTitle provided in the argument
				
				break;
				
			}
			
		}
		

	}

}//video 47 batch one
