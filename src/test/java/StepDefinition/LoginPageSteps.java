package StepDefinition;

import org.junit.Assert;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends BaseClass{
 
	private static LoginPage loginpage;
	 
@Given("user is on login page")
public void user_is_on_login_page() {
	BaseClass.initialization();
	String url1=prop.getProperty("url");
	driver.get(url1);
	
   
}

@When("user enter username password and click on login button")
public void user_enter_username_password_and_click_on_login_button() {
	 loginpage=  new LoginPage();
	 loginpage.loginFunctionality("standard_user", "secret_sauce");
	
	
   
}

@Then("user is on Home page and user validate home page title")
public void user_is_on_home_page_and_user_validate_home_page_title() {
	String actTitle=loginpage.getHomePageTitle();
	Assert.assertEquals(actTitle,"Swag Labs");
    
}

}
