package Launch_browser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links {

	public static void main(String[] args) throws IOException {
		
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
				verify_links(link);
	}
	}
			static void verify_links(String url) throws IOException
			{
				try {
				URL u1=new URL(url);
				HttpURLConnection c1= (HttpURLConnection) u1.openConnection();
				c1.connect();
				if(c1.getResponseCode()==200)
				{
					System.out.println("Link is VALID" + c1.getResponseMessage() +" "+c1.getResponseCode());
					
				}
				else
				{
					System.out.println("Link is NOT VALID" + c1.getResponseMessage() +" "+c1.getResponseCode());
				}
				}
				catch(MalformedURLException w1)
				{
					System.out.println("URL was null so I handled it");
				}
				catch(NullPointerException w2)
				{
					System.out.println("URL was null so I handled it");
				}
			}

	
}
