package com.automatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC004_Chapter1_ValidateButtonLoadPage {

  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC004() throws InterruptedException { //throws InterruptedException
  
	  	//STEP 1
	  Reporter.log("Abrir Navegardo");
	  System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	  //STEP 2
  
	  Reporter.log("Click Chapter 1");
	  driver.findElement(By.xpath("/html/body/div[2]/ul/li[1]/a")).click();
	  Thread.sleep(2000);
	  
	  //STEP 3
	  Reporter.log("Ingresar texto");
	// Obtenemos el WebElement correspondiente al textfield
	  WebElement campo = driver.findElement(By.id("storeinput"));
	 //Ingresamos el texto deseado
	  campo.sendKeys("EJEMPLO DE OSCAR");
	  Thread.sleep(5000);
	  
	  //STEP 3.5
	  driver.findElement(By.id("multiplewindow")).click();
	  Thread.sleep(5000);
	  
	  
	  //STEP 4
	  Reporter.log("Cerrando Explorador");
	  driver.close();
  }
  
  
  @AfterTest
  public void afterTest() {
  }

}
