package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_drop_down {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au");
		driver.manage().window().maximize();
		WebElement dd=   driver.findElement(By.id("searchDropdownBox"));
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		dd.sendKeys(Keys.ARROW_DOWN);
		

	}

}
