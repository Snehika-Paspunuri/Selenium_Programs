package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_browsers {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	//driver.get("https://www.google.com");
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000); 
	driver.manage().window().minimize();
	Thread.sleep(5000);
	 
	/*System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	
	EdgeDriver driver1=new EdgeDriver();
	driver1.get("https://www.edge.com");
	
	FirefoxDriver driver3=new FirefoxDriver();
	driver3.get("https://www.firefox.com");*/
}

}
