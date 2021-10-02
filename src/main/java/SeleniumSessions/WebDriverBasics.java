package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	// 1. Open the browser
		
		driver.get("https://www.google.com");	// 2. Pass URL
		
		String title = driver.getTitle();		// 3. get the page title.
		System.out.println(title);
		
		// 4. Validation point:
		if (title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.quit();	// Close the browser
		
		driver.close();		// Close the browser
		
		System.out.println(driver.getTitle()); // Session ID is null. Using WebDriver after calling quit()?
	}
}
