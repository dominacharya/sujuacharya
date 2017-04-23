package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class itrymyself {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//open browser
		driver.get(" http://newtours.demoaut.com/");
		// open newtours
		 driver.findElement(By.linkText("REGISTER")).click();
		 // click on register link
		 driver.findElement(By.name("firstName")).sendKeys("Madhav");
		 // enter first name
		 driver.findElement(By.name("lastName")).sendKeys("Acharya");
		 // enter last name
		 driver.findElement(By.name("phone")).sendKeys("9999999");
		 //enter phone number
		 driver.findElement(By.id("userName")).sendKeys("abcd@gmail.com");
		 //enter email address
		 driver.findElement(By.name("address1")).sendKeys("222halwis st");
		 //enter home address
		 driver.findElement(By.name("city")).sendKeys("Alexanria ");
		 //enter city name
		 driver.findElement(By.name("state")).sendKeys("VA");
		 driver.findElement(By.name("postalCode")).sendKeys("22303");
		 driver.findElement(By.name("email")).sendKeys(" abcd@gmail.com");
		 driver.findElement(By.name( "password")).sendKeys("suju");
		 driver.findElement(By.name( "confirmPassword")).sendKeys("suju");
		 driver.findElement(By.name("register")).click();
		 driver.close();
		 
		 
				 
		
		
		
		

	}

}
