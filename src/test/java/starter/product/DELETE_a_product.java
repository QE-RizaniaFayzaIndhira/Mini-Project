package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_a_product {
    public String valid_url_delete_product = "https://altashop-api.fly.dev/api/products/1";
    public String invalid_url_delete_product = "https://altashop-api.fly.dev/api/product/1";

    @Step("set DELETE valid endpoint")
    public String setDELETEValidEndpoint(){
        return valid_url_delete_product;
    }
    @Step("send DELETE HTTP request with valid endpoint")
    public void sendDELETEHTTPRequestWithValidEndpoint(){
        SerenityRest.given().delete(setDELETEValidEndpoint());
    }
    @Step("received DELETE HTTP response code 200 with valid endpoint")
    public void validateDELETEResponsesCode200WithValidEndpoint(){
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("set DELETE invalid endpoint")
    public String setDELETEInvalidEndpoint(){
        return invalid_url_delete_product;
    }
    @Step("send DELETE HTTP request with invalid endpoint")
    public void sendDELETEHTTPRequestWithInvalidEndpoint(){
        SerenityRest.given().delete(setDELETEInvalidEndpoint());
    }
    @Step("received DELETE HTTP response code 404 with invalid endpoint")
    public void validateDELETEResponseCode404WithInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
