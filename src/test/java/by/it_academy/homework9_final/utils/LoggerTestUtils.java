package by.it_academy.homework9_final.utils;

import by.it_academy.homework9_final.tests.API.OnlinerSushiVeslaTest;
import by.it_academy.homework9_final.tests.UI.OnlinerAccessoriesTest;
import by.it_academy.homework9_final.tests.UI.OnlinerCatalogTest;
import by.it_academy.homework9_final.tests.UI.OnlinerComputerAndNetsTest;
import io.qameta.allure.Allure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class LoggerTestUtils {

    private static final String INPUT_DATA_PATH = "C:/Users/r.voitka/OnlinerTestsLogs.log";

    public static final Logger LOG_SCREENSHOT_UTILS = LoggerFactory.getLogger(ScreenshotUtils.class);
    public static final Logger LOG_ONLINER_SUSHI_VESLA_TEST =
            LoggerFactory.getLogger(OnlinerSushiVeslaTest.class);
    public static final Logger LOG_ONLINER_ACCESSORIES_TEST = LoggerFactory.getLogger(OnlinerAccessoriesTest.class);
    public static final Logger LOG_ONLINER_CATALOG_TEST = LoggerFactory.getLogger(OnlinerCatalogTest.class);
    public static final Logger LOG_ONLINER_COMPUTER_AND_NETS_TEST =
            LoggerFactory.getLogger(OnlinerComputerAndNetsTest.class);

    public static void getConsoleLogs() {
        try {
            Allure.addAttachment("Console logs: ", new FileInputStream(INPUT_DATA_PATH));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}