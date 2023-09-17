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

  
  @AfterTest
  public void afterClass() {
	  driver.close();
  }


  @Test
  public void approveRequestTest() {
	  driver.get("http://localhost:4200/approve");
	
  }

  @Test
  public void denyRequestTest() {
	  driver.get("http://localhost:4200/deny");
	 
  }

  @Test
  public void getAllRequestsTest() {
	  driver.get("http://localhost:4200/veiwAll");
	 
  }

  @Test
  public void storeRequestTest() {
	  driver.get("http://localhost:4200/apply");
	  
  }

  @Test
  public void updateAdharTest() {
	  driver.get("http://localhost:4200/updateaadhar");
	
  }

  @Test
  public void viewmyAdharTest() {
	  driver.get("http://localhost:4200/viewmyadhar");
	 
  }
}
