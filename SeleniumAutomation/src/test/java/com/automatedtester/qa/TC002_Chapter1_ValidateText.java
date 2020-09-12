package com.automatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC002_Chapter1_ValidateText {

  
  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC002() throws InterruptedException {
	  
	  //STEP 1
	  
	  Reporter.log("Launch autometdtester app");
	  System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //STEP 2
	  
	  Reporter.log("Click en la opcion chapter1");
	  driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();;
	 //driver.findElement(By.xpath ("//a[contains(text(), 'Chapter1' )]")).click();;	
	 
	  //STEP 3
	  
	  Reporter.log("Seleccionndo el DropDown");
	  Select dd_selenium = new Select (driver.findElement(By.xpath("//*[@id='selecttype']")));
	  dd_selenium.selectByValue("Selenium IDE");
	  Thread.sleep(3000);
	  
	  //STEP 4
	  Reporter.log("Validate text Assertion");
	  String lbl_assert = driver.findElement(By.xpath("//*[@id=\"divontheleft\"]")).getText();
	  Assert.assertEquals(lbl_assert, "Assert that this text is on the page");
	  Thread.sleep(3000);
	  
	  //STEP5
	  Reporter.log("Click on Home Page");
	  driver.findElement(By.xpath("/html/body/div[2]/p[4]/a")).click();
	  Thread.sleep(3000);
	  
	  //STEP 6
	  Reporter.log("Cerrando Navegador");
	  driver.close();
  }  
	  
	  
  @AfterTest
  public void afterTest() {
  }

}
