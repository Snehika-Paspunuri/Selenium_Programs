package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_add_to_cart {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement d1=driver.findElement(By.className("Pke_EE"));
		d1.sendKeys("Shoes");
		d1.sendKeys(Keys.ENTER);
		WebElement d2=driver.findElement(By.xpath("//img[@class='_53J4C-']"));
		d2.click();
		
		
		WebElement d3=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		d3.click();
		

	}

}
