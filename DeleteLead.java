package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//1		Launch the browser
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2		Enter the username
		//3		Enter the password
		//4		Click Login
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//5		Click crm/sfa link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//7		Click Find leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//8		Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-inner']/span)[2]")).click();
		//9		Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		//10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//11	Capture lead ID of First Resulting lead
		String firstID=	driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")).getText();
		System.out.println("The first result id is : "+firstID);
		//12	Click First Resulting lead

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td/div/a)[1]")).click();
		//13	Click Delete
		driver.findElement(By.xpath("(//div[@class='x-panel-header'])[18]/following::a[4]")).click();
		//14	Click Find leads
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstID);
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		Thread.sleep(2000);
		String validationMessage= driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println("Debug123"+validationMessage);

		if (validationMessage.equalsIgnoreCase("No records to display")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		//18	Close the browser (Do not log out)
		driver.close();

	}

}
