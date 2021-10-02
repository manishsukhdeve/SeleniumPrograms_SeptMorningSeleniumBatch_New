package Selenium_14_ReadExcel_Using_APACHE_POI_API;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://manishtesting2018.wixsite.com/manishresume/contact");
		
		WebElement name = driver.findElement(By.id("input_comp-k5m6p3d8"));
		WebElement email = driver.findElement(By.id("input_comp-k5m6p3dl"));
		
		Thread.sleep(2000);
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
		
		String sheetName = "login";
		
		int rowCount = reader.getRowCount(sheetName);
//		System.out.println(rowCount);
		
		for (int rowNum=2; rowNum<=rowCount; rowNum++) {
			String name1 = reader.getCellData(sheetName, "username", rowNum);
			String email1 = reader.getCellData(sheetName, "email", rowNum);	
			
			System.out.println(name1 + " " + email1);
			
			name.clear();
			name.sendKeys(name1);
			
			email.clear();
			email.sendKeys(email1);
			
		}
		
		
		
	}

}
