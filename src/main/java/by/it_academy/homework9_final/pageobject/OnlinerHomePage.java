package by.it_academy.homework9_final.pageobject;

import io.qameta.allure.Step;

public class OnlinerHomePage extends AbstractPage {
    @Step("Open Onliner Home Page")
    public static void navigate() {
        new OnlinerHomePage().getPage();
    }
}