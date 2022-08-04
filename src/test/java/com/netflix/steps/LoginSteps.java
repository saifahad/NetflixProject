package com.netflix.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.netflix.common.NetflixBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  extends NetflixBase{
	@Given("I am on netflix home page")
	public void i_am_on_netflix_home_page() {
	    launchBrowser();
	}

	@When("I click on sign in")
	public void i_click_on_sign_in() {
	WebElement signin = Driver.findElement(By.xpath("//a[@class=\"authLinks redButton\"]")); 
	signin.click();
	}

	@Then("I put my {string} in the email address")
	public void i_put_my_in_the_email_address(String string) {
	WebElement username = Driver.findElement(By.id("id_userLoginId")); 
	username.sendKeys(string); 
	}

	@Then("I put my {string}")
	public void i_put_my(String string) {
	WebElement password = Driver.findElement(By.id("id_password")); 
	password.sendKeys(string);
	}

	@Then("I click sing in")
	public void i_click_sing_in() {
	WebElement signin1 = Driver.findElement(By.xpath("//button[@class=\"btn login-button btn-submit btn-small\"]")); 
	signin1.click(); 
	}

	@Then("I access to my account")
	public void i_access_to_my_account() {
	WebElement quyoum = Driver.findElement(By.linkText("Qayoum")); 
 
	quyoum.click();
	 
	}
}


