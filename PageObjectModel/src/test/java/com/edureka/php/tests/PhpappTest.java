package com.edureka.php.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpappTest {

	public String baseUrl = "http://localhost:8000/";
	String driverPath = "/Users/pc11595/DevOps/personal/phpproject/PageObjectModel/executables/chromedrivers/mac/chromedriver";
	public WebDriver driver;

	@Test
	public void verifyAboutusLink() {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://localhost:8000/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"About Us\"]")).click();
		String text="This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."; 
		if (driver.findElement(By.xpath("/html/body")).getText().contains(text)){
		System.out.println("Verification Successfull");
		}
		else{
		System.out.println("Verification Failed");

		}
		driver.close();
	}
}
