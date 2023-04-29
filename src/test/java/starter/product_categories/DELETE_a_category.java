package starter.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DELETE_a_category {
    public String valid_url_delete_category = "https://altashop-api.fly.dev/api/categories/1";
    public String invalid_url_delete_category = "https://altashop-api.fly.dev/api/category/1";

    @Step("set DELETE valid endpoint for delete category")
    public String setDELETEValidEndpointForDeleteCategory(){
        return valid_url_delete_category;
    }
    @Step("send DELETE HTTP request with valid endpoint for delete category")
    public void sendDELETEHTTPRequestWithValidEndpointForDeleteCategory(){
        SerenityRest.given().delete(setDELETEValidEndpointForDeleteCategory());
    }
    @Step("received DELETE HTTP response code 200 with valid endpoint for delete category")
    public void validateDELETEResponsesCode200WithValidEndpointForDeleteCategory(){
        restAssuredThat(responses -> responses.statusCode(200));
    }

    @Step("set DELETE invalid endpoint for delete category")
    public String setDELETEInvalidEndpointForDeleteCategory(){
        return invalid_url_delete_category;
    }
    @Step("send DELETE HTTP request with invalid endpoint for delete category")
    public void sendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory(){
        SerenityRest.given().delete(setDELETEInvalidEndpointForDeleteCategory());
    }
    @Step("received DELETE HTTP response code 404 with invalid endpoint for delete category")
    public void validateDELETEResponseCode404WithInvalidEndpointForDeleteCategory(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
