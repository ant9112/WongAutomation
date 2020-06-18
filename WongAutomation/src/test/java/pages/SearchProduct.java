package pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class SearchProduct extends PageObject {

	@FindBy(xpath="//*[@class = 'product-shelf']")
	public WebElement productSearched;
	
	@FindBy(xpath="//*[text()='Agregar al carrito' and @class='product-add-to-cart__text desktop']/..")
	public WebElement buttonAddToCar;
	
	@FindBy(xpath=("//*[@id='minicart-navigation' and @class ='minicart minicart--navigation box-shadow-2 food-site to-list-button minicart--has-items minicart--single-category minicart--open anim--panDown']//*[@class = 'btn primary minicart__action minicart__action--buy']"))
	public WebElement buttonViewCar;
	
	@FindBy(xpath=("//*[@id='minicart-navigation' and @class ='minicart minicart--navigation box-shadow-2 food-site to-list-button minicart--has-items minicart--single-category minicart--open anim--panDown']//*[@class = 'btn primary minicart__action minicart__action--buy']"))
	public WebElement buttonViewCar2;
	
	
	@FindBy(xpath=("//*[@type='button' and @class='modal-address__close font-icn cross']"))
	public WebElement closeAlert;
	
	@FindBy(xpath=("//*[@class='btn red minicart__action--toggle-open food-site']"))
	public WebElement shoppingCarButton;

	@FindBy(xpath=("//*[@id='delivery-email']"))
	public WebElement deliveryEmail;
	
	@FindBy(xpath=("//*[@class= 'minicart__totalizer minicart__totalizer--price']"))
	public WebElement subtotalPrice;
	
	public WebElement getProductSearched(String product) {
		return productSearched.findElement(By.xpath("//*[@class ='product-item__name' and @title = '"+product+"']"));
	}
	
}


