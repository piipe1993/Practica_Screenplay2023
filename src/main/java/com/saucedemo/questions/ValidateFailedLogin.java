package com.saucedemo.questions;

import com.saucedemo.ui.LoginPage;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ValidateFailedLogin {


    public static Question<String> messageFailedLogin (){
        return actor -> TextContent.of(LoginPage.MESSAGE_FAILED_LOGIN).answeredBy(actor).toString();
    }




}
