import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class login {
	public static void main(String args[]){
	String browser ="chromedriver";
	WebDriver driver = null;{
	if(browser.equals("mozilla")){
		driver= new FirefoxDriver();
	}
		else if (browser.equals("chrome"));{
		driver= new ChromeDriver ();	
		}
				driver.get("http:\\www.bio-rad.com/");
				String handle=driver.getWindowHandle();
				System.out.println(handle);
				Set<String> handles = driver.getWindowHandles();
				System.out.println(handles);
				for(String handle1:driver.getWindowHandles()){
				System.out.println(handle1);
					driver.switchTo().window(handle1);
					
				System.out.println(driver.getTitle());
				WebElement USA = driver.findElement(By.linkText("USA"));
		        USA.click();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		        
		driver.findElement(By.xpath(".//*[@id='overlaydialognoscroll']"));
					driver.findElement(By.id("portalloginlink")).click();
				}
		        
		          // element = driver.findElement(By.cssSelector("#registerbutton > span"));
		          //Actions builder = new Actions(driver);
		         // builder.moveToElement(element).perform();
		 //driver.findElement(By.linkText("Log In/Register")).click();	
		        } 
	}
}