package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafCheckBox {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/checkbox.xhtml");

		//Select the basic checkbox:-
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		//Choose the notification checkbox:-

		driver.findElement(By.xpath("//span[text()='Ajax']")).click();

		//Choose your favorite language:-

		driver.findElement(By.xpath("(//table[@class='ui-selectmanycheckbox ui-widget']/tbody/tr/td/div)[1]")).click();

		//Select the tri state checkbox:-

		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();

		//Select the toggle switch:-

		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		//Verify  if checkbox is disabled:-
		boolean checkBoxEnabled=driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div[2]")).isEnabled();
		if (checkBoxEnabled) {
			System.out.println("checkbox is disabled");
		}else {
			System.out.println("checkbox is enabled");
		}


		//Select the multiple cities:-
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(3000);

		//Close the browser:-
		driver.close();



	}
}


