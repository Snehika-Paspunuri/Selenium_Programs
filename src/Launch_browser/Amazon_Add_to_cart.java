package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Add_to_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		WebElement w1= driver.findElement(By.xpath("(//input)[5]"));
		w1.sendKeys("Shoes");
		w1.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement w2=driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		w2.click();
		WebElement w3=driver.findElement(By.id("add-to-cart-button"));
		w3.click();
	}

}
