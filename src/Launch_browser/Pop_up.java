package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/sanja/Downloads/grotechminds.html");
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

	}

}
