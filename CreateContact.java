package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) throws InterruptedException {

		/*
		 * //Pseudo Code
		 * 
		 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		 * 
		 * 2. Enter UserName and Password Using Id Locator
		 * 
		 * 3. Click on Login Button using Class Locator
		 * 
		 * 4. Click on CRM/SFA Link
		 * 
		 * 5. Click on contacts Button
		 * 
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.

		 */

		ChromeDriver driver=new ChromeDriver();
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//4. Click on CRM/SFA Link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		// 5. Click on contacts Button
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		//6. Click on Create Contact
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		//7. Enter FirstName Field Using id Locator
		// 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Dhayakaran");
		driver.findElement(By.id("lastNameField")).sendKeys("A");
		// 9. Enter FirstName(Local) Field Using id Locator

		//10. Enter LastName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Local FN");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Local LN");
		// 11. Enter Department Field Using any Locator of Your Choice

		//12. Enter Description Field Using any Locator of your choice 

		// 13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QA Department");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test description123");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("dhayakarana@gmail.com");

		driver.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]")).sendKeys("9884012345");

		// 14. Select State/Province as NewYork Using Visible Text
		WebElement web=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateSelection=new Select(web);
		stateSelection.selectByVisibleText("New York");
		// 15. Click on Create Contact

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// 16. Click on edit button 
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//17. Clear the Description Field using .clear
		driver.findElement(By.id("updateContactForm_description")).clear();
		//18. Fill ImportantNote Field with Any text
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
		// 19. Click on update button using Xpath locator
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		// 20. Get the Title of Resulting Page.
		String pageTitle=driver.getTitle();
		System.out.println("The page title is :"+pageTitle);
		driver.quit();






	}

}
