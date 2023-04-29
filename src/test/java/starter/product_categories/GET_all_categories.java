package starter.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_all_categories {
    public String validEndpointCategories = "https://altashop-api.fly.dev/api/categories";
    public String invalidEndpointCategories = "https://altashop-api.fly.dev/api/category";

    @Step("set GET valid endpoint for all categories")
    public String setGETValidEndpointForAllCategories(){
        return validEndpointCategories;
    }

    @Step("send GET HTTP request with valid endpoint for all categories")
    public void sendGETHTTPRequestWithValidEndpointForAllCategories(){
        SerenityRest.given().get(setGETValidEndpointForAllCategories());
    }

    @Step("received valid GET HTTP response code 200 for all categories")
    public void validateGETHTTPResponseCode200ForAllCategories(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for all categories")
    public String setGETInvalidEndpointForAllCategories(){
        return invalidEndpointCategories;
    }

    @Step("send GET HTTP request with invalid endpoint for all categories")
    public void sendGETHTTPRequestWithInvalidEndpointForAllCategories(){
        SerenityRest.given().get(setGETInvalidEndpointForAllCategories());
    }

    @Step("received GET HTTP response code 404 for all categories")
    public void validateValidGETHTTPResponseCode404ForAllCategories(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
