package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstwebdriverProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  WebDriver driver = new FirefoxDriver();
   
 driver.get("http://newtours.demoaut.com/");  
   System.out.println("Mercury web tour page opened");
  System.out.println("Print the Title of the page");
  driver.getTitle();
  System.out.println (driver.getTitle());
  //click on REGISTER link
  driver.findElement(By.linkText("REGISTER")).click();
  //Enter first name
  driver.findElement(By.name("firstName")).sendKeys("Domin");
//Enter Last name
  driver.findElement(By.name("lastName") ).sendKeys("Acharya");
//Enter phone number
  driver.findElement(By.name("phone")).sendKeys("9999999");
//Enter email
  driver.findElement(By.id("userName")).sendKeys("prasad@hotmail.com");
//Enter address
  driver.findElement(By.name("address1")).sendKeys("gilroy drive");
  // enter city
  driver.findElement(By.name("city")).sendKeys("Lorton");
  // enter state
  driver.findElement(By.name("state")).sendKeys("VA");
  //enter zipcode
  driver.findElement(By.name("postalCode")).sendKeys("22079");
  //enter user name
  driver.findElement(By.name("email")).sendKeys("prasad");
  //enter password
  driver.findElement(By.name("password")).sendKeys("prasad");
  //enter confirm password
  driver.findElement(By.name("confirmPassword")).sendKeys("prasad");
  //click submit
  driver.findElement(By.name("register")).click();
  //close browser
  driver.close();
  
  
  
  
  
  
  
  

	}

}
