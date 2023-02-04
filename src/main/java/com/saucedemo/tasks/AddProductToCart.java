package com.saucedemo.tasks;

import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductToCart implements Task {

    private final String producto;

    public AddProductToCart(String producto) {
        this.producto = producto;
    }

    public static Performable fromList(String producto) {
        return instrumented(AddProductToCart.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(HomePage.PRODUCT_LIST.of(producto), isPresent()).forNoMoreThan(2).seconds(),
                Click.on(HomePage.PRODUCT_LIST.of(producto)),
               Click.on(HomePage.ADDTOCART_BUTTON),
               //MoveMouse.to(HomePage.CART_LOGO),
                Click.on(HomePage.CART_LOGO)

        );
    }
}
