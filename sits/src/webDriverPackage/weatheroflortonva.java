package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class weatheroflortonva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread.sleep(500);
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		//can replace driver to  browser.
	    driver.findElement(By.name("q")).sendKeys("Lorton VA weather");
	    driver.findElement(By.name("btnG")).click();
	    
	    ///can do browser.findelement(By.name(" btnG")).click();
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		

	} 
}