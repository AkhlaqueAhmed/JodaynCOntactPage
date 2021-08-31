package MavenTest.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSlocater {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(10000);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(10000);

		driver.findElement(By.linkText("English (US)")).click();
		
		driver.findElement(By.cssSelector("#email")).sendKeys("Test@test");
		
		driver.findElement(By.cssSelector("#pass")).sendKeys("123");
		
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText());

	}

}
