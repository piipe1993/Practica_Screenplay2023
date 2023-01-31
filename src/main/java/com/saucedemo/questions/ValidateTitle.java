package com.saucedemo.questions;

import com.saucedemo.ui.HomePage;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateTitle {

    public static Question<String> titleHomePage(){
        return actor -> TextContent.of(HomePage.TITLE_PRODUCTS).answeredBy(actor).toString();
    }
}
