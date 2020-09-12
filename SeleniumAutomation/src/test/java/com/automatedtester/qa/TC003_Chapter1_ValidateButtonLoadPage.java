package com.automatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.asserts.SoftAssert;

public class TC003_Chapter1_ValidateButtonLoadPage {

  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC003() throws InterruptedException { //Preguntar para que es: throws InterruptedException
   //STEP 1 
	  Reporter.log("Abrir Navegador");
	  System.setProperty("webdriver.chrome.driver","./drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();  
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  //STEP 2
	  
	  Reporter.log("Click en chapter1");
	  driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();;
	  Thread.sleep(3000);
	  //STEP 3
	  
	  Reporter.log("Click en Boton \"load text to the page\"");
	  driver.findElement(By.xpath("//*[@id=\"secondajaxbutton\"]")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  
	  Reporter.log("Verificar Texto");
	  String lbl_assertion = driver.findElement(By.xpath("//div[@id=\"html5div\"]/div")).getText();
	  SoftAssert softAssert = new SoftAssert();
      softAssert.assertEquals(lbl_assertion, "Assert that this text is on the page1729622");
	//Assert.assertEquals(lbl_assertion, "I have been added with a timeout");
	  
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  Thread.sleep(5000);
	  		
	  
	  //Step 4
	  	Reporter.log("HOME PAGE");
	  	driver.findElement(By.xpath("/html/body/div[2]/p[4]/a")).click();
	  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  	Thread.sleep(3000);
	  	
	  	//Sterp 5
	  	Reporter.log("Cierre de Ventana");
	  	driver.close();
	  	Thread.sleep(10000);
	  
	  	softAssert.assertAll();
  
  }
  @AfterTest
  public void afterTest() {
  }

}
