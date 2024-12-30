package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_google {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=    driver.findElement(By.xpath("(//textarea)[1]"));
		e1.sendKeys("Australia");
		e1.sendKeys(Keys.ENTER);

	}

}
