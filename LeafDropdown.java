package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/select.xhtml");
		//Select tool dropdown by using select class

		WebElement element=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select sel=new Select(element);
		sel.selectByVisibleText("Selenium");

		//Select Country:-
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();


		//Verify States are loaded whatever belongs to the country:-
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//label[text()='Select City'])")).click();
		String firstState=driver.findElement(By.xpath("//li[@data-label='Chennai']")).getText();
		System.out.println("The first state is :"+firstState);
		//Thread.sleep(2000);
		//	driver.findElement(By.xpath("(//label[text()='Select City'])")).click();
		//String secondState=driver.findElement(By.xpath("//label[text()='Bengaluru']")).getText();
		//System.out.println("The second state is :"+secondState);
		//Thread.sleep(2000);
		//String thirdState=driver.findElement(By.xpath("//li[@data-label='Delhi']")).getText();
		//System.out.println("The third state is :"+thirdState);

		//Choose the course:-
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(2000);
		//Choose one more course:-
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='ReactJs']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
		Thread.sleep(2000);
		//Select the language:-
		driver.findElement(By.xpath("(//li[@class='ui-selectonemenu-item ui-selectonemenu-list-item ui-corner-all'])[5]")).click();
		Thread.sleep(3000);
		//Select the sub language
		driver.findElement(By.xpath("//label[@id='j_idt87:value_label']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		Thread.sleep(3000);
		driver.close();




	}

}
