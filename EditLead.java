package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1	Launch the browser
		// 2	Enter the username
		// 3	Enter the password
		// 4	Click Login
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		// 5	Click crm/sfa link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		// 6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// 7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		// 8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Arivazhagan");
		//9	Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// 10 Click on first resulting lead
		driver.findElement(By.xpath("(//a[text()='Arivazhagan'])[1]")).click();
		// 11 Verify title of the page
		String pageTitle=driver.getTitle();
		System.out.println("The page title is :"+pageTitle);
		// 12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		// 13 Change the company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updated Peopleone Technologies");
		//14 Click Update
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		//Verify updated value is present 
		//15 Confirm the changed name appears
		boolean value=	driver.getPageSource().contains("Updated Peopleone Technologies");
		System.out.println(value);
		// 16 Close the browser (Do not log out)
		driver.close();








	}

}
