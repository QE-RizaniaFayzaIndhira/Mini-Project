package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.GET_order_by_ID;

public class GET_order_by_IDSteps {
    @Steps
    GET_order_by_ID get_order_by_id;
    @Given("user set GET valid endpoint for order by ID")
    public void userSetGETValidEndpointForOrderByID() {
        get_order_by_id.setGETValidEndpointForOrderByID();
    }

    @When("user send GET HTTP request with valid endpoint for order by ID")
    public void userSendGETHTTPRequestWithValidEndpointForOrderByID() {
        get_order_by_id.sendGETHTTPRequestWithValidEndpointForOrderByID();
    }

    @Then("user received valid GET HTTP response code {int} for order by ID")
    public void userReceivedValidGETHTTPResponseCodeForOrderByID(int arg0) {
        get_order_by_id.validateGETHTTPResponseCode200ForOrderByID();
    }

    @Given("user set GET invalid endpoint for order by ID")
    public void userSetGETInvalidEndpointForOrderByID() {
        get_order_by_id.setGETInvalidEndpointForOrderByID();
    }

    @When("user send GET HTTP request with invalid endpoint for order by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForOrderByID() {
        get_order_by_id.sendGETHTTPRequestWithInvalidQueryEndpointForOrderByID();
    }

    @Then("user received GET HTTP response code {int} for order by ID")
    public void userReceivedGETHTTPResponseCodeForOrderByID(int arg0) {
        get_order_by_id.validateValidGETHTTPResponseCode404ForOrderByID();
    }

    @And("user received valid data for order by ID")
    public void userReceivedValidDataForOrderByID() {
        get_order_by_id.validateValidDataForOrderByID();
    }
}
