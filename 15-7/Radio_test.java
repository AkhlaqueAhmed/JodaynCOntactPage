package maven_test.test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_test {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JawharahAlZuhayri\\Desktop\\Trining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		// Id att
		WebElement radio1=driver.findElement(By.id("i-bmwradio"));radio1.click();
		WebElement radio2=driver.findElement(By.id("i-benzradio"));radio2.click();
		WebElement radio3=driver.findElement(By.id("i-hondaradio"));radio3.click();
		
		//CSS selctor
		/*WebElement rbutton1 = driver.findElement(By.cssSelector("input[value='BMW']"));
		rbutton1.click();
		WebElement rbutton2 = driver.findElement(By.cssSelector("input[value='Benz']"));
		rbutton2.click();
		WebElement rbutton3 = driver.findElement(By.cssSelector("input[value='Honda']"));
		rbutton3.click(); 
		
		// xpath
		WebElement radio11 = driver.findElement(By.xpath("//input[@id='i-bmwradio']"));
		radio11.click();
		WebElement radio21 = driver.findElement(By.xpath("//input[@id='i-benzradio']"));
		radio21.click();
		WebElement radio31 = driver.findElement(By.xpath("//input[@id='i-hondaradio']")); 
		radio31.click();*/
		
} 
	}
