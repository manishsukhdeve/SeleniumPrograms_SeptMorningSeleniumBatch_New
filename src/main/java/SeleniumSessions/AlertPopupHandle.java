package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct error messege");
		}
		else
		{
			System.out.println("Incorrect error messege");
		}
		
		
		alert.accept(); // click on the ok button.
		//alert.dismiss();// click on the cancle button.
		
		driver.close();
	}

}
