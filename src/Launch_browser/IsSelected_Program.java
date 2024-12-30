package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Program {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sanja/Downloads/grotechminds.html");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	
	WebElement male_radio= driver.findElement(By.id("123"));
	boolean b1=male_radio.isSelected();
	if(b1==true)
	{
		System.out.println("Its selected");
		
	}
	else
	{
		System.out.println("Not selected");
	}
	male_radio.click();
		System.out.println("I have selected now");
	

	}

}
