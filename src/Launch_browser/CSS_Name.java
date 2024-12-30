package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Name {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:www.flipkart.com");
		driver.manage().window().maximize();
		WebElement v1=driver.findElement(By.cssSelector(".Pke_EE"));
		v1.sendKeys("Books");
		

	}

}
