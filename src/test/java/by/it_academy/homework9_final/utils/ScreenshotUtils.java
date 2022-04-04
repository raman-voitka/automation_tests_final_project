package by.it_academy.homework9_final.utils;


import com.codeborne.selenide.Screenshots;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_SCREENSHOT_UTILS;

public final class ScreenshotUtils {

    private ScreenshotUtils() {
    }

    public static void takeScreenshotAndAttachToAllureReport() {
        try {
            File screenshotAs = Screenshots.takeScreenShotAsFile();
            Allure.addAttachment("Screenshot", FileUtils.openInputStream(screenshotAs));
        } catch (IOException e) {
            LOG_SCREENSHOT_UTILS.error("Error creating screenshot");
        }
    }
}