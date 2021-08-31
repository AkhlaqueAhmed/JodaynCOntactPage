package MavenTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locaters {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(20000);
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(20000);
		
		
		driver.findElement(By.linkText("English (US)")).click();
		
		driver.findElement(By.className("inputtext")).sendKeys("Test");
		
		Thread.sleep(10000);
	}

}
