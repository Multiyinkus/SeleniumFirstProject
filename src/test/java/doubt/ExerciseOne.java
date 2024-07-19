package doubt;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExerciseOne {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.asos.com/men/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement okButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
		okButton.click();

		WebElement headlineText = driver.findElement(By.xpath("//Strong"));
		String headText = headlineText.getText();
		System.out.println(headText);

		driver.findElement(By.linkText("WOMEN")).click();
		
		String furtherReduction = driver.findElement(By.xpath("(//img[@class='hero__image'])[2]")).getAttribute("alt");
		System.out.println(furtherReduction);
		
		driver.close();

	}

}
