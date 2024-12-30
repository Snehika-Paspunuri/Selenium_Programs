package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		Thread.sleep(4000);
		WebElement f1=driver.findElement(By.id("day"));
		Select s1=new Select(f1);
		s1.selectByValue("22");//method for select class
		WebElement f2=driver.findElement(By.id("month"));
		Select s2=new Select(f2);
		s2.selectByVisibleText("Jul");
		WebElement f3=driver.findElement(By.id("year"));
		Select s3=new Select(f3);
		s3.selectByIndex(32);
		


	}

}
