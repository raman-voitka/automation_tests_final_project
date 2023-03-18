package by.it_academy.homework9_final.tests.demo;

import by.it_academy.homework9_final.tests.UI.UIBaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

@Epic("Epic 1. Onliner.by")
public class StatusOfTest extends UIBaseTest {

    @Story("User story 3. Demo")
    @TmsLink("3")
    @Test
    @Description("Demonstration of Broken Test Status")
    public void demonstrate_Broken_Status() {
        int a = 10 / 0;
    }

    @Story("User story 3. Demo")
    @TmsLink("4")
    @Test(enabled = false)
    @Description("Demonstration of Unknown Test Status")
    public void demonstrate_Unknown_Status() {
    }
}