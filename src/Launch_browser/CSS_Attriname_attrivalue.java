package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Attriname_attrivalue {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2F%3Fref_%3Dnav_custrec_signin&prevRID=7MNB1M21SV8EW6DZXJ3G&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=auflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=auflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e1=driver.findElement(By.cssSelector("[name='customerName']"));
				e1.sendKeys("Hola");

	}

}
