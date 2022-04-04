package by.it_academy.homework9_final.pageobject;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class OnlinerCatalogPage extends AbstractPage {

    private static final String CATALOG_CLASSIFIER_LINK_XPATH_PATTERN =
            "//*[contains(@class, 'catalog-navigation-classifier__item')]//*[contains(text(), '%s')]";
    private static final String CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN =
            "//*[@class='catalog-navigation-list__aside-title' and contains(text(), '%s')]";
    private static final String CATALOG_CLASSIFIER_LINKS = "//*[@class = 'catalog-navigation-classifier ']" +
            "//*[@class = 'catalog-navigation-classifier__item ']";
    private static final String SUBCATEGORIES_IN_COMPUTERS_AND_NETS_CATEGORY = "//*[@class='catalog-navigation-" +
            "list__category' and @data-id='2']//*[@class='catalog-navigation-list__aside-title']";
    private static final String SUBCATEGORIES_IN_ACCESSORIES_CATEGORY = "//*[@data-id='2']//div[contains(text()," +
            " 'Комплектующие')]//following-sibling::div//span[contains(@class, 'title')" +
            " or contains(@class, 'description')]";

    public String getCatalogClassifierLinkXpathPattern() {
        return CATALOG_CLASSIFIER_LINK_XPATH_PATTERN;
    }

    public String getCatalogClassifierCategoryXpathPattern() {
        return CATALOG_CLASSIFIER_CATEGORY_XPATH_PATTERN;
    }

    public String getSubcategoriesInComputersAndNetsCategory() {
        return SUBCATEGORIES_IN_COMPUTERS_AND_NETS_CATEGORY;
    }

    public String getCatalogClassifierLinks() {
        return CATALOG_CLASSIFIER_LINKS;
    }

    public String getProductsAndDescriptionsOfCategoryAccessories() {
        return SUBCATEGORIES_IN_ACCESSORIES_CATEGORY;
    }

    @Step("Click On Some Link By Xpath")
    public OnlinerCatalogPage clickOnLinkByXpath(String xPathPattern, String link) {
        $x(format(xPathPattern, link))
                .shouldBe(visible, ofSeconds(DRIVER_WAIT_TIME))
                .click();
        return this;
    }
}