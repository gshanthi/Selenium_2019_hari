package java_biorad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Biorad_login {
	public static void main(String args[]){
	String browser =("ChromeDriver");
	WebDriver driver = null;{
	if(browser.equals("mozilla")){
		driver= new FirefoxDriver();
	}
		else if (browser.equals("chrome"));{
		driver= new ChromeDriver ();	
		}
		driver.get("www.bio-rad.com");
		driver.findElement(By.linkText("USA")).click();
		driver.findElement(By.id("portalloginlink")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector("#registerbutton > span"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
		
		driver.findElement(By.id("okta-signin-username")).click();
	    driver.findElement(By.id("okta-signin-username")).sendKeys("shanthi");
	    driver.findElement(By.id("okta-signin-password")).click();
	    driver.findElement(By.id("okta-signin-password")).sendKeys("shanthi");
	    driver.findElement(By.id("okta-signin-submit")).click();

	}
}
}