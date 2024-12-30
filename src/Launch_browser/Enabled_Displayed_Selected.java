package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Displayed_Selected {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
			driver.manage().window().maximize();
			WebElement search_tf=driver.findElement(By.name("q"));
			if(search_tf.isDisplayed() && search_tf.isEnabled())
			{
				search_tf.sendKeys("INDIA");
				
			}
			

	}

}
