package by.it_academy.homework9_final.framework;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriverCreator implements WebDriverCreator<RemoteWebDriver> {
    @Override
    public FirefoxDriver create() {
        return new FirefoxDriver();
    }
}