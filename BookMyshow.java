package com.Amazon_testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyshow {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		 driver.get("https://in.bookmyshow.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//img[@alt='PUNE']")).click();

			driver.findElement(By.xpath("//img[@alt='Rocky Aur Rani Kii Prem Kahaani']")).click();
			driver.findElement(By.xpath("//div[@class='sc-qswwm9-8 cTJUaT']//span[contains(text(),'Book tickets')]")).click();
	
			driver.findElement(By.xpath("//li[@data-id='VCPM']//div[@class='__text'][normalize-space()='03:30 PM']")).click();

			driver.findElement(By.xpath("//li[@id='pop_3']")).click();
			driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
			 
			WebElement clickOnSeat = driver.findElement(By.xpath("//a[@class='_available _selected'][normalize-space()='4']"));
			clickOnSeat.click();
			String actual = clickOnSeat.getText();
			System.out.println("Actual Text = "+ actual);
			
			
	}
	

}
