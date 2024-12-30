package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_register {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au");
		driver.manage().window().maximize();
		
		WebElement accountsandlist=   driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1= new Actions(driver);
		a1.moveToElement(accountsandlist).perform();
		Thread.sleep(2000);
		WebElement signin=  driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		
		WebElement creataccount=driver.findElement(By.id("createAccountSubmit"));
		creataccount.click();
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.id("ap_customer_name"));
		un.sendKeys("nikky tumma");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("nisha.tumma@gmail.com");
		
		WebElement pwd=driver.findElement(By.id("ap_password"));
		pwd.sendKeys("$hopping123");
		
		WebElement repwd=driver.findElement(By.id("ap_password_check"));
		repwd.sendKeys("$hopping123");
		
		WebElement cont= driver.findElement(By.id("auth-continue"));
		cont.click();
		
		
		
		

	}

}
