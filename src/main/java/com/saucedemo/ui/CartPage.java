package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CHECKOUT_BUTTON = Target.the("Checkout Button").located(By.id("checkout"));
    public static final Target PRODUCT_NAME = Target.the("Tittle products at Cart").located(By.xpath("//DIV[@class='inventory_item_name'][text()='Sauce Labs Bike Light']"));
}
