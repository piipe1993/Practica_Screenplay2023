package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/addToCart.feature",
        glue= "stepDefinitions",
        tags= "",
        publish = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AddToCartRunner {
}
