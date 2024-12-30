package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_Of_links {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com.au");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=  links.size();
		System.out.println(count);
		
		for(int i=0; i<count;i++)
		{
			WebElement s1=   links.get(i);
			String link=s1.getAttribute("href");
			System.out.println(link);
			
			String link_text=   s1.getText();
			System.out.println(link_text);
			 
			
		}
	}

}
