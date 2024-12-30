package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("Shoes");
	Thread.sleep(4000);
	List<WebElement> look=driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search']/ul/li"));
	int count1=look.size();
	System.out.println(count1);
	look.get(count1-1).click();

	}

}
