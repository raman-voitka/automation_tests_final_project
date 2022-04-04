package by.it_academy.homework9_final.utils;

import io.qameta.allure.Step;
import io.restassured.response.ResponseBody;
import org.apache.commons.collections4.MapUtils;
import org.apache.http.HttpStatus;

import java.util.Map;

import static io.restassured.RestAssured.given;

public final class GetRequestUtils {

    private GetRequestUtils() {
    }

    @Step("Make Request and Get ResponseBody")
    public static ResponseBody makeRequestAndGetResponseBody(String endpoint, Map<String, Object> headers,
                                                             Map<String, Object> params) {
        return given()
                .headers(MapUtils.emptyIfNull(headers))
                .params(MapUtils.emptyIfNull(params))
                .when()
                .get(endpoint)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response()
                .getBody();
    }
}