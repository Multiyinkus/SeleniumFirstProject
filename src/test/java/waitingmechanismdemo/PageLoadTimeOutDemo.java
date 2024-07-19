package waitingmechanismdemo;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOutDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		//long startTime = System.currentTimeMillis(); code to get the time taken for element to appear
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//long endTime = System.currentTimeMillis(); code to get the time taken for element to appear
		//System.out.println((endTime-startTime)/1000); code to get the time taken for element to appear

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.quit();

		//DAY 63 VIDEO BATCH ONE
	}

}
