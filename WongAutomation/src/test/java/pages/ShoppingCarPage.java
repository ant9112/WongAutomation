package pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

public class ShoppingCarPage extends PageObject {
	
	@FindBy(xpath=("//*[@class = 'cart-products-items']"))
	public WebElement productAdded;
	
	
	@FindBy(xpath=("//*[@class = 'cart-products-items']"))
	public WebElement amount;
	
	
	
	public WebElement getProductAdded(String product) {
		return productAdded.findElement(By.xpath("//*[@title='"+product+"' and @class='product-item__name']"));
	}
	
	public WebElement getAmount(String product) {
		return amount.findElement(By.xpath("//*[@title='"+product+"']/..//*[@class='product-quantity__input']"));
	}
		
}
