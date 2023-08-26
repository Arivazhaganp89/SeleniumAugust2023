package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Peopleone Technologies");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Arivazhagan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("P");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Arivu");
		driver.findElement(By.name("departmentName")).sendKeys("QA Department");
		driver.findElement(By.name("description")).sendKeys("Test Description");
		Thread.sleep(5000);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("arivo1989@gmail.com");
		WebElement ele=	driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();

		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important Note Column");
		driver.findElement(By.name("submitButton")).click();

		String pageTitle=driver.getTitle();
		System.out.println("The page title is :"+pageTitle);
		driver.quit();




	}

}
