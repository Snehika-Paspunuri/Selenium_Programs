package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon_Payment {


	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver	driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au");
		driver.manage().window().maximize();
		
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
		
		Thread.sleep(2000);
		WebElement wish=driver.findElement(By.id("wishListMainButton"));
		wish.click();
		
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("snehika.tumma@gmail.com");
		
		WebElement cn=driver.findElement(By.id("continue"));
		cn.click();
		
		WebElement pw=driver.findElement(By.id("ap_password"));
		pw.sendKeys("$hoppinG123");
		
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		
		WebElement size=driver.findElement(By.xpath("(//select[@id='native_dropdown_selected_size_name'])"));
		//size.click();
		Select s1=new Select(size);
		s1.selectByVisibleText("7 US");
		
		Thread.sleep(2000);
		WebElement buy=driver.findElement(By.xpath("(//input[@id='buy-now-button'])"));
		buy.click();


		WebElement addcard=driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));
		addcard.click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='ApxSecureIframe-pp-S9jD1S-8']")));
		
		WebElement cardno=driver.findElement(By.xpath("//input[@name='addCreditCardNumber']"));
		cardno.sendKeys("1972926789786789");
		
		WebElement cardname=driver.findElement(By.xpath("//input[@name='ppw-accountHolderName']"));
		cardname.sendKeys("Name Nisha");
		
		WebElement date=driver.findElement(By.xpath("(//span[@class='a-button-text a-declarative'])[1]"));
		//size.click();
		Select s2=new Select(date);
		s2.selectByVisibleText("03");
		
		driver.switchTo().defaultContent(); 
		
		
	}

}
