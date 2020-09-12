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

public class TC_TORO1 {
 
  @BeforeTest
  public void beforeTest() {
  }

  @Test
  public void TC_TORO() {
	
	  //STEP 1 ABRIENDO PAGINA PX
	  Reporter.log("Abriendo Explorador");
		System.setProperty("webdriver.chrome.driver", "./drivers/chrome/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	   driver.get("http://www.praxis.com.mx/Sistemas");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  
	 //STEP 2 INGRESANDO USU Y PASS
	 WebElement usuario = driver.findElement(By.id("txtUsuario"));
	 usuario.sendKeys("TORO");
	 WebElement password = driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	 password.sendKeys("oscar123");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id='cmdSesion']")).click();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	//STEP 3 INGRESA A SIHO
	 driver.findElement(By.linkText("SIHO WEB")).click();
	 driver.findElement(By.xpath("//*[@id=\"menu\"]/li[2]/a")).click();
	 driver.findElement(By.cssSelector("#menu > li:nth-child(2)")).click();


	 
	 //STEP 4 USUARIO Y PASSWORD
	 
  
  }
  
  
  
  @AfterTest
  public void afterTest() {
  }

}
