package by.it_academy.homework9_final.tests.API;

import by.it_academy.homework9_final.model.OnlinerSushiVeslaProduct;
import by.it_academy.homework9_final.service.OnlinerSushiVeslaService;
import by.it_academy.homework9_final.utils.PropertyUtils;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

import java.util.List;

import static by.it_academy.homework9_final.utils.LoggerTestUtils.LOG_ONLINER_SUSHI_VESLA_TEST;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class OnlinerSushiVeslaTest {

    private OnlinerSushiVeslaService onlinerSushiVeslaService = new OnlinerSushiVeslaService();
    private List<OnlinerSushiVeslaProduct> onlinerSushiVeslaProducts;

    @Test
    @Description("Onliner. Test That Each Of SushiVesla Products Has Name")
    public void test_Each_Of_SushiVesla_Products_Has_Name() {
        LOG_ONLINER_SUSHI_VESLA_TEST.info("Test Started");
        onlinerSushiVeslaProducts = onlinerSushiVeslaService
                .getSushiVeslaProducts(PropertyUtils.getEndpointSushiveslaProducts());
        assertThat(onlinerSushiVeslaProducts)
                .as("At Least One Of SushiVesla Products Does Not Have Name")
                .allMatch(product -> !product.getName().isEmpty());
        LOG_ONLINER_SUSHI_VESLA_TEST.info("Test Passed");
    }

    @Test
    @Description("Onliner. Test That Each Of SushiVesla Products Has Preset Filter")
    public void test_Each_Of_SushiVesla_Products_Has_Preset_Filter() {
        LOG_ONLINER_SUSHI_VESLA_TEST.info("Test Started");
        onlinerSushiVeslaProducts = onlinerSushiVeslaService
                .getSushiVeslaProducts(PropertyUtils.getEndpointSushiVeslaProductsByFilter());
        assertThat(onlinerSushiVeslaProducts)
                .as("At Least One Of SushiVesla Products Doesn't Have Filter \"Роллы\"")
                .allMatch(product -> product.getName_prefix().equals("Роллы"));
        LOG_ONLINER_SUSHI_VESLA_TEST.info("Test Passed");
    }
}