package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_search {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Australia");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		

	}

}
