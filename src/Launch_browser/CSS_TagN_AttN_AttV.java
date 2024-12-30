package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_TagN_AttN_AttV {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=/");
		driver.manage().window().maximize();
		WebElement v1=driver.findElement(By.cssSelector("input[class='r4vIwl BV+Dqf']"));
		v1.sendKeys("Honey");

	}

}
