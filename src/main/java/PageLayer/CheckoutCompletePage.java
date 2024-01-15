package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class CheckoutCompletePage extends BaseClass{
	@FindBy(xpath="//h2[text()='Thank you for your order!']")
	private WebElement capmsg;
	
	
	public CheckoutCompletePage() 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String cpaturesuccessMsg()
	{
		return capmsg.getText();
	}

}
