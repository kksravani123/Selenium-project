package com.mvnProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions; //Getting exception in this line




public class Firstproject {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
ChromeOptions co=new ChromeOptions();
co.setBinary("C:\\Users\\ADMIN\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

				 
				WebDriver driver = new ChromeDriver(co);
				driver.get("https://onlinetestinghelp.com/projects/banking/admin/");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
				System.out.println( "The element isdisplayed::"+driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed());
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//button[contains(text(),'Sign ')]")).click();
		driver.close();
				
				
				


				

					}

				



	}


