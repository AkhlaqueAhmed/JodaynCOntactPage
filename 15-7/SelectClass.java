package maven_test.test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\JawharahAlZuhayri\\Desktop\\Trining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
	// Create object of the Select class
	//Select se1 = new Select(driver.findElement(By.xpath("//*[@id='carselect']")));
				
	// Select the option with value "bmw"
	//se1.selectByValue("bmw");
	Select se2 = new Select(driver.findElement(By.xpath("//*[@id='carselect']")));
	
	// Select the option with value "benz"
	se2.selectByValue("benz");
	//Select se3 = new Select(driver.findElement(By.xpath("//*[@id='carselect']")));
	
	// Select the option with value "honda"
	//se3.selectByValue("honda");

}}
