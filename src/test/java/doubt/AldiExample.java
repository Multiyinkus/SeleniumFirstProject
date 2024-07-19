package doubt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AldiExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aldi.co.uk/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement cookies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='onetrust-accept-btn-handler']")));
		cookies.click();
		
		
		//driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement onlineLeaflet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://cdn.aldi-digital.co.uk//C_SpringboardMay-COL-4-1_20240418_UK.jpg?o=HUWx4Pl5On102jrTIX1S5AIpVksj&V=kADX&p=2&w=260&h=260&q=70']")));
		onlineLeaflet.click();
		
	
		WebElement signupLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("close-icon")));
		signupLogo.click();
	
		
		//driver.findElement(By.xpath("//img[@src='https://cdn.aldi-digital.co.uk//C_SpringboardMay-COL-4-1_20240418_UK.jpg?o=HUWx4Pl5On102jrTIX1S5AIpVksj&V=kADX&p=2&w=260&h=260&q=70']")).click();
		driver.findElement(By.xpath("//img[@src=\"https://cdn.aldi-digital.co.uk//C_Thur20-COL-1A-DL-LP_20240618_UK.jpg?o=slGb7Hk9PjxO1VZz7MiDsgx0yKAj&V=76cL&p=2&w=250&h=139&q=80\"]")).click();
		
		driver.quit();

	}

}
