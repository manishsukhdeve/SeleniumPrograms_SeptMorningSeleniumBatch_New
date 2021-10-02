package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		List<WebElement> imagelist = driver.findElements(By.tagName("img"));
		
		System.out.println("Totoal number of images present in the Amazon : "+ imagelist.size());
		
		for (int i = 0; i<imagelist.size(); i++) {
			String images = imagelist.get(i).getAttribute("src");
			System.out.println(images);
		}
	}

}
