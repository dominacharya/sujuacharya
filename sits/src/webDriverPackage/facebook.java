package webDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	//	 String actualTitle = driver.getTitle();
		
		
		System.out.println("The title of the page is "+driver.getTitle());
driver.close();
	}

}
