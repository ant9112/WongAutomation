package runners.stepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.ShoppingCarPage;
import steps.AddProductToShoppingCarSteps;

public class AddProductStepsDefinitions {
	WebDriver myDriver;
	ShoppingCarPage shoppingCarPage;
	
	@Steps
	AddProductToShoppingCarSteps addProductToShoppingCarSteps;
	
	@Given("^the user search the (.*) in the home page$")
    public void theUserSearchTheProductInTheHomePage(String product) {
		addProductToShoppingCarSteps.openPage();
		addProductToShoppingCarSteps.searchProductInPage(product);
	}
	
	@When("^the user add the product (.*) in shopping car$")
    public void theUserAddTheProductInShoppingCar(String product) {
		addProductToShoppingCarSteps.addProductToShoppingCar(product);  
	}
	
	@Then("^the user should verify the (.*) and (.*)$")
    public void theUserShouldVerifyTheProductAndTheAmount(String productExpected, String amountExpected) {
		String productObtained = shoppingCarPage.getProductAdded(productExpected).getText();
		String amountObtained = shoppingCarPage.getAmount(productExpected).getAttribute("value");

		assertEquals(productExpected, productObtained);
		assertEquals(amountExpected, amountObtained);
	}
}
