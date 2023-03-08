package by.it_academy.homework9_final.tests.UI;

import by.it_academy.homework9_final.utils.PropertyUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_CATALOG_TEST;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerCatalogTest extends UIBaseTest {
    @Test
    @Description("Onliner. Test That Onliner's Catalog Has Preset Categories")
    public void test_Catalog_Of_Onliner_Has_Preset_Categories() {
        LOG_ONLINER_CATALOG_TEST.info("Test Started");
        assertThat(onlinerCatalogPage.findElementsInCategory(onlinerCatalogPage
                .getCatalogClassifierLinks()))
                .as("There Is At Least One Mismatch")
                .containsExactlyElementsOf(onlinerCatalogPage
                        .getListOfLinks(PropertyUtils.getOnlinerCatalogLinks()));
        LOG_ONLINER_CATALOG_TEST.info("Test Passed");
    }
}