package definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BaseClass.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class face2 {
	WebDriver driver;
	Driver d=new Driver();

@Given("User navigate to website")
public void user_navigate_to_website() {
   
}

@When("User enter the ID  {string} in step")
public void user_enter_the_id_in_step(String string) {
  
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(string);
}

@When("User enter the password {string} in step")
public void user_enter_the_password_in_step(String string) {
   
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(string);
}

@Then("User click on login")
public void user_click_on_login() throws Throwable {
   
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	driver.quit();
}



}
