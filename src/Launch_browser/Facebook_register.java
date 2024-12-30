package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_register {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Snehika");
		driver.findElement(By.name("lastname")).sendKeys("Tumma");
		driver.findElement(By.name("reg_email__")).sendKeys("9384482722");
		driver.findElement(By.id("password_step_input")).sendKeys("8348cdjhcyd");
	}

}
