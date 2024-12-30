package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("snehika.tumma@gmail.com");
driver.findElement(By.id("pass")).sendKeys("38438cjdhefje");
driver.findElement(By.name("login")).click();


	}

}
