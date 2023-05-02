package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_login {
    public String valid_endpoint_login = "https://altashop-api.fly.dev/api/auth/login";
    public String invalid_endpoint_login = "https://altashop-api.fly.dev/api/auth/log in";

    @Step("set POST valid endpoint for login")
    public String setPostValidEndpointForLogin(){
        return valid_endpoint_login;
    }

    @Step("send POST HTTP request for login")
    public void sendPOSTHTTPRequestForLogin(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("received POST HTTP response code 200 for login")
    public void validateHTTPResponseCode200ForLogin(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set POST endpoint with invalid endpoint for login")
    public String setPostEndpointWithInvalidEndpointForLogin(){
        return invalid_endpoint_login;
    }

    @Step("user send POST HTTP request with invalid endpoint for login")
    public void sendPOSTHTTPRequestWithInvalidEndpointForLogin(){
        String body = "{\"email\":\"riza@gmail.com\", \"password\": \"riza123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointWithInvalidEndpointForLogin());
    }

    @Step("user received POST HTTP responses code 404 for login")
    public void validateHTTPResponseCode404WithInvalidEndpointForLogin(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("send POST HTTP request for login with empty email and password")
    public void sendPOSTHTTPRequestForLoginWithEmptyEmailAndPassword(){
        String body = "{\"email\":\"\", \"password\": \"\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }

    @Step("received POST HTTP response code 400 bad request for login")
    public void validateHTTPResponseCode400BadRequestForLogin(){
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("user send POST HTTP request for login with input invalid email and password")
    public void sendPOSTHTTPRequestForLoginWithInputInvalidEmailAndPassword(){
        String body = "{\"email\":\"songhyekyo@gmail.com\", \"password\": \"shk123\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForLogin());
    }
}
