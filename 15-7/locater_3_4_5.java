package maven_test.test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locater_3_4_5 {
	public static void main(String[] args) {
		  // System.setProperty("webdriver.chrome.driver","C:\\Users\\JawharahAlZuhayri\\Desktop\\Trining\\chromedriver_win32\\chromedriver.exe");
		   
		WebDriverManager.chromedriver().setup();

	      WebDriver driver = new ChromeDriver();
	      
	      // browser type and chromedrover.exe path as parameters
	      
		driver.get("https://courses.letskodeit.com/login");
		driver.findElement(By.name("email")).sendKeys("emailaddress");
		driver.findElement( By.id("password")).sendKeys("1687548");
		driver.findElement(By.name("enter-name")).sendKeys("jojo");
		driver.findElement(By.linkText("Forgot password?")).click();
		//driver.findElement(By.className("btn btn-default btn-block btn-md dynamic-button")).click();
		////driver.findElement(By.xpath("*[@id="password"]")).click(); for password
		driver.findElement(By.xpath("//*[@id=\"page\"]/div[2]/div/div/div/div/form/div[4]/div[1]/input")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
	   }
}
