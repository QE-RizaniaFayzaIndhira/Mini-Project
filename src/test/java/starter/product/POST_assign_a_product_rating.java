package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_assign_a_product_rating {
    public String POST_valid_endpoint_product_rating = "https://altashop-api.fly.dev/api/products/11289/ratings";
    public String POST_invalid_endpoint_product_rating = "https://altashop-api.fly.dev/api/products/11289/rating";
    public String POST_endpoint_empty_product_rating = "https://altashop-api.fly.dev/api/products/11296/ratings";

    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

    @Step("set POST valid endpoint for assign product rating")
    public String setPostValidEndpointForAssignProductRating(){
        return POST_valid_endpoint_product_rating;
    }

    @Step("send POST HTTP request with valid endpoint for assign product rating")
    public void sendPOSTHTTPRequestForAssignProductRating(){
        String body = "{ \"count\":\"4\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().auth().oauth2(token).header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForAssignProductRating());
    }

    @Step("received HTTP response code 200 for assign product rating")
    public void validateHTTPResponseCode200ForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST endpoint with invalid endpoint for assign product rating")
    public String setPostEndpointWithInvalidEndpointForAssignProductRating(){
        return POST_invalid_endpoint_product_rating;
    }

    @Step("send POST HTTP request with invalid endpoint for assign product rating")
    public void sendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating(){
        String body = "{ \"count\":\"4\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().auth().oauth2(token).header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForAssignProductRating());
    }

    @Step("received HTTP response code 404 with invalid endpoint for assign product rating")
    public void validateHTTPResponseCode404WithInvalidEndpointForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("set POST valid endpoint with empty request body for assign product rating")
    public String setPostValidEndpointWithEmptyRequestBodyForAssignProductRating(){
        return POST_endpoint_empty_product_rating;
    }

    @Step("send POST HTTP request with empty request body for assign product rating")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().auth().oauth2(token).header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointWithEmptyRequestBodyForAssignProductRating());
    }

    @Step("received HTTP response code 200 with empty request body for assign product rating")
    public void validateHTTPResponseCode200WithEmptyRequestBodyForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("received valid data for assign product rating")
    public void validateValidDataForAssignProductRating(){
        restAssuredThat(response->response.body("'data.name'",equalTo("HP core i5")));
        restAssuredThat(response->response.body("'data.description'",equalTo("play has no limits")));
        restAssuredThat(response->response.body("'data.price'",equalTo(6000000)));
        restAssuredThat(response->response.body("'data.ratings'",equalTo(4)));
    }
}
