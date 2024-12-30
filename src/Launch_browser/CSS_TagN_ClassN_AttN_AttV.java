package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TagN_ClassN_AttN_AttV {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		WebElement b1=driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
		b1.sendKeys("Dresses");

	}

}
