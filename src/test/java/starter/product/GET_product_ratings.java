package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_product_ratings {
    public String validEndpointProductRatings = "https://altashop-api.fly.dev/api/products/1/ratings";
    public String invalidEndpointProductRatings = "https://altashop-api.fly.dev/api/products/1/rating";

    @Step("set GET valid endpoint to get product ratings")
    public String setGETValidEndpointToGetProductRatings(){
        return validEndpointProductRatings;
    }

    @Step("send GET HTTP request to get product ratings with valid endpoint")
    public void sendGETHTTPRequestToGetProductRatingsWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpointToGetProductRatings());
    }

    @Step("received valid GET HTTP response code 200 to get product ratings")
    public void validateGETHTTPResponseCode200ToGetProductRatings(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint to get product ratings")
    public String setGETInvalidEndpointToGetProductRatings(){
        return invalidEndpointProductRatings;
    }

    @Step("send GET HTTP request to get product ratings with invalid endpoint")
    public void sendGETHTTPRequestToGetProductRatingsWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpointToGetProductRatings());
    }

    @Step("received GET HTTP response code 404 to get product ratings")
    public void validateValidGETHTTPResponseCode404ToGetProductRatings(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("received valid data for product ratings")
    public void validateValidDataForProductRatings(){
        restAssuredThat(response->response.body("data",equalTo(3)));
    }
}
