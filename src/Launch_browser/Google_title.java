package Launch_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_title {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("google"));
		//w1.until(ExpectedConditions.titleContains("gle"));
		//w1.until(ExpectedConditions.urlContains(alertIsPresent()));
		driver.findElement(By.name("q")).sendKeys("India");
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		String title=   driver.getTitle();
		System.out.println(title);

	}


	}

