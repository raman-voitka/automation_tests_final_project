package by.it_academy.homework9_final.utils;

import io.qameta.allure.Step;
import io.restassured.response.ResponseBody;

import java.util.List;

public final class ResponseBodyUtils {

    private ResponseBodyUtils() {
    }

    @Step("Get List of Objects by JSON Path")
    public static <T> List<T> getObjectsByJsonPath(ResponseBody responseBody, String jsonPath,
                                                   Class<T> genericType) {
        return responseBody
                .jsonPath()
                .getList(jsonPath, genericType);
    }
}