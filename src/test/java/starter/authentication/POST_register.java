package starter.authentication;

import com.github.javafaker.Faker;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class POST_register {
    public String valid_endpoint_register = "https://altashop-api.fly.dev/api/auth/register";
    public String invalid_endpoint_register = "https://altashop-api.fly.dev/api/auth/registered";

    @Step("set POST valid endpoint for register")
    public String setPostValidEndpointForRegister(){
        return valid_endpoint_register;
    }

    @Step("user send POST HTTP request with valid endpoint for register")
    public void sendPOSTHTTPRequestWithValidEndpointForRegister(){
        Faker faker = new Faker();
        String fullname = faker.name().fullName();
        String body =
                "{\"email\": " + fullname + "\"@gmail.com\"" + ",\n" +
                "\"password\": " + fullname + "\"123\"" + ",\n" +
                "\"fullname\": " + fullname + "\n}";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostValidEndpointForRegister());
    }

    @Step("user received POST HTTP response code 200 for register")
    public void validateHTTPResponseCode200ForRegister(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("user set POST invalid endpoint for register")
    public String setPostInvalidEndpointForRegister(){
        return invalid_endpoint_register;
    }

    @Step("user send POST HTTP request with invalid endpoint for register")
    public void sendPOSTHTTPRequestWithInvalidEndpointForRegister(){
        String body = "{\"email\":\"kevin@gmail.com\", \"password\": \"kevin123\", \"fullname\": \"Kevin Aprilio\" }";

        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostInvalidEndpointForRegister());
    }

    @Step("user received POST HTTP responses code 404 for register")
    public void validateHTTPResponseCode404WithInvalidEndpointForRegister(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
