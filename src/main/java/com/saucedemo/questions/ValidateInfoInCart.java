package com.saucedemo.questions;

import com.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateInfoInCart {

    public static Question<String> productName() {
        return actor -> TextContent.of(CartPage.PRODUCT_NAME).answeredBy(actor).toString();

    }
}
