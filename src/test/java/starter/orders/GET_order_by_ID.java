package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Login;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_order_by_ID {
    public String validEndpointOrderByID = "https://altashop-api.fly.dev/api/orders/9827";
    public String invalidEndpointOrderByID = "https://altashop-api.fly.dev/api/order/9827";

    @Step("set GET valid endpoint for order by ID")
    public String setGETValidEndpointForOrderByID(){
        return validEndpointOrderByID;
    }

    @Step("send GET HTTP request with valid endpoint for order by ID")
    public void sendGETHTTPRequestWithValidEndpointForOrderByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setGETValidEndpointForOrderByID());
    }

    @Step("received valid GET HTTP response code 200 for order by ID")
    public void validateGETHTTPResponseCode200ForOrderByID(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for order by ID")
    public String setGETInvalidEndpointForOrderByID(){
        return invalidEndpointOrderByID;
    }

    @Step("send GET HTTP request with invalid endpoint for order by ID")
    public void sendGETHTTPRequestWithInvalidQueryEndpointForOrderByID(){
        SerenityRest.given().header("Authorization", "Bearer " + Login.token).get(setGETInvalidEndpointForOrderByID());
    }

    @Step("received GET HTTP response code 404 for order by ID")
    public void validateValidGETHTTPResponseCode404ForOrderByID(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
