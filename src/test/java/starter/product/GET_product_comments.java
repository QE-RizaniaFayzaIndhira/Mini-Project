package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_product_comments {
    public String validEndpointProductComments = "https://altashop-api.fly.dev/api/products/2/comments";
    public String invalidEndpointProductComments = "https://altashop-api.fly.dev/api/products/2/comment";

    @Step("set GET valid endpoint to get product comments")
    public String setGETValidEndpointToGetProductComments(){
        return validEndpointProductComments;
    }

    @Step("send GET HTTP request to get product comments with valid endpoint")
    public void sendGETHTTPRequestToGetProductCommentsWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpointToGetProductComments());
    }

    @Step("received valid GET HTTP response code 200 to get product comments")
    public void validateGETHTTPResponseCode200ToGetProductComments(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint to get product comments")
    public String setGETInvalidEndpointToGetProductComments(){
        return invalidEndpointProductComments;
    }

    @Step("send GET HTTP request to get product comments with invalid endpoint")
    public void sendGETHTTPRequestToGetProductCommentsWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpointToGetProductComments());
    }

    @Step("received GET HTTP response code 404 to get product comments")
    public void validateValidGETHTTPResponseCode404ToGetProductComments(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
