package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Substring {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		
		WebElement n1=driver.findElement(By.cssSelector("input[id^='twotab']"));
		n1.sendKeys("winter clothes");
	}

}
