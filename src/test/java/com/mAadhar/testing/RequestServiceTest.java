package com.mAadhar.testing;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class RequestServiceTest {
	WebDriver wd=null;
	  @BeforeTest
	  public void config() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Assesment\\chromedriver-win32\\chromedriver.exe");
		    //create an object to the driver to access the browser componenets 
		    	wd=new ChromeDriver();
		  
		    	wd.manage().window().maximize();
		  	
	  }

  

  @Test
  public void approveRequestTest() {
	  wd.get(" http://localhost:4200/adminHome/viewReq");
	
  }

  @Test
  public void denyRequestTest() {
	  wd.get(" http://localhost:4200/adminHome/viewReq");
	 
  }

  @Test
  public void getAllRequestsTest() {
	  wd.get(" http://localhost:4200/adminHome/viewReq");
	 
  }

  @Test
  public void storeRequestTest() {
	  wd.get("  http://localhost:4200/userHome/storeReq");
	  
  }
 
  @Test
  public void updateAdharTest() {
	  wd.get("http://localhost:4200/userHome/view");
	
  }

  @Test
  public void viewmyAdharTest() {
	  wd.get("http://localhost:4200/userHome/view");
	 
  }
}
