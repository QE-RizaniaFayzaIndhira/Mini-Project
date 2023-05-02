package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_assign_a_product_rating {
    public String POST_valid_endpoint_product_rating = "https://altashop-api.fly.dev/api/products/12237/ratings";
    public String POST_invalid_endpoint_product_rating = "https://altashop-api.fly.dev/api/products/12237/rating";
    public String POST_endpoint_empty_product_rating = "https://altashop-api.fly.dev/api/products/11300/ratings";

    @Step("set POST valid endpoint for assign product rating")
    public String setPostValidEndpointForAssignProductRating(){
        return POST_valid_endpoint_product_rating;
    }

    @Step("send POST HTTP request with valid endpoint for assign product rating")
    public void sendPOSTHTTPRequestForAssignProductRating(){
        String body = "{ \"count\":\"4\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setPostValidEndpointForAssignProductRating());
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

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForAssignProductRating());
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

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body(reqBody.toString()).post(setPostValidEndpointWithEmptyRequestBodyForAssignProductRating());
    }

    @Step("received HTTP response code 200 with empty request body for assign product rating")
    public void validateHTTPResponseCode200WithEmptyRequestBodyForAssignProductRating(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("received valid data for assign product rating")
    public void validateValidDataForAssignProductRating(){
        restAssuredThat(response->response.body("data.Name",equalTo("Gorgeous Steel Plate")));
        restAssuredThat(response->response.body("data.Description",equalTo("Cotton")));
        restAssuredThat(response->response.body("data.Price",equalTo(7841)));
        restAssuredThat(response->response.body("data.Ratings",equalTo(4)));
    }
}
