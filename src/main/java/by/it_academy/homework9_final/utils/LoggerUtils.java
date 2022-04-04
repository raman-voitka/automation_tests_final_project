package by.it_academy.homework9_final.utils;

import by.it_academy.homework9_final.framework.RemoteDriverCreator;
import by.it_academy.homework9_final.framework.SelenideWebDriverDiscovery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LoggerUtils {
    public static final Logger LOG_REMOTE_DRIVER_CREATOR = LoggerFactory.getLogger(RemoteDriverCreator.class);
    public static final Logger LOG_PROPERTY_UTILS = LoggerFactory.getLogger(PropertyUtils.class);
    public static final Logger LOG_SELENIDE_WEBDRIVER_DISCOVERY =
            LoggerFactory.getLogger(SelenideWebDriverDiscovery.class);
}