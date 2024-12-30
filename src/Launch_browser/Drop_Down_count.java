package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_count {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		WebElement choose=driver.findElement(By.id("Choice1"));
		Select choice=new Select(choose);
		choice.selectByValue("Demo3");
		List<WebElement> count=  choice.getOptions();
		System.out.println(count.size());
		

	}

}
