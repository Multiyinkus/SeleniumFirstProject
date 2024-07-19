package takingscreenshotdemo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakingScreenshotsUsingFileUtilDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File("screenshots\\omayo.png"));// New way using selenium predefine method
		
		//FileUtils.copyFile(srcFile,new File("screenshots\\omayo.png")); This is the old way of taking screenshots
		
		WebElement selenium143Link = driver.findElement(By.id("link1"));
		selenium143Link.click();
		
		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2,new File("screenshots\\selenium143.png"));
		
		
		driver.quit();
		
		//Day 85 video batch one

	}

	public static String generateFileWithTimestamp() {
		Date date = new Date();
		String file = date.toString().replace(" ","_").replace(":","_").concat(".png");
		//String file = date.toString().replace(" ","_").replace(":","_")+ ".png";
		return file;
		
	}
}
