package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)                    
@CucumberOptions(
        features="src/test/resources/features/add_products_to_shopping_car.feature"        
        ) 

public class TestRunner {

}