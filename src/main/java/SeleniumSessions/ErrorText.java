package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://account.box.com/login?utm_itc=box-206.1-v0");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("login-email")).sendKeys("Testing");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password-login")).sendKeys("test");
		driver.findElement(By.id("login-submit-password")).click();
		
		String errormessage = driver.findElement(By.className("form-error")).getText();
		
		System.out.println(errormessage);
		
		if (errormessage.equals("Invalid Login Credentials")) {
			System.out.println("Correct error message");
		}
		else
		{
			System.out.println("Invalid error message");
		}
		
		driver.close();

	}

}
