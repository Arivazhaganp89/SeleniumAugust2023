package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//form[@class='_9vtf']/div[5]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("Arivazhagan");
		driver.findElement(By.name("lastname")).sendKeys("P");
		driver.findElement(By.name("reg_email__")).sendKeys("arivo1989@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("arivo1989@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("******");
		WebElement day=	driver.findElement(By.xpath("//select[@id='day']"));
		Select daySelection=new Select(day);
		daySelection.selectByValue("5");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select monthSelection=new Select(month);
		monthSelection.selectByIndex(11);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select yearSelection=new Select(year);
		yearSelection.selectByVisibleText("1989");
		driver.findElement(By.xpath("//span[contains(@class,'_5k_2 _5dba')][1]/label")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.close();
		
		
		
		


	}

}
