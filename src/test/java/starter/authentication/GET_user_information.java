package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_user_information {
    public String validEndpointUserInformation = "https://altashop-api.fly.dev/api/auth/info";
    public String invalidEndpointUserInformation = "https://altashop-api.fly.dev/api/auth//info";

    @Step("set GET valid endpoint for user information")
    public String setGETValidEndpointForUserInformation(){
        return validEndpointUserInformation;
    }

    @Step("send GET HTTP request with valid endpoint for user information")
    public void sendGETHTTPRequestWithValidEndpointForUserInformation(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setGETValidEndpointForUserInformation());
    }

    @Step("received valid GET HTTP response code 200 for user information")
    public void validateGETHTTPResponseCode200ForUserInformation(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for user information")
    public String setGETInvalidEndpointForUserInformation(){
        return invalidEndpointUserInformation;
    }

    @Step("send GET HTTP request with invalid endpoint for user information")
    public void sendGETHTTPRequestWithInvalidEndpointForUserInformation(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setGETInvalidEndpointForUserInformation());
    }

    @Step("received GET HTTP response code 404 for user information")
    public void validateValidGETHTTPResponseCode404ForUserInformation(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("received valid data for user information")
    public void validateValidDataForUserInformation(){
        restAssuredThat(response->response.body("data.Fullname",equalTo("Riza Lagi")));
        restAssuredThat(response->response.body("data.Email",equalTo("riza@gmail.com")));
        restAssuredThat(response->response.body("data.Password",equalTo("riza123")));
    }
}
