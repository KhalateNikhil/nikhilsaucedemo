package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.HomePage;
import io.cucumber.java.en.When;

public class HomePageSteps extends BaseClass {
	private static HomePage homepage;

	@When("user click on Sauce Labs Backpack add to cart")
	public void user_click_on_sauce_labs_backpack_add_to_cart() throws InterruptedException {
		homepage = new HomePage();
		homepage.addBagPackToCart();

	}

	@When("user click on Sauce Labs Bike Light add to cart")
	public void user_click_on_sauce_labs_bike_light_add_to_cart() throws InterruptedException {
		homepage.addBikeLightToCart();

	}

	@When("user click on shopping cart button")
	public void user_click_on_shopping_cart_button() throws InterruptedException {
		homepage.clickOnShoopingCart();

	}

	@When("user click on checkout button")
	public void user_click_on_checkout_button() throws InterruptedException {
		homepage.userClickOnCheckout();

	}

}
