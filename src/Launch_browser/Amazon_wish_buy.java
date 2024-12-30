package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_wish_buy {

	
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver=new ChromeDriver();
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
			s1.selectByVisibleText("10 US");
			
			Thread.sleep(2000);
			WebElement buy=driver.findElement(By.xpath("(//input[@id='buy-now-button'])"));
			buy.click();

	}

}
