package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClick_Notworking {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
driver.manage().window().maximize();
WebElement s1=driver.findElement(By.className("login_button"));
s1.click();
WebElement un=driver.findElement(By.cssSelector("#username"));
un.sendKeys("snehikatumma");
WebElement pw=driver.findElement(By.cssSelector("#label2"));
pw.sendKeys("@suengdy29");
WebElement cp=driver.findElement(By.cssSelector("#loginCaptchaValue"));
cp.sendKeys("29SW2");
	}

}
