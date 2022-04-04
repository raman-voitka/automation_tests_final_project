package by.it_academy.homework9_final.framework;

public class DriverCreatorFactory {
    public static WebDriverCreator getDriverCreator(String driverType) {
        switch (driverType) {
            case "chrome":
                return new ChromeDriverCreator();
            case "firefox":
                return new FirefoxDriverCreator();
            case "remote":
                return new RemoteDriverCreator();
            default:
                return new FirefoxDriverCreator();
        }
    }
}