package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target TITLE_PRODUCTS = Target.the("Tittle products at Home Page").located(By.className("title"));
    public static final Target PRODUCTS_LIST = Target.the("List With all available products").locatedBy("\"//*[contains(@data-test,'{0}')]\"");

    public static final Target CART_LOGO = Target.the("Shopping Cart Logo").located(By.id("shopping_cart_container"));
}
