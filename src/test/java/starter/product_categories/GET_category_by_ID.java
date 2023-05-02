package starter.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_category_by_ID {
    public String validEndpointCategoryByID = "https://altashop-api.fly.dev/api/categories/11310";
    public String invalidEndpointCategoryByID = "https://altashop-api.fly.dev/api/category/11310";

    @Step("set GET valid endpoint for category by ID")
    public String setGETValidEndpointForCategoryByID(){
        return validEndpointCategoryByID;
    }

    @Step("send GET HTTP request with valid endpoint for category by ID")
    public void sendGETHTTPRequestWithValidEndpointForCategoryByID(){
        SerenityRest.given().get(setGETValidEndpointForCategoryByID());
    }

    @Step("received valid GET HTTP response code 200 for category by ID")
    public void validateGETHTTPResponseCode200ForCategoryByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for category by ID")
    public String setGETInvalidEndpointForCategoryByID(){
        return invalidEndpointCategoryByID;
    }

    @Step("send GET HTTP request with invalid endpoint for category by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForCategoryByID(){
        SerenityRest.given().get(setGETInvalidEndpointForCategoryByID());
    }

    @Step("received GET HTTP response code 404 for category by ID")
    public void validateValidGETHTTPResponseCode404ForCategoryByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("received valid data for category by ID")
    public void validateValidDataForCategoryByID(){
        restAssuredThat(response->response.body("data.Name",equalTo("gaming")));
        restAssuredThat(response->response.body("data.Description",equalTo("for gaming purposes")));
    }
}
