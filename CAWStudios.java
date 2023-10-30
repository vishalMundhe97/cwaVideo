package com.Amazon_testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CAWStudios {
  public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//summary[normalize-space()='Table Data']")).click();
	  driver.findElements(By.xpath("//textarea[@id='jsondata']")).clear();
	  
	  
	  
//	  WebElement tableDataButton = driver.findElement(By.id("populate-table"));
//      tableDataButton.click();

      WebElement inputTextBox = driver.findElement(By.xpath("//textarea[@id='jsondata']"));
      String jsonData = "[{\"name\": \"Bob\", \"age\": 20, \"gender\": \"male\"}, " +
              "{\"name\": \"George\", \"age\": 42, \"gender\": \"male\"}, " +
              "{\"name\": \"Sara\", \"age\": 42, \"gender\": \"female\"}, " +
              "{\"name\": \"Conor\", \"age\": 40, \"gender\": \"male\"}, " +
              "{\"name\": \"Jennifer\", \"age\": 42, \"gender\": \"female\"}]";
      inputTextBox.sendKeys(jsonData);
      Thread.sleep(3000);
      WebElement refreshTableButton = driver.findElement(By.xpath("//button[@id='refreshtable']"));
      refreshTableButton.click();

      
      WebElement uiTable = driver.findElement(By.xpath("//table[@id='dynamictable']"));
      String tableData = uiTable.getText();

      
      if (tableData.equals(jsonData)) {
          System.out.println("Test passed: Data matches in UI table");
      } else {
          System.out.println("Test failed: Data in UI table does not match the entered data");
      }
}
}
