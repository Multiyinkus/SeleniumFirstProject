package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String uRL = driver.getCurrentUrl();
		System.out.println(uRL);//https://omayo.blogspot.com/
		
		WebElement link = driver.findElement(By.linkText("compendiumdev"));
		link.click();
		String uRL2 = driver.getCurrentUrl();//https://testpages.herokuapp.com/basic_web_page.html
		System.out.println(uRL2);
		
		driver.close();

	}

}
