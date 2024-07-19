package seleniumcommandthree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		 WebElement orangeCheckBox = driver.findElement(By.id("checkbox1"));
		 boolean checkBox1Status = orangeCheckBox.isSelected();
		 
		 if(checkBox1Status) {
			 
			 System.out.println("Orange checkbox is in selected state"); 
			 			 
		 }else {
			 
			 System.out.println("orange checkbox is not in selected stated");
		 }
		 
		 WebElement blueCheckBox = driver.findElement(By.id("checkbox2"));
		 boolean checkBox2Status = blueCheckBox.isSelected();
		 
		 if(checkBox2Status) {
			 
			 System.out.println("blue checkbox is in selected state");
			 
		 }else {
			 
			 System.out.println("blue checkbox is not in selected state");
		 }
		 
		WebElement bikeRadio = driver.findElement(By.cssSelector("input[value='Bike']"));
		
		if(bikeRadio.isSelected()) {
			
			System.out.println("bike Radio field is in selected mode");
		
		}else {
			
			System.out.println("bike radio field is not in selected mode");
			
			}
		
		WebElement bicycleRadio = driver.findElement(By.cssSelector("input[value='Bicycle']"));
		
		if(bicycleRadio.isSelected()) {
			
			System.out.println("bicycle radio field is in selected mode");
			
		}else {
			
			System.out.println("bicycle radio field is not in selected mode");
		}
		
		WebElement carRadio = driver.findElement(By.cssSelector("input[value='Car']"));
		
		if(carRadio.isSelected()) {
			
			System.out.println("car radio field is in selected mode");
			
		}else {
			
			System.out.println("car radio field is not in selected mode");
		}
		
		driver.quit();

	}

}
