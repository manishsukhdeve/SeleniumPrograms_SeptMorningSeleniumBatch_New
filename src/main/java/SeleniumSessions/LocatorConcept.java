package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shift4shop.com/login-page.html");
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
		
		// 1. id:
//		WebElement email = driver.findElement(By.id("login-email"));
//		email.sendKeys("Test@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.id("login-pw"));
//		pwd.sendKeys("test123");
		
//		driver.findElement(By.id("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("login-pw")).sendKeys("test123");
//		driver.findElement(By.id("mySubmit")).click();
		
		// 2. name:
//		WebElement email = driver.findElement(By.name("username"));
//		email.sendKeys("manish@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.name("password"));
//		pwd.sendKeys("test123");
//		
//		driver.findElement(By.name("button")).click();
		
		// 3. xpath:
//		driver.findElement(By.xpath("//*[@id=\'login-email\']")).sendKeys("test123@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\'login-pw\']")).sendKeys("test456");
//		driver.findElement(By.xpath("//*[@id=\'mySubmit\']")).click();
		
		// 4. Css Selector:
//		WebElement email = driver.findElement(By.cssSelector("#login-email"));
//		email.sendKeys("test@gmail.com");
//		
//		WebElement pwd = driver.findElement(By.cssSelector("#login-pw"));
//		pwd.sendKeys("test123");
//		
//		WebElement login = driver.findElement(By.cssSelector("#mySubmit"));
//		login.click();
		
		// 5. ClassName:
//		driver.findElement(By.className("inpage-form-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("inpage-form-phone")).sendKeys("test456");
//		driver.findElement(By.className("inpage-form-submit")).click();
		
		// 6. LinkText:
//		WebElement link = driver.findElement(By.linkText("submitting a ticket"));
//		link.click();
		
		//7. PartialLinkText:
		driver.findElement(By.partialLinkText("ticket")).click();
		String link = driver.getCurrentUrl();
		System.out.println(link);		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
