package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PHPtravels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		//go to phptravels.net
		driver.get("http://phptravels.net");
		//go to my account and click
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
		//drop down menu open
		//driver.findElement(By.name(name))
		//go to sign up and click
		driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		//type first name on the first name field
		driver.findElement(By.name("firstname")).sendKeys("Madhav");
		//type last name on last name field
		driver.findElement(By.name("lastname")).sendKeys("Acharya");
		// type phone number on phone number field.
		driver.findElement(By.name("phone")).sendKeys("123456");
		//type email id on empty field.
		driver.findElement(By.name("email")).sendKeys("sujuac@hotmail.com");
		//type password on empty field.
		driver.findElement(By.name("password")).sendKeys("suju123");
		//renter confirm password on empty field.
		driver.findElement(By.name("confirmpassword")).sendKeys("suju123");
		//click on submit
		driver.findElement(By.xpath("//*[@id='headersignupform']/div[9]/button")).click();
	}
		
}
