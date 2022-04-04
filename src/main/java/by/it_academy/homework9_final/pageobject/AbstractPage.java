package by.it_academy.homework9_final.pageobject;

import by.it_academy.homework9_final.framework.WebDriverDiscovery;
import by.it_academy.homework9_final.utils.PropertyUtils;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;

public abstract class AbstractPage {

    protected static final int DRIVER_WAIT_TIME = 45;
    protected static final int MINIMAL_SIZE_OF_COLLECTION = 0;

    public AbstractPage() {
        Configuration.browser = WebDriverDiscovery.class.getName();
        Configuration.pageLoadTimeout = 200000;
        Configuration.startMaximized = true;
    }

    public void getPage() {
        open(PropertyUtils.getOnlinerHomePageURL());
    }

    @Step("Get List<String> Inside Category")
    public List<String> findElementsInCategory(String str) {
        return $$x(str).shouldBe(sizeGreaterThan(MINIMAL_SIZE_OF_COLLECTION), ofSeconds(DRIVER_WAIT_TIME)).texts();
    }

    public List<String> getListOfLinks(String onlinerLinks) {
        String[] onlinerCatalogLinksAsArray = onlinerLinks.split("\\.");
        return new ArrayList<>(Arrays.asList(onlinerCatalogLinksAsArray)
                .subList(0, onlinerCatalogLinksAsArray.length));
    }
}