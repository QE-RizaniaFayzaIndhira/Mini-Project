package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_create_a_new_order {
    public String POST_valid_endpoint_new_order = "https://altashop-api.fly.dev/api/orders";
    public String POST_invalid_endpoint_new_order = "https://altashop-api.fly.dev/api/order";

    @Step("set POST valid endpoint for create new order")
    public String setPostValidEndpointForCreateNewOrder(){
        return POST_valid_endpoint_new_order;
    }

    @Step("send POST HTTP request with valid endpoint for create new order")
    public void sendPOSTHTTPRequestForCreateNewOrder(){
        String body = "{\n" +
                "        \"product_id\":11305,\n" +
                "        \"quantity\":1\n" +
                "    }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostValidEndpointForCreateNewOrder());
    }

    @Step("received HTTP response code 200 for create new order")
    public void validateHTTPResponseCode200ForCreateNewOrder(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST endpoint with invalid endpoint for create new order")
    public String setPostEndpointWithInvalidEndpointForCreateNewOrder(){
        return POST_invalid_endpoint_new_order;
    }

    @Step("send POST HTTP request with invalid endpoint for create new order")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder(){
        String body = "{\n" +
                "        \"product_id\":11305,\n" +
                "        \"quantity\":1\n" +
                "    }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostEndpointWithInvalidEndpointForCreateNewOrder());
    }

    @Step("received HTTP response code 404 with invalid endpoint for create new order")
    public void validateHTTPResponseCode404WithInvalidEndpointForCreateNewOrder(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request with empty request body for create new order")
    public void sendPOSTHTTPRequestWithEmptyRequestBodyForCreateNewOrder(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Authorization", "Bearer " + Login.token).contentType("application/json").body("[\n"+reqBody.toString()+"\n]").post(setPostValidEndpointForCreateNewOrder());
    }
}
