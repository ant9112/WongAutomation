package pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class HomeWongPage extends PageObject {
	
	@FindBy(id="search-autocomplete-input")
	public WebElement searchBar;
	
	@FindBy(id=("onesignal-popover-cancel-button"))
	public WebElement closeAlertBrowser;
	
}
