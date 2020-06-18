package steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import pages.HomeWongPage;
import pages.SearchProduct;

public class AddProductToShoppingCarSteps {

	HomeWongPage homeWongPage;
	SearchProduct searchProduct;
	JavascriptExecutor executor;


	@Step
	public void openPage() {
		homeWongPage.open();
		homeWongPage.waitFor(ExpectedConditions.elementToBeClickable(homeWongPage.closeAlertBrowser));
		homeWongPage.closeAlertBrowser.click();
	}
	
	@Step
	public void searchProductInPage(String product) {
		homeWongPage.searchBar.sendKeys(product);
		homeWongPage.searchBar.sendKeys(Keys.ENTER);
	}
	
	@Step
	public void addProductToShoppingCar(String product) {
		searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.getProductSearched(product)));
		searchProduct.getProductSearched(product).click();
		
		searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.buttonAddToCar));
		searchProduct.buttonAddToCar.click();

		searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.deliveryEmail));
		searchProduct.deliveryEmail.click();
		
		searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.closeAlert));
		searchProduct.closeAlert.click();
		
		searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.shoppingCarButton));
		searchProduct.shoppingCarButton.click();
		
		executor = (JavascriptExecutor) searchProduct.getDriver();
		executor.executeScript("window.scrollBy(0,200)");
		//searchProduct.waitFor(ExpectedConditions.elementToBeClickable(searchProduct.buttonViewCar));
		try{
			searchProduct.buttonViewCar.click();
		}catch(Exception ex) {
			searchProduct.buttonViewCar2.click();
		}
	}
}
