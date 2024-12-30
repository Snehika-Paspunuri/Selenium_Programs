package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Xpath_amazon_login {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		WebElement  e1= driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
	//	e1.sendKeys(Keys.ENTER);
	//	e1.click();
		Actions a1= new Actions(driver);
		a1.moveToElement(e1).perform();

	}

}
