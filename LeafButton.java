package week2.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafButton {

	public static void main(String[] args) {
		//https://www.leafground.com/button.xhtml
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/button.xhtml");
		//	1. Click and Confirm title
		driver.findElement(By.xpath("(//h5[text()='Click and Confirm title.']/following::button)[1]")).click();
		String pageTitle=driver.getTitle();
		System.out.println("The page title is : "+pageTitle);
		// Navigate to the original page:-
		driver.navigate().to("https://www.leafground.com/button.xhtml");
		//		2. Confirm if the button is disabled
		boolean buttonEnabledorNot=	driver.findElement(By.xpath("(//h5[text()='Confirm if the button is disabled.']/following::button)[1]")).isEnabled();
		if (buttonEnabledorNot==true){
			System.out.println("Button is enabled");
		}else {

			System.out.println("Button is disabled");
			//		3. Find the position of the Submit button
			Point coordinates=	driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text ui-c')])[3]")).getLocation();
			System.out.println("The position of the button is : "+coordinates);
			//Close the browser:-

			driver.close();



		}
	}
}


