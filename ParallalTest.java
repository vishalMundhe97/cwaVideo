package com.Amazon_testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallalTest {
  

		WebDriver driver;

		@Test(priority = 1)
		public void testChrome() throws InterruptedException {
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bstackdemo.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "StackDemo");
		}

		@Test(priority = 2)
		public void testFirefox() throws InterruptedException {
		System.out.println("The thread ID for edge is "+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.bstackdemo.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "StackDemo"); 
		driver.findElement(By.xpath("//img[@alt='iPhone 12']")).click();
		}

}
