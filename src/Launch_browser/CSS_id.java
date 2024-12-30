package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_id {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("INDIA");
		

	}

}
