package com.saucedemo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CommonTasks implements Task {
    private final Target webElement;

    public CommonTasks(Target webElement) {
        this.webElement = webElement;

    }

    public static Performable waitElementVisible(Target webElement) {
        return instrumented(CommonTasks.class, webElement);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(webElement, isVisible()).forNoMoreThan(4).seconds()
        );


    }
}
