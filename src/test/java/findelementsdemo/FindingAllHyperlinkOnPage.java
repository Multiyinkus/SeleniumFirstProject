package findelementsdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingAllHyperlinkOnPage {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));// for images //img,//button
		 
		 		
		for(WebElement k : links) {
			
			String linkText = k.getText();
			String linkUrl = k.getAttribute("href");
			
			System.out.println(linkText+ ":"+linkUrl);
		}
		driver.quit();
	}
	//Day 44 batch one
}
