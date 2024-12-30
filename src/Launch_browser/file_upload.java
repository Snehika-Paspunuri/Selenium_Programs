package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class file_upload {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement name1=driver.findElement(By.id("fname"));
		name1.sendKeys("Snehika");
		WebElement name2=driver.findElement(By.id("lname"));
		name2.sendKeys("Tumma");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("Nisha.snehika@gmail.com");
		WebElement pw=driver.findElement(By.id("password"));
		pw.sendKeys("$nehiakshd029");
		WebElement gender=driver.findElement(By.id("Female"));
		gender.click();
		WebElement skill=driver.findElement(By.id("Skills"));
	
		Select s1=new Select(skill);
		s1.selectByIndex(2);
		
		WebElement country=driver.findElement(By.id("Country"));
		Select s2=new Select(country);
		//s2.selectByValue("India");
		s2.selectByVisibleText("India");
		WebElement paddress=driver.findElement(By.name("Present-Address"));
		paddress.sendKeys("hdweu cjwefe djcwuie");
		
		WebElement peraddress=driver.findElement(By.id("Permanent-Address"));
		peraddress.sendKeys("Same as present");
		
		WebElement code=driver.findElement(By.id("Pincode"));
		code.sendKeys("54208");
		
		Thread.sleep(2000);
		WebElement religion=driver.findElement(By.id("Relegion"));
		Select r1=new Select(religion);
		r1.selectByVisibleText("Hindu");
		
		WebElement v1=driver.findElement(By.id("file"));
	v1.sendKeys("C:\\Users\\sanja\\Downloads\\learningHTML.pdf");
	
	
	WebElement relocate=driver.findElement(By.id("relocate"));
	relocate.click();
	WebElement submit=driver.findElement(By.name("Submit"));
	submit.click();
		
		

	}

}
