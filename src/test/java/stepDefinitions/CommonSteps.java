package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.drawTheCurtain;

public class CommonSteps {

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        drawTheCurtain();
    }
}
