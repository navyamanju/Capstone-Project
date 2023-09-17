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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


public class LoginServiceTest {
	WebDriver wd=null;
  @BeforeTest
  public void config() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Assesment\\chromedriver-win32\\chromedriver.exe");
	    //create an object to the driver to access the browser componenets 
	    	wd=new ChromeDriver();
	  
	    	wd.manage().window().maximize();
  }

  

  
  @Test
  public void signInTest() {
	  wd.get("http://localhost:4200/login");
	  WebElement emailInput = wd.findElement(By.id("emailid"));
      WebElement passwordInput = wd.findElement(By.id("password"));
      WebElement loginButton = wd.findElement(By.cssSelector(".btn-dark"));

      // Enter login details
      emailInput.sendKeys("navyamanju@gmail.com");
      passwordInput.sendKeys("navya@123");

      // Select user type (admin/user)
      WebElement userType = wd.findElement(By.cssSelector("[value='admin']"));
      userType.click();

      // Click on the login button
      loginButton.click();

      
      // Add assertions or further steps based on success or error messages
      // For example:
      // assertTrue(successMessage.isDisplayed());
      // assertFalse(errorMessage.isDisplayed());
	 
  }

  @Test
  public void signUpTest() {
	  wd.get(" http://localhost:4200/signup");
	  
  }
}


