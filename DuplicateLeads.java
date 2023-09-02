package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub:-
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Login:-
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click Leads:-
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Find Leads by using Email:-
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("arivo1989@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//Capture the first resulting name:-
		String firstResultingName=	driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a)[1]")).getText();
		System.out.println("Displayed first name is :"+firstResultingName);
		//Click First Resulting lead
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-firstName')]/a)[1]")).click();
		//Click Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		//Verify the title as 'Duplicate Lead'
		String pageTitle=driver.getTitle();
		if (pageTitle.equalsIgnoreCase("Duplicate Lead")){
			System.out.println("The page is Duplicate Lead");
		} else  {
			System.out.println("We are not in the correct page");
		}
		//Click Create Lead:-
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//Confirm the duplicated lead name is same as captured name:-
		String finalResultingName=	driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println("Displayed first name is  after duplication:"+finalResultingName);
		if (firstResultingName.equalsIgnoreCase(finalResultingName)) {
			System.out.println("Duplicated lead name is same as captured name");
		}else {
			System.out.println("Duplicated lead name is not same as captured name");
		}
		//Close the browser (Do not log out)
		driver.close();
		







	}

}
