package org.cts.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Twodimensionallist {
	public static WebDriver driver;
	
	@Given("user in homepage")
	public void user_in_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		WebElement addcustomer = driver.findElement(By.xpath("//a[text()=\"Add Customer\"]"));
		addcustomer.click();

		
	}

	@When("user filling the telecom details")
	public void user_filling_the_telecom_details(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> twodim = dataTable.asLists(String.class);
	    WebElement backgroundcheck = driver.findElement(By.xpath("//label[text()='Done']"));
	    backgroundcheck.click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(twodim.get(1).get(0));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(twodim.get(1).get(1));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(twodim.get(1).get(2));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twodim.get(1).get(3));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twodim.get(1).get(4));
	    driver.findElement(By.xpath("//input[@value='Submit']")).click();
	
	}

	@Then("user navigate to next page")
	public void user_navigate_to_next_page() {
		System.out.println("successfully opened");
		
	}



}
