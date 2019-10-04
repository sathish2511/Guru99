package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Onedimensionallist {
	public static WebDriver driver;
	@Given("user is in homepage")
	public void user_is_in_homepage() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/telecom/index.html");
	WebElement addcustomer = driver.findElement(By.xpath("//a[text()=\"Add Customer\"]"));
	addcustomer.click();
	}

	@When("user has to enter the username and password")
	public void user_has_to_enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   List<String> custone = dataTable.asList(String.class);
	   WebElement backgroundcheck = driver.findElement(By.xpath("//label[text()='Done']"));
	    backgroundcheck.click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(custone.get(0));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(custone.get(1));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(custone.get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(custone.get(3));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(custone.get(4));
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("user should to navigate to nextpage")
	public void user_should_to_navigate_to_nextpage() {
	    System.out.println("customer navigate to next page");
	}



}
