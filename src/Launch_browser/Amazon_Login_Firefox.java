package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Login_Firefox {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com.au/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com.au%2F%3F%26tag%3Dhydramzkw0au-22%26ref%3Dnav_ya_signin%26adgrpid%3D156302824234%26hvpone%3D%26hvptwo%3D%26hvadid%3D673342560235%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D15751349563295812587%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9071475%26hvtargid%3Dkwd-10573980%26hydadcr%3D179_356522&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=auflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	WebElement un=driver.findElement(By.id("ap_email"));
	un.sendKeys("Snehika.tumma@gmail.com");
	WebElement un_continue=       driver.findElement(By.id("continue"));
	un_continue.click();
	WebElement password=   driver.findElement(By.id("ap_password"));
	password.sendKeys("eufhwc33224");
	WebElement signin_button=    driver.findElement(By.id("signInSubmit"));
	signin_button.click();
	}

}
