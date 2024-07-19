package gettingstarted;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllGetDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close();

	}

}
