package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

public class Test_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(4000);
		WebElement f1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(f1);
		//s1.selectByVisibleText("Baby");
		//s1.selectByIndex(3);
		s1.selectByValue("search-alias=baby");
		WebElement g1=driver.findElement(By.id("twotabsearchtextbox"));
		g1.sendKeys("Socks");
		

	}

}
