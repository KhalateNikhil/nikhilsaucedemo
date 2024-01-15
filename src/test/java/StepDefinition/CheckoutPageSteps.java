package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.CheckoutPage;
import io.cucumber.java.en.When;

public class CheckoutPageSteps extends BaseClass{
	
	private static CheckoutPage chk;
@When("user enter firstname lastname and pincode and click on continue button")
public void user_enter_firstname_lastname_and_pincode_and_click_on_continue_button()
{
	 chk=new CheckoutPage();
	 chk.addUserInfo("nikhil", "khalate", "3636");
 
}
@When("user click on finish button")
public void user_click_on_finish_button() 
{
	chk.clcickOnFinishButton();
	
 }

}
