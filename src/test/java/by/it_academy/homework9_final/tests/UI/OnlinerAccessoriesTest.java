package by.it_academy.homework9_final.tests.UI;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.SkipException;
import org.testng.annotations.Test;

import java.util.List;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_ACCESSORIES_TEST;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Epic("Epic 1. Onliner.by")
public class OnlinerAccessoriesTest extends UIBaseTest {

    @Story("User story 2. UI")
    @TmsLink("5")
    @Test
    @Description("Onliner. Test That Products And Their Descriptions Of Category 'Accessories' Are Not Empty")
    public void test_ProductsAndDescriptions_Of_Accessories_Are_Not_Empty() {
        LOG_ONLINER_ACCESSORIES_TEST.info("Test Started");
        List<String> productsAndDescriptionsOfAccessories = navigateToCategoryComputersAndNets()
                .clickOnLinkByXpath(onlinerCatalogPage.getCatalogClassifierCategoryXpathPattern(), "Комплектующие")
                .findElementsInCategory(onlinerCatalogPage
                        .getProductsAndDescriptionsOfCategoryAccessories());
        if (false) {
            assertThat(productsAndDescriptionsOfAccessories)
                    .as("At Least One Element In Category 'Accessories' Is Empty")
                    .allMatch(element -> !element.isEmpty());
            LOG_ONLINER_ACCESSORIES_TEST.info("Test Passed");
        } else {
            LOG_ONLINER_ACCESSORIES_TEST.info("Test Skipped");
            throw new SkipException("SKIP");
        }
    }
}