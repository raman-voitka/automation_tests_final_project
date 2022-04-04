package by.it_academy.homework9_final.tests.UI;

import by.it_academy.homework9_final.utils.PropertyUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.util.List;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_COMPUTER_AND_NETS_TEST;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerComputerAndNetsTest extends UIBaseTest {
    @Test
    @Description("Onliner. Test That Category 'Computers And Nets' Contains At Least Four Preset Elements")
    public void test_Onliner_Category_ComputersAndNets_Has_Four_Preset_Elements() {
        LOG_ONLINER_COMPUTER_AND_NETS_TEST.info("Test Started");
        List<String> categoriesOfComputersAndNets = navigateToCategoryComputersAndNets()
                .findElementsInCategory(onlinerCatalogPage.getSubcategoriesInComputersAndNetsCategory());
        assertThat(categoriesOfComputersAndNets)
                .as("At Least One Element Does Not Match")
                .containsAll(onlinerCatalogPage
                        .getListOfLinks(PropertyUtils.getOnlinerComputersAndNetsLinks()));
        LOG_ONLINER_COMPUTER_AND_NETS_TEST.info("Test Passed");
    }
}