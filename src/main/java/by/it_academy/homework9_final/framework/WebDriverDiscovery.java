package by.it_academy.homework9_final.framework;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;

import static by.it_academy.homework9_final.utils.LoggerUtils.LOG_SELENIDE_WEBDRIVER_DISCOVERY;

public class WebDriverDiscovery implements WebDriverProvider {
    @Nonnull
    @Override
    public RemoteWebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        String driverType = System.getProperty("driverType");
        if (driverType != null) {
            return DriverCreatorFactory.getDriverCreator(driverType).create();
        } else {
            LOG_SELENIDE_WEBDRIVER_DISCOVERY.error("Driver Type Is Null. Check Maven Command Line");
            throw new NullPointerException("Error. Driver Type Is Null");
        }
    }
}