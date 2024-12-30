package Launch_browser;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.name("q"));  
		e1.sendKeys("MANCHERIAL");
		Thread.sleep(2000);
	driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	Date d1= new Date();
	
	TakesScreenshot a1=        driver;
	File SOURCE=     a1.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\sanja\\Desktop\\snehika Screenshot program\\screenshot1".concat(d1.getTime() +".png"));
	FileHandler.copy(SOURCE, destination);
	
	//File destination= new File("C:\\Users\\sanja\\Desktop\\snehika program\\firstscreenshot.png");
		//File destination= new File("C:\\Users\\sanja\\Desktop\\snehika program\\firstscreenshot"+Math.random()+".png");
		//if we want to run same program multiple times then and save image with diff extensions.

	}

}
