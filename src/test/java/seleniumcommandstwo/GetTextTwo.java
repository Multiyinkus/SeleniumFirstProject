package seleniumcommandstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextTwo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement sammpleTextOne = driver.findElement(By.id("post-body-9023929218208337252"));
		String Text = sammpleTextOne.getText();
		System.out.println(Text);
		
		WebElement sampleTextTwo = driver.findElement(By.cssSelector("#Text1 > div.widget-content"));
		String text = sampleTextTwo.getText();
		System.out.println(text);
		
		WebElement text2 = driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div[1]/h3"));
		String h3 = text2.getAttribute("class");
		System.out.println(h3);
		
		WebElement selenium143One = driver.findElement(By.linkText("Selenium143"));
		selenium143One.click();
		
		driver.close();
		

	}

}
