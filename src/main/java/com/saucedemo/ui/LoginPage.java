package com.saucedemo.ui;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    public static final Target INPUT_USERNAME = Target.the("Input to put the Username").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Input to put the Password").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("Login Button").located(By.id("login-button"));
    public static final By MESSAGE_FAILED_LOGIN = By.xpath("//H3[@data-test='error']/self::H3");


}
