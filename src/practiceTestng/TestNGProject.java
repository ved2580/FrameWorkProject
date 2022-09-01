package practiceTestng;

import org.testng.annotations.Test;

import utility.Log;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGProject 
{
	@Test
	public void tc001()
	
	{
		DOMConfigurator.configure("log4j.xml");
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit", Keys.ENTER);
		Log.info("Login Done");
		
		driver.quit();
		
		
		
	}
	
	public void open() {
		DOMConfigurator.configure("log4j.xml");
		System.out.println("Open successfully");
		Log.info("OpenApplication");
	}
	public void close() {
		DOMConfigurator.configure("log4j.xml");
		System.out.println("Close Sucessully");
		Log.info("Close Application");
	}

}
