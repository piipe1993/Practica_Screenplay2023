package stepDefinitions;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CommonSteps {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
