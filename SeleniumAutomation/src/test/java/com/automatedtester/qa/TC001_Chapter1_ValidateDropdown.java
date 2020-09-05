package com.automatedtester.qa;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC001_Chapter1_ValidateDropdown {

  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC001() throws InterruptedException {
  //STEP 1 
  Reporter.log("Launch autometdtester app");
  System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://book.theautomatedtester.co.uk/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  
  
  //STEP 2
  Reporter.log("click link chapter 1");
  driver.findElement(By.xpath ("//a[contains(text(), 'Chapter1' )]")).click();;	
  WebDriverWait wait = new WebDriverWait(driver, 30);
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));
  
  //STEP 3
  Reporter.log("Click Radio Button");
  driver.findElement(By.xpath("//input[@id='radiobutton']")).click();
  
  //Step 4
//  Reporter.log("Select\"Selenium Core\"from dropdown");
//  Select dd_selenium = new Select(driver.findElement(By.xpath("//select[@id='selecttype']")));
//  dd_selenium.deselectByValue("Selenium Core");
  
  
  //STEP 4
  Reporter.log("Select \"Selenium Core\" from dropdown");
  Select dd_selenium = new Select(driver.findElement(By.xpath("//Select[@id='selecttype']" )));
  dd_selenium.selectByValue("Selenium Code");;
//*[@id="selecttype"]
//*[@id="selecttype"]  
  
  //Step 5
  Reporter.log("Navigate Home page clicking \"Home Page\" link");
  driver.findElement(By.xpath("//a[contains(text(), \"Home\")]")).click();
  Thread.sleep(5000);
  
  //STEP 6
  Reporter.log("Close Browser");
  driver.close();
  
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
