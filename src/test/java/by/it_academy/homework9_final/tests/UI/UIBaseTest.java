package by.it_academy.homework9_final.tests.UI;

import by.it_academy.homework9_final.listeners.AllureListener;
import by.it_academy.homework9_final.pageobject.OnlinerCatalogPage;
import by.it_academy.homework9_final.pageobject.OnlinerHeader;
import by.it_academy.homework9_final.pageobject.OnlinerHomePage;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(AllureListener.class)
public class UIBaseTest {
    protected OnlinerHeader onlinerHeader = new OnlinerHeader();
    protected OnlinerCatalogPage onlinerCatalogPage = new OnlinerCatalogPage();

    @BeforeClass
    public void setUp() {
        SelenideLogger
                .addListener("AllureSelenide",
                        new AllureSelenide().screenshots(true).savePageSource(true));
    }

    @BeforeClass
    public void navigateToOnlinerHomePage() {
        OnlinerHomePage.navigate();
    }

    @BeforeMethod
    public void navigateToCatalogOfOnliner() {
        onlinerHeader.clickOnMainNavigationLink("Каталог");
    }

    @Step("Open Category \"Computers And Nets\"")
    protected OnlinerCatalogPage navigateToCategoryComputersAndNets() {
        return onlinerCatalogPage
                .clickOnLinkByXpath(onlinerCatalogPage.getCatalogClassifierLinkXpathPattern(),
                        "Компьютеры и\u00A0сети");
    }
}