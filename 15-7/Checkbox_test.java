package maven_test.test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_test {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\JawharahAlZuhayri\\Desktop\\Trining\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		// ID 
		WebElement check1 = driver.findElement(By.id("bmwcheck"));check1.click();
		//WebElement check2 = driver.findElement(By.id("benzcheck"));check2.click();
	//	WebElement check3 = driver.findElement(By.id("hondacheck"));check3.click();
		
		// css
	/*	WebElement cbox1 = driver.findElement(By.cssSelector("input[value='bmw']"));
		cbox1.click();
		WebElement cbox2 = driver.findElement(By.cssSelector("input[value='benz']"));
		cbox2.click();
		WebElement cbox3 = driver.findElement(By.cssSelector("input[value='honda']"));
		cbox3.click();*/
		
		// xpath
	 /*	WebElement check_box1 = driver.findElement(By.xpath("//input[@id='bmwcheck'] "));
		check_box1.click();
		WebElement check_box2 = driver.findElement(By.xpath("//input[@id='benzcheck'] "));
		check_box2.click();
		WebElement check_box3 = driver.findElement(By.xpath("//input[@id='hondacheck'] "));
		check_box3.click(); */

	}

}
