package starter.orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GET_all_orders {
    public String validEndpointAllOrders = "https://altashop-api.fly.dev/api/orders";
    public String invalidEndpointAllOrders = "https://altashop-api.fly.dev/api/order";

    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IkZpcnN0bmFtZSBMYXN0bmFtZSIsIkVtYWlsIjoic29tZW9uZUBtYWlsLmNvbSJ9.bGpZNDg6YHtKlTFw7_yuyn3SAICmfvdIV1yX7mIKrTw";

    @Step("set GET valid endpoint for all orders")
    public String setGETValidEndpointForAllOrders(){
        return validEndpointAllOrders;
    }

    @Step("send GET HTTP request with valid endpoint for all orders")
    public void sendGETHTTPRequestWithValidEndpointForAllOrders(){
        SerenityRest.given().auth().oauth2(token).get(setGETValidEndpointForAllOrders());
    }

    @Step("received valid GET HTTP response code 200 for all orders")
    public void validateGETHTTPResponseCode200ForAllOrders(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("set GET invalid endpoint for all orders")
    public String setGETInvalidEndpointForAllOrders(){
        return invalidEndpointAllOrders;
    }

    @Step("send GET HTTP request with invalid endpoint for all orders")
    public void sendGETHTTPRequestWithInvalidQueryEndpointForAllOrders(){
        SerenityRest.given().auth().oauth2(token).get(setGETInvalidEndpointForAllOrders());
    }

    @Step("received GET HTTP response code 404 for all orders")
    public void validateValidGETHTTPResponseCode404ForAllOrders(){
        restAssuredThat(response -> response.statusCode(404));
    }
}
