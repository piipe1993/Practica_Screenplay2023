package stepDefinitions;

import com.saucedemo.questions.ValidateFailedLogin;
import com.saucedemo.questions.ValidateInfoInCart;
import com.saucedemo.questions.ValidateTitle;
import com.saucedemo.tasks.AddCart;
import com.saucedemo.tasks.Login;
import com.saucedemo.ui.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.*;

public class LoginStepDefinitions {

    private LoginPage login;

    @Given("^(.*) Enters of the SawgLab website$")
    public void andresEntersOfTheSawgLabWebsite(String client) {
        theActorCalled(client).wasAbleTo(Open.browserOn(login));
    }

    @When("^he sends the following credentials (.*) and (.*)$")
    public void heSendsTheFollowingCredentials(String username, String password) {
        theActorInTheSpotlight().attemptsTo(
                Login.withCredentials(username, password)
        );


    }

    @Then("^he should see the (.*) products at Home page$")
    public void heShouldSeeTheProductsProductsAtHomePage(String title) {
        theActorInTheSpotlight().should(
                seeThat("The expected title on the home page is", ValidateTitle.titleHomePage(), equalTo(title))
        );
    }

    @Then("^he should see the alert message (.*) at Login page$")
    public void heShouldSeeTheAlertMessageProductsAtLoginPage(String alert) {

        theActorInTheSpotlight().should(
                seeThat("The expected message when login fails is:", ValidateFailedLogin.messageFailedLogin(), equalTo(alert))
                //seeThat("Message contains the following text", ValidateFailedLogin.messageFailedLogin(), containsString(alert))
        );
    }
}
