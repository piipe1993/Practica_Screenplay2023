package com.saucedemo.tasks;

import com.saucedemo.ui.CartPage;
import com.saucedemo.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;

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

                Click.on(HomePage.PRODUCTS_LIST.of(producto)),
                Click.on(HomePage.CART_LOGO)

        );
    }
}
