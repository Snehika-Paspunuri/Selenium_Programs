package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TagName_id {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement n1=driver.findElement(By.cssSelector("textarea#APjFqb"));
		n1.sendKeys("Snehika");

	}

}
