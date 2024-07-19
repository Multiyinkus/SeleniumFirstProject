package javascriptexecutordemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		/*
		String pageURL = driver.getCurrentUrl();
		System.out.println(pageURL);
		*/
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String pageURL = jse.executeScript("return document.URL").toString();
		//return means something is expected but will return as object then
		//then we add toString then create string object so as to be able to print
		System.out.println(pageURL);
		
		driver.quit();
		
		//Day 96 batch one video

	}

}
