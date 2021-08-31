package UITest;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {

		
		//System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Browserdriver\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		// driver.manage().deleteAllCookies();

		driver.get("https://www.jodayn.com");

		driver.manage().window().maximize();

		driver.quit();

	}

}
