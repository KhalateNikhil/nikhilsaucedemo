package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.CheckoutCompletePage;
import io.cucumber.java.en.Then;

public class CheckoutCompletePageSteps extends BaseClass{
	private static CheckoutCompletePage chkcomplete;

@Then("user validate thank you for your order maessage")
public void user_validate_thank_you_for_your_order_maessage() 
{
	 chkcomplete=new CheckoutCompletePage();
	 String msg=chkcomplete.cpaturesuccessMsg();
	boolean a= msg.contains("Thank you for your order!");
	Assert.assertTrue(a);
   
}

}
