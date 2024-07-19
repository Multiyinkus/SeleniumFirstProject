package xpathdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.asos.com/men/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.close();

	/*	driver.findElement(By.xpath("(//span[contains(@class,'cSfPh9_')])['+i+'']"));

		
		driver.close();
		System.out.println("End of program");*/
	}

}
