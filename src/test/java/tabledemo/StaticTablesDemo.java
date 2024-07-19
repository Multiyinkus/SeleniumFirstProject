package tabledemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTablesDemo {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	// TO GET THE LIST OF TABLE HEADING //th	
//		List<WebElement> tableHeadings = driver.findElements(By.xpath("//table[@id='table1']//th"));
//		
//		for(WebElement tableHeading : tableHeadings) {
//			System.out.println(tableHeading.getText());
//		}  
		
		//TO GET THE LIST OF TABLE DATA //td
//		List<WebElement> tableDatas = driver.findElements(By.xpath("//table[@id='table1']//td"));
//		
//		for(WebElement tableData : tableDatas) {
//			System.out.println(tableData.getText());
//		}
		
		
		//TO GET THE LIST OF TABLE HEADING AND DATA //tr/*
		
//		List<WebElement> tablehds = driver.findElements(By.xpath("//table[@id='table1']//tr/*"));
//		
//		for(WebElement tablehd : tablehds) {
//			System.out.println(tablehd.getText());
//		}
		
		
		//TO GET THE LISTS OF TABLE DATA IN THE 2ND ROW //tr[2]/td
//		List<WebElement> secondRowDatas = driver.findElements(By.xpath("//table[@id='table1']//tr[2]/td"));
//		
//		for(WebElement data : secondRowDatas) {
//			System.out.println(data.getText());
//		}
		
		//TO GET THE LIST OF TABLE DATA FOR 3RD ROW //tr/td[3]
//		List<WebElement> thirdColumnDatas = driver.findElements(By.xpath("//table[@id='table1']//tr/td[3]"));
//		
//		for(WebElement data : thirdColumnDatas) {
//			System.out.println(data.getText());
//		}
		
		//TO GET THE LIST OF DETAIL ON 2ND ROW , 2ND COLOUM //tr[2]//td[2]
//		List<WebElement> secondRowSecondColumn = driver.findElements(By.xpath("//table[@id='table1']//tr[2]//td[2]"));
//		
//		for(WebElement data : secondRowSecondColumn) {
//			System.out.println(data.getText());
//		}
		
		//TO GET THE LIST OF DETAIL ON 4TH ROW , 3RD COLOUM //tr[4]//td[3]
//		List<WebElement> fourthRowThirdColumn = driver.findElements(By.xpath("//table[@id='table1']//tr[4]//td[3]"));
//		
//		for(WebElement data : fourthRowThirdColumn) {
//			System.out.println(data.getText());
//		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		
		int rowCount = rows.size();
		
		System.out.println(rowCount);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//th"));
		
		int colCount = cols.size();
		
		System.out.println(colCount);
		
		driver.quit();
		

	}

}
