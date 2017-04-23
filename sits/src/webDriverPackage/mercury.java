package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mercury {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =  new FirefoxDriver ();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Domin");
		driver.findElement(By.name("lastName")).sendKeys("Acharya");
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.name("userName")).sendKeys("abcd@");
		driver.findElement(By.name("address1")).sendKeys("123siejdiee");
		driver.findElement(By.name("city")).sendKeys("Alexaria");
		driver.findElement(By.name("state")).sendKeys(" VA");
		driver.findElement(By.name("email")).sendKeys("abcd@");
		driver.findElement(By.name("password")).sendKeys("dharan");
		driver.findElement(By.name("confirmPassword")).sendKeys("dharan");
		driver.findElement(By.name("register")).click();
		System.out.println (  driver.getTitle());
		driver.close();
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
				
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	private static WebDriver newFirefoxDriver() {
		// TODO Auto-generated method stub
		return null;
	}

}
