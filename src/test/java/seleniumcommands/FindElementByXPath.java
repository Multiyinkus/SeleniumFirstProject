package seleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementByXPath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
		//WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]"));
		loginButton.click();

	}

}
