package takingscreenshotdemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshotDemo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		WebElement shoppingCartButton = driver.findElement(By.xpath("//button[contains(@class,'btn-inverse')]"));
		File srcFile = shoppingCartButton.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile,new File("screenshots\\shoppingCartButton.png"));
		
		WebElement navBar = driver.findElement(By.xpath("//button[@data-toggle='collapse']/following::div[@class='collapse navbar-collapse navbar-ex1-collapse']"));
		File srcFile2 = navBar.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2,new File("screenshots\\navBar.png"));
		
		System.out.println("End of this script.");
		
		driver.quit();
		
		//Day 85 video batch one

	}

}
