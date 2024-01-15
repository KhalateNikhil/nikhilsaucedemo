package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class CheckoutPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname	;

	@FindBy(name="lastName")
	private WebElement lname;

	@FindBy(name="postalCode")
	private WebElement pcode ;

	@FindBy(name="continue")
	private WebElement contbtn;
	
	@FindBy(name="finish")
	private WebElement finish;

	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void addUserInfo(String firstname,String lastname,String pincode) 
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wait.sendKeys(fname, firstname);
		Wait.sendKeys(lname, lastname);
		Wait.sendKeys(pcode, pincode);
		Wait.click(contbtn);
		
		
	}
	
	public void clcickOnFinishButton()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wait.click(finish);
	}
	
	
	
	
	
	
	
	
	
}
