package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_create_a_new_product {
    public String POST_valid_endpoint = "https://altashop-api.fly.dev/api/products";
    public String POST_invalid_endpoint = "https://altashop-api.fly.dev/api/product";

    @Step("set POST valid endpoint")
    public String setPostValidEndpoint(){
        return POST_valid_endpoint;
    }

    @Step("send POST HTTP request with valid endpoint")
    public void sendPOSTHTTPRequest(){
        String body = "{ \"name\":\"Sony PS5\", \"description\": \"play has no limits\",\"price\":299,\"categories\":[1] }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpoint());
    }

    @Step("received HTTP response code 200")
    public void validateHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST endpoint with invalid endpoint")
    public String setPostEndpointWithInvalidendpoint(){
        return POST_invalid_endpoint;
    }

    @Step("send POST HTTP request with invalid endpoint")
    public void sendPOSTHTTPRequestWithInvalidEndpoint(){
        String body = "{ \"name\":\"Sony PS5\", \"description\": \"play has no limits\",\"price\":299,\"categories\":[1] }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidendpoint());
    }

    @Step("received HTTP response code 404 with invalid endpoint")
    public void validateHTTPResponseCode404WithInvalidEndpoint(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with input empty request body")
    public void sendPOSTHTTPRequestWithInputEmptyRequestBody(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpoint());
    }

    @Step("received HTTP response code 500 with input empty request body")
    public void validateHTTPResponseCode500WithInputRequestBody(){
        restAssuredThat(response -> response.statusCode(500));
    }

    @Step("received valid data for new product")
    public void validateValidDataForNewProduct(){
        restAssuredThat(response->response.body("data.Name",equalTo("Sony PS5")));
        restAssuredThat(response->response.body("data.Description",equalTo("play has no limits")));
        restAssuredThat(response->response.body("data.Price",equalTo(299)));
    }
}
