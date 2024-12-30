package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHoverOver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com.au");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement accountsandlist=   driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	
		Actions a1= new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
		Thread.sleep(2000);
		WebElement signin=  driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();

	}

}
