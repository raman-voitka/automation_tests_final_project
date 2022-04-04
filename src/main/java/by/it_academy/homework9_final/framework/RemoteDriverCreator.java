package by.it_academy.homework9_final.framework;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static by.it_academy.homework9_final.utils.LoggerUtils.LOG_REMOTE_DRIVER_CREATOR;

public class RemoteDriverCreator implements WebDriverCreator<RemoteWebDriver> {

    private static final String BROWSER = "firefox";

    @Override
    public RemoteWebDriver create() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BROWSER);
        capabilities.setPlatform(Platform.WIN10);
        return new RemoteWebDriver(getGridUrl(), capabilities);
    }

    private URL getGridUrl () {
        try {
            return new URL(System.getProperty("webdriver.remote"));
        } catch (MalformedURLException e){
            LOG_REMOTE_DRIVER_CREATOR.error("An Error Occurred While Trying To Create URL For RemoteWebDriver");
            throw new IllegalStateException(e.getMessage(), e);
        }
    }
}