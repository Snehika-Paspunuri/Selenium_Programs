package Launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_Parent_Child {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement d1=driver.findElement(By.className("Pke_EE"));
		d1.sendKeys("Shoes");
		d1.sendKeys(Keys.ENTER); 
		WebElement d2=driver.findElement(By.xpath("//img[@class='_53J4C-']"));
		d2.click();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		//driver.close();// will close parent tab.
		
		Iterator<String> pcid=s1.iterator();
		String parentid=  pcid.next();
		String childid=   pcid.next();
		System.out.println(parentid);
		System.out.println(childid);
		Thread.sleep(4000);
		
		//driver.close();// will close parent tab.
		
		driver.switchTo().window(childid);
		//driver.close();//will close child window.
		
		//WebElement Buynow=driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']"));
		WebElement Buynow=driver.findElement(By.cssSelector("span.OGrnIL"));
		Buynow.click();
		

	}

}
