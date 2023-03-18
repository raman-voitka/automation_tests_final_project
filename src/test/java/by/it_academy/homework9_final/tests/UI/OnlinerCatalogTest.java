package by.it_academy.homework9_final.tests.UI;

import by.it_academy.homework9_final.utils.PropertyUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_CATALOG_TEST;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Epic("Epic 1. Onliner.by")
public class OnlinerCatalogTest extends UIBaseTest {

    @Story("User story 2. UI")
    @TmsLink("6")
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