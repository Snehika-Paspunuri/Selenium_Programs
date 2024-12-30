package Launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_Child {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		WebElement v1=driver.findElement(By.xpath("//span[.='Google']"));
		v1.click();
Set<String> id=  driver.getWindowHandles();
Iterator<String> id1= id.iterator();
String p_id= id1.next();
String c_id=id1.next();
//driver.quit();
 driver.switchTo().window(c_id);

	}

}
