package by.it_academy.homework9_final.utils;

import by.it_academy.homework9_final.tests.API.OnlinerSushiVeslaTest;
import by.it_academy.homework9_final.tests.UI.OnlinerAccessoriesTest;
import by.it_academy.homework9_final.tests.UI.OnlinerCatalogTest;
import by.it_academy.homework9_final.tests.UI.OnlinerComputerAndNetsTest;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import org.openqa.selenium.logging.LogType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public final class LoggerTestUtils {
    public static final Logger LOG_SCREENSHOT_UTILS = LoggerFactory.getLogger(ScreenshotUtils.class);
    public static final Logger LOG_ONLINER_SUSHI_VESLA_TEST =
            LoggerFactory.getLogger(OnlinerSushiVeslaTest.class);
    public static final Logger LOG_ONLINER_ACCESSORIES_TEST = LoggerFactory.getLogger(OnlinerAccessoriesTest.class);
    public static final Logger LOG_ONLINER_CATALOG_TEST = LoggerFactory.getLogger(OnlinerCatalogTest.class);
    public static final Logger LOG_ONLINER_COMPUTER_AND_NETS_TEST =
            LoggerFactory.getLogger(OnlinerComputerAndNetsTest.class);

    private static List<String> logList;

    private static List<String> getConsoleLog() {
        return Selenide.getWebDriverLogs(LogType.BROWSER);
    }

    public static void checkLogs() {
        logList = getConsoleLog();
        if (logList.size() > 0)
            addConsoleLogToReport();
    }

    @Attachment(value = "Browser console log", type = "text/plain")
    private static String addConsoleLogToReport() {
        StringBuilder sb = new StringBuilder();
        for (Object line : logList) {
            sb.append(line);
            sb.append("\t");
        }
        return sb.toString();
    }
}