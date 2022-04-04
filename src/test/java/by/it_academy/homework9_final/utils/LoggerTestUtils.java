package by.it_academy.homework9_final.utils;

import by.it_academy.homework9_final.tests.API.OnlinerSushiVeslaTest;
import by.it_academy.homework9_final.tests.UI.OnlinerAccessoriesTest;
import by.it_academy.homework9_final.tests.UI.OnlinerCatalogTest;
import by.it_academy.homework9_final.tests.UI.OnlinerComputerAndNetsTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LoggerTestUtils {
    public static final Logger LOG_SCREENSHOT_UTILS = LoggerFactory.getLogger(ScreenshotUtils.class);
    public static final Logger LOG_ONLINER_SUSHI_VESLA_TEST =
            LoggerFactory.getLogger(OnlinerSushiVeslaTest.class);
    public static final Logger LOG_ONLINER_ACCESSORIES_TEST = LoggerFactory.getLogger(OnlinerAccessoriesTest.class);
    public static final Logger LOG_ONLINER_CATALOG_TEST = LoggerFactory.getLogger(OnlinerCatalogTest.class);
    public static final Logger LOG_ONLINER_COMPUTER_AND_NETS_TEST =
            LoggerFactory.getLogger(OnlinerComputerAndNetsTest.class);
}