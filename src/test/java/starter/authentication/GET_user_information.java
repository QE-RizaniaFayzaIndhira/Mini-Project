package starter.authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_user_information {
    public String validEndpointUserInformation = "https://altashop-api.fly.dev/api/auth/info";
    public String invalidEndpointUserInformation = "https://altashop-api.fly.dev/api/auth//info";

    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

    @Step("set GET valid endpoint for user information")
    public String setGETValidEndpointForUserInformation(){
        return validEndpointUserInformation;
    }

    @Step("send GET HTTP request with valid endpoint for user information")
    public void sendGETHTTPRequestWithValidEndpointForUserInformation(){
        SerenityRest.given().auth().oauth2(token).get(setGETValidEndpointForUserInformation());
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
        SerenityRest.given().auth().oauth2(token).get(setGETInvalidEndpointForUserInformation());
    }

    @Step("received GET HTTP response code 404 for user information")
    public void validateValidGETHTTPResponseCode404ForUserInformation(){
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("received valid data for user information")
    public void validateValidDataForUserInformation(){
        restAssuredThat(response->response.body("'data.Fullname'",equalTo("Firstname Lastname")));
        restAssuredThat(response->response.body("'data.Email'",equalTo("someone.mail.com")));
        restAssuredThat(response->response.body("'data.Password'",equalTo("123123")));
    }
}
