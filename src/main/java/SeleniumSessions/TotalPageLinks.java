package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	System.out.println(driver.getTitle());
	
	List<WebElement> lists = driver.findElements(By.tagName("a"));	
	
	System.out.println(lists.size());
	
	for (int i = 0; i < lists.size(); i++) {
		String links = lists.get(i).getText();
		System.out.println(links);
	}
		
	}

}
