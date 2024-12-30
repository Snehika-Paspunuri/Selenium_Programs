package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_login_buy {

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
	
	WebElement email=driver.findElement(By.id("ap_email"));
	email.sendKeys("snehika.tumma@gmail.com");
	
	WebElement cn=driver.findElement(By.id("continue"));
	cn.click();
	
	WebElement pw=driver.findElement(By.id("ap_password"));
	pw.sendKeys("$hoppinG123");
	
	WebElement signin1=driver.findElement(By.id("signInSubmit"));
	signin1.click();
	
	Thread.sleep(3000);
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("Shoes");
	
	Thread.sleep(3000);
	List<WebElement> auto_suggestion = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count=   auto_suggestion.size();
	System.out.println(count);
	auto_suggestion.get(2).click();
	
	Thread.sleep(2000);
	WebElement ss=driver.findElement(By.xpath("(//img[@class='s-image'])[1]")); 
	ss.click();  
	
	WebElement wish=driver.findElement(By.id("add-to-wishlist-button-submit"));
	wish.click();

	}

}
