package com.fb.qa.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
	public static WebDriver driver;
	public static Logger logs;
	public  static Properties prop;
	
	
	  public TestBase() throws Exception 
	  { 
		  FileInputStream fis=new FileInputStream("C:\\Users\\91910\\git\\Meta_Facebook_Videos\\Facebook_01\\src\\main\\java\\com\\fb\\qa\\config.properties"); 
		  prop =new Properties();
		  prop.load(fis);
	 }
	 
	
	public void initalization()
	{
		String browsername= prop.getProperty("browser");
		 //String browsername="Chrome";
		
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91910\\OneDrive\\Desktop\\Java\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\91910\\OneDrive\\Desktop\\Java\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		//driver.get("https://www.facebook.com/");
		
	}

}
