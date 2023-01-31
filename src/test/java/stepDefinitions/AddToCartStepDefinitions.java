package stepDefinitions;

import com.saucedemo.questions.ValidateFailedLogin;
import com.saucedemo.questions.ValidateInfoInCart;
import com.saucedemo.tasks.AddCart;
import com.saucedemo.tasks.AddProductToCart;
import com.saucedemo.ui.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

public class AddToCartStepDefinitions {

    @And("^he selects a product (.*) from the list to the shopping cart$")
    public void heSelectsAProductFromTheListToTheShoppingCart(String producto) {
        theActorCalled("Client").attemptsTo(
                AddProductToCart.fromList(producto)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(producto);
    }

    @Then("^He should see the (.*) and price inside the shopping cart$")
    public void heShouldSeeTheProductAndPriceInsideTheShoppingCart(String product) {
theActorInTheSpotlight().should(
        seeThat("The expected name of product contains", ValidateInfoInCart.productName(),containsString(product))
);
        System.out.println("Validacion completa en carrito");
    }
}
