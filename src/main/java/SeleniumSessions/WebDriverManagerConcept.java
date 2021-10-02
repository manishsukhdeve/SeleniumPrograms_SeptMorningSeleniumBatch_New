package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup(); // WebDriverManager: check which operating system using, chromedriver: install latestsetup from the internet, setup: launch the chrome browser.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		String title =  driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
