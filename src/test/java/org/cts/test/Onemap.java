package org.cts.test;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Onemap {
	 public static WebDriver driver;
	
	@Given("user enter the homepage")
	public void user_enter_the_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		WebElement addcustomer = driver.findElement(By.xpath("//a[text()=\"Add Customer\"]"));
		addcustomer.click();
	}

	@When("user filled the telecom details")
	public void user_filled_the_telecom_details(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> oneMap = dataTable.asMap(String.class, String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(oneMap.get("fristname"));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(oneMap.get("lastnme"));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(oneMap.get("mailaddress"));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(oneMap.get("address"));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(oneMap.get("phone"));
	    driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	}

	@Then("user navigate to nextpage")
	public void user_navigate_to_nextpage() {
    System.out.println("success");
	}



}
