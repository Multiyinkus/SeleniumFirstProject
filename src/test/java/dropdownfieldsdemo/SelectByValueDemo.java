package dropdownfieldsdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValueDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement countryDropdown = driver.findElement(By.tagName("select"));
		Select select = new Select(countryDropdown);
		
		select.selectByValue("NGA");
		
		//VIDEO 72 BATCH ONE

	}

}
