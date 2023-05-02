package starter.product_categories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class POST_create_a_category {
    public String POST_valid_endpoint_category = "https://altashop-api.fly.dev/api/categories";
    public String POST_invalid_endpoint_category = "https://altashop-api.fly.dev/api/category";

    @Step("set POST valid endpoint for create a category")
    public String setPostValidEndpointForCreateACategory(){
        return POST_valid_endpoint_category;
    }

    @Step("send POST HTTP request for create a category")
    public void sendPOSTHTTPRequestForCreateACategory(){
        String body = "{ \"name\":\"gaming\", \"description\": \"for gaming purposes\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForCreateACategory());
    }

    @Step("received HTTP response code 200 for create a category")
    public void validateHTTPResponseCode200ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST invalid endpoint for create a category")
    public String setPostInvalidEndpointForCreateACategory(){
        return POST_invalid_endpoint_category;
    }

    @Step("send POST HTTP request with invalid endpoint for create a category")
    public void sendPOSTHTTPRequestWithInvalidEndpointForCreateACategory(){
        String body = "{ \"name\":\"gaming\", \"description\": \"for gaming purposes\"}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostInvalidEndpointForCreateACategory());
    }

    @Step("received POST HTTP response code 404 for create a category")
    public void validatePOSTHTTPResponseCode404ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request for create a category with empty request body")
    public void sendPOSTHTTPRequestForCreateACategoryWithEmptyRequestBody(){
        String body = "{ }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForCreateACategory());
    }

    @Step("received HTTP response code 500 for create a category")
    public void validateHTTPResponseCode500ForCreateACategory(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("received valid data for new category")
    public void validateValidDataForNewCategory(){
        restAssuredThat(response->response.body("data.Name",equalTo("gaming")));
        restAssuredThat(response->response.body("data.Description",equalTo("for gaming purposes")));
    }
}
