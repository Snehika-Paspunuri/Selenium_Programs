package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Tagname_Classnamevalue {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement v1=driver.findElement(By.cssSelector("textarea.gLFyf"));
		v1.sendKeys("Sucess");

	}

}
