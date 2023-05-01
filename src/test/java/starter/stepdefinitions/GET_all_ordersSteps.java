package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.GET_all_orders;

public class GET_all_ordersSteps {
    @Steps
    GET_all_orders get_all_orders;
    @Given("user set GET valid endpoint for all orders")
    public void userSetGETValidEndpointForAllOrders() {
        get_all_orders.setGETValidEndpointForAllOrders();
    }

    @When("user send GET HTTP request with valid endpoint for all orders")
    public void userSendGETHTTPRequestWithValidEndpointForAllOrders() {
        get_all_orders.sendGETHTTPRequestWithValidEndpointForAllOrders();
    }

    @Then("user received valid GET HTTP response code {int} for all orders")
    public void userReceivedValidGETHTTPResponseCodeForAllOrders(int arg0) {
        get_all_orders.validateGETHTTPResponseCode200ForAllOrders();
    }

    @Given("user set GET invalid endpoint for all orders")
    public void userSetGETInvalidEndpointForAllOrders() {
        get_all_orders.setGETInvalidEndpointForAllOrders();
    }

    @When("user send GET HTTP request with invalid endpoint for all orders")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllOrders() {
        get_all_orders.sendGETHTTPRequestWithInvalidQueryEndpointForAllOrders();
    }

    @Then("user received GET HTTP response code {int} for all orders")
    public void userReceivedGETHTTPResponseCodeForAllOrders(int arg0) {
        get_all_orders.validateValidGETHTTPResponseCode404ForAllOrders();
    }
}
