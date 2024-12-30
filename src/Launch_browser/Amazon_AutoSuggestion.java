package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		//WebElement w1= driver.findElement(By.xpath("(//input)[5]"));
		WebElement w1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		w1.sendKeys("Shoes");
	
		//div[@class='a-section aok-relative s-image-tall-aspect'][1]
		
		Thread.sleep(4000);
		//WebElement find=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//find.click();
		List<WebElement> auto= driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= auto.size();
		System.out.println(count);
		auto.get(2).click();

		WebElement shoe1= driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'][1])"));
		shoe1.click();
	}

}
