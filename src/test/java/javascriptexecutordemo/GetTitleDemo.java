package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String pageTitle = (String)jse.executeScript("return document.title;");
		//return means something is expected but will return as object then
		//then we add (String) then create string object so as to be able to print
		System.out.println(pageTitle);
		
		driver.quit();
		
		//Day 96 video batch one

	}

}
