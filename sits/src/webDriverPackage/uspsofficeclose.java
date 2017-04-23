package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uspsofficeclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser = new FirefoxDriver();
		browser.get("https://www.usps.com/");
		browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		browser.findElement(By.name("address")).sendKeys("22079");
		browser.findElement(By.name("bSearch")).click();
		//close browser
		browser.close();
		
		
		
		
		
		
		
		

	}

}
