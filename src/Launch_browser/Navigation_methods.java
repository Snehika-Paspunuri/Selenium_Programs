package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_methods {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement d1=driver.findElement(By.className("Pke_EE"));
		d1.sendKeys("Shoes");
		//driver.navigate().refresh();
		d1.sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//driver.get(Url);

	}

}
