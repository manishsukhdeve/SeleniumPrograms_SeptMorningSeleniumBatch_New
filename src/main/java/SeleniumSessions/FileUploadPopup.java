package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("myFile")).sendKeys("D:\\test.jpg");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
