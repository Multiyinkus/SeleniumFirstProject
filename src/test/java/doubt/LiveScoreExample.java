package doubt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LiveScoreExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.livescore.com/en/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement ageRestriction = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='le'][text()='18 & Over']")));
		ageRestriction.click();
		//driver.findElement(By.xpath("//button[@class='le'][text()='18 & Over']"));
		
		driver.findElement(By.xpath("//div[@class='to']/div[text()='Belgium']")).click();
		driver.quit();

	}

}
