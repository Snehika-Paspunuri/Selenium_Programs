package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_amazon {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		WebElement w1= driver.findElement(By.xpath("(//input)[5]"));
		w1.sendKeys("Shoes");
		w1.sendKeys(Keys.ENTER);

	}

}
