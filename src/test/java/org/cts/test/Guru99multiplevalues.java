package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Guru99multiplevalues {
	
	public static WebDriver driver;
	
	@Given("I user in Guru{int} Telecom page")
	public void i_user_in_Guru_Telecom_page(Integer int1) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SATHISH\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	}

	@Given("The user clicks the Add customer and click button")
	public void the_user_clicks_the_Add_customer_and_click_button() {
	   WebElement add = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	   add.click();
	}

	@When("The user fill the add customer name {string},{string},{string},{string},{string}")
	public void the_user_fill_the_add_customer_name(String firstname, String last, String mail, String add, String phno) {
	    WebElement backgroundcheck = driver.findElement(By.xpath("//label[text()='Done']"));
	    backgroundcheck.click();
	    WebElement first = driver.findElement(By.xpath("//input[@id='fname']"));
	    first.sendKeys(firstname);
	    WebElement lastname = driver.findElement(By.xpath("//input[@id='lname']"));
	    lastname.sendKeys(last);
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys(mail);
	    WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
	    address.sendKeys(add);
	    WebElement phn = driver.findElement(By.xpath("//input[@id='telephoneno']"));
	    phn.sendKeys(phno);
	    WebElement cont = driver.findElement(By.xpath("//input[@value='Submit']"));
	    cont.click();
	}

	@Then("The user navigate next page")
	public void the_user_navigate_next_page() {
	    String url = driver.getCurrentUrl();
	    if(url.contains("telecom")) {
	    	System.out.println("well done");
	    }
	    else {
	    	System.out.println("not success");
	    }
	}



}
