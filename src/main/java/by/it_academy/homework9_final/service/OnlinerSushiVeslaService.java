package by.it_academy.homework9_final.service;

import by.it_academy.homework9_final.model.OnlinerSushiVeslaProduct;
import by.it_academy.homework9_final.utils.GetRequestUtils;
import by.it_academy.homework9_final.utils.ResponseBodyUtils;
import io.qameta.allure.Step;
import io.restassured.response.ResponseBody;

import java.util.List;

public class OnlinerSushiVeslaService {
    @Step("Get List of Products by Given Endpoint")
    public List<OnlinerSushiVeslaProduct> getSushiVeslaProducts(String endpoint) {
        ResponseBody responseBody = GetRequestUtils.makeRequestAndGetResponseBody(endpoint, null, null);
        return ResponseBodyUtils.getObjectsByJsonPath(responseBody, "products",
                OnlinerSushiVeslaProduct.class);
    }
}