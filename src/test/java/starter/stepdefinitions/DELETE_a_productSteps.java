package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.DELETE_a_product;

public class DELETE_a_productSteps {
    @Steps
    DELETE_a_product delete_a_product;

    @Given("user set DELETE valid endpoint")
    public void userSetDELETEValidEndpoint() {
        delete_a_product.setDELETEValidEndpoint();
    }

    @When("user send DELETE HTTP request with valid endpoint")
    public void userSendDELETEHTTPRequestWithValidEndpoint() {
        delete_a_product.sendDELETEHTTPRequestWithValidEndpoint();
    }

    @Then("user received DELETE HTTP response code {int} with valid endpoint")
    public void userReceivedDELETEHTTPResponseCodeWithValidEndpoint(int arg0) {
        delete_a_product.validateDELETEResponsesCode200WithValidEndpoint();
    }

    @Given("user set DELETE endpoint with invalid endpoint")
    public void userSetDELETEEndpointWithInvalidEndpoint() {
        delete_a_product.setDELETEInvalidEndpoint();
    }

    @When("user send DELETE HTTP request with invalid endpoint")
    public void userSendDELETEHTTPRequestWithInvalidEndpoint() {
        delete_a_product.sendDELETEHTTPRequestWithInvalidEndpoint();
    }

    @Then("user received DELETE HTTP response code {int} with invalid endpoint")
    public void userReceivedDELETEHTTPResponseCodeWithInvalidEndpoint(int arg0) {
        delete_a_product.validateDELETEResponseCode404WithInvalidEndpoint();
    }
}
