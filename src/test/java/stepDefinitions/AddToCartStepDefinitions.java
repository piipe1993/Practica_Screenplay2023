package stepDefinitions;


import com.saucedemo.questions.ValidateInfoInCart;
import com.saucedemo.tasks.AddProductToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsStringIgnoringCase;


public class AddToCartStepDefinitions {


    @And("^he selects a product (.*) from the list to the shopping cart$")
    public void heSelectsAProductFromTheListToTheShoppingCart(String producto) {


        theActorInTheSpotlight().attemptsTo(
                // AddCart.GoCart()
                AddProductToCart.fromList(producto)
        );
    }

    @Then("^He should see the (.*) and price inside the shopping cart$")
    public void heShouldSeeTheProductAndPriceInsideTheShoppingCart(String product) {


        theActorInTheSpotlight().should(
                seeThat("The expected name of product contains", ValidateInfoInCart.productName(), containsStringIgnoringCase(product))
        );
        System.out.println("Validacion completa en carrito");
    }
}
