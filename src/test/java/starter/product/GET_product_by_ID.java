package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_product_by_ID {
    public String validEndpointProductByID = "https://altashop-api.fly.dev/api/products/11289";
    public String invalidEndpointProductByID = "https://altashop-api.fly.dev/api/product/11289";

    @Step("set GET valid endpoint for product by ID")
    public String setGETValidEndpointForProductByID(){
        return validEndpointProductByID;
    }

    @Step("send GET HTTP request with valid endpoint for product by ID")
    public void sendGETHTTPRequestWithValidEndpointForProductByID(){
        SerenityRest.given().get(setGETValidEndpointForProductByID());
    }

    @Step("received valid GET HTTP response code 200 for product by ID")
    public void validateGETHTTPResponseCode200ForProductByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for product by ID")
    public String setGETInvalidEndpointForProductByID(){
        return invalidEndpointProductByID;
    }

    @Step("send GET HTTP request with invalid endpoint for product by ID")
    public void sendGETHTTPRequestWithInvalidEndpointForProductByID(){
        SerenityRest.given().get(setGETInvalidEndpointForProductByID());
    }

    @Step("received GET HTTP response code 404 for product by ID")
    public void validateValidGETHTTPResponseCode404ForProductByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("received valid data for product by ID")
    public void validateValidDataForProductByID(){
        restAssuredThat(response->response.body("'data.name'",equalTo("HP core i5")));
        restAssuredThat(response->response.body("'data.description'",equalTo("play has no limits")));
        restAssuredThat(response->response.body("'data.price'",equalTo(6000000)));
    }
}
