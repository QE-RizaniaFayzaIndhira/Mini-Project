package starter.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GET_all_products {
    public String validEndpoint = "https://altashop-api.fly.dev/api/products";
    public String invalidEndpoint = "https://altashop-api.fly.dev/api/product";

    @Step("set GET valid endpoint")
    public String setGETValidEndpoint(){
        return validEndpoint;
    }

    @Step("send GET HTTP request with valid endpoint")
    public void sendGETHTTPRequestWithValidEndpoint(){
        SerenityRest.given().get(setGETValidEndpoint());
    }

    @Step("received valid GET HTTP response code 200")
    public void validateGETHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint")
    public String setGETInvalidEndpoint(){
        return invalidEndpoint;
    }

    @Step("send GET HTTP request with invalid endpoint")
    public void sendGETHTTPRequestWithInvalidQueryEndpoint(){
        SerenityRest.given().get(setGETInvalidEndpoint());
    }

    @Step("received GET HTTP response code 404")
    public void validateValidGETHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
