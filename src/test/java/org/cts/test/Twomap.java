package org.cts.test;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Twomap {
	public static WebDriver driver;
	
	@Given("user want to enter login page")
	public void user_want_to_enter_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		WebElement addcustomer = driver.findElement(By.xpath("//a[text()=\"Add Customer\"]"));
		addcustomer.click();
	}

	@When("user want to enter telecom details page")
	public void user_want_to_enter_telecom_details_page(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> twomap = dataTable.asMaps(String.class,String.class);	
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(twomap.get(1).get("firstname"));
	    driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(twomap.get(1).get("lastname"));
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys(twomap.get(1).get("mail"));
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(twomap.get(1).get("address"));
	    driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(twomap.get(1).get("phno"));
	    driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
	
	
	
	}

	@Then("user switch to next page")
	public void user_switch_to_next_page() {
	 System.out.println("success");
	}


}
