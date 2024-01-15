package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement bagpack;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement bikelight;
	
	@FindBy(id="shopping_cart_container")
	private WebElement shoppingcart;

	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement ckout;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void addBagPackToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(bagpack);
	
	}
	public void addBikeLightToCart() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(bikelight);
	}
	public void clickOnShoopingCart() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(shoppingcart);
	}
	public void userClickOnCheckout() throws InterruptedException
	{
		Thread.sleep(3000);
		Wait.click(ckout);
	}
	
}
