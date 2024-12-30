package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.name("email")).sendKeys("snehika.tumma@gmail.com");
		driver.findElement(By.id("continue")).click();
				driver.findElement(By.name("password")).sendKeys("3873485");
				driver.findElement(By.id("signInSubmit")).click();

	}

}
