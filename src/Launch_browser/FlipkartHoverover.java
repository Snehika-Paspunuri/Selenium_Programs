package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverover {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement fashions=       driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(fashions).perform();//method of actions class.
		Thread.sleep(2000);
		WebElement tshirt=driver.findElement(By.xpath("(//a[.='Men's T-Shirts']"));
		tshirt.click();

	}

}
