package MavenTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathLocater {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		
		driver.findElement(By.linkText("English (US)")).click();
		driver.findElement(By.id("email")).sendKeys("This is a test");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(10000);
		
		
				

	}

}
