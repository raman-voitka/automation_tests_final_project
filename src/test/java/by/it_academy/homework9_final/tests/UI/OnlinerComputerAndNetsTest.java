package by.it_academy.homework9_final.tests.UI;

import by.it_academy.homework9_final.utils.PropertyUtils;
import io.qameta.allure.*;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_COMPUTER_AND_NETS_TEST;
import static by.it_academy.homework9_final.utils.LoggerTestUtils.checkLogs;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@Epic("Epic 1. Onliner.by")
public class OnlinerComputerAndNetsTest extends UIBaseTest {

    @Story("User story 2. UI")
    @Test
    @Description("Onliner. Test That Category 'Computers And Nets' Contains At Least Four Preset Elements")
    public void test_Onliner_Category_ComputersAndNets_Has_Four_Preset_Elements() {

        SoftAssert softAssert = new SoftAssert();

        LOG_ONLINER_COMPUTER_AND_NETS_TEST.info("Test Started");
        List<String> categoriesOfComputersAndNets = navigateToCategoryComputersAndNets()
                .findElementsInCategory(onlinerCatalogPage.getSubcategoriesInComputersAndNetsCategory());
        softAssert.assertEquals(categoriesOfComputersAndNets.size(), 10);
        assertThat(categoriesOfComputersAndNets)
                .as("At Least One Element Does Not Match")
                .containsAll(onlinerCatalogPage
                        .getListOfLinks(PropertyUtils.getOnlinerComputersAndNetsLinks()));
        LOG_ONLINER_COMPUTER_AND_NETS_TEST.info("Test Passed");
        checkLogs();
        softAssert.assertAll();
    }
}