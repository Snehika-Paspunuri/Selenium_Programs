package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_grotec {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement b1=driver.findElement(By.xpath("//a[@class='elementor-flip-box__button elementor-button elementor-size-sm']"));
b1.click(); 
	}

}
