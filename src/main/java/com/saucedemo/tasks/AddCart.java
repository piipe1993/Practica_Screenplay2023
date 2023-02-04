package com.saucedemo.tasks;

import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddCart implements Task {

    public static Performable GoCart(){
        return instrumented(AddCart.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    //WaitUntil.the(HomePage.PRODUCTS_LIST,isVisible()).forNoMoreThan(3).seconds(),
                    Click.on(HomePage.ESPECIFIC_PRODUCT),
                    Click.on(HomePage.CART_LOGO)

        );

    }
}
