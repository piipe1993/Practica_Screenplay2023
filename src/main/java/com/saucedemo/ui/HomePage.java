package com.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target TITLE_PRODUCTS = Target.the("Tittle products at Home Page").located(By.className("title"));
    public static final Target ESPECIFIC_PRODUCT = Target.the("Specific Product").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target PRODUCT_LIST = Target.the("Select {0} product of List of All products").locatedBy("//DIV[@class='inventory_item_name'][text()='{0}']");
    public static final Target CART_LOGO = Target.the("Shopping Cart Logo").located(By.id("shopping_cart_container"));
    public static final Target ADDTOCART_BUTTON = Target.the("Add to cart Button").located(By.id("add-to-cart-sauce-labs-bike-light"));
}
