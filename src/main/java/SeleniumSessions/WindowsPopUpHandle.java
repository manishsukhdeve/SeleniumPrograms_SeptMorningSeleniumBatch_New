package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopUpHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		System.out.println("Page Title is : " + driver.getTitle());
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handle = driver.getWindowHandles();
		
		Iterator<String> it = handle.iterator();
		
		String ParentWindowid = it.next();
		
		System.out.println("Parent Window id : " + ParentWindowid);
		
		String ChildWindowid = it.next();
		
		System.out.println("Child Window id : " + ChildWindowid);
		
		driver.switchTo().window(ChildWindowid);
		System.out.println("Child Window Title : " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindowid);
		System.out.println("Parent Window Title : " + driver.getTitle());
		
		driver.quit();

	}

}
