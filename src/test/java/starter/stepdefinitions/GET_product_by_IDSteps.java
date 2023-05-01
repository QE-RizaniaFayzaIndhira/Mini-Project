package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GET_product_by_ID;

public class GET_product_by_IDSteps {
    @Steps
    GET_product_by_ID get_product_by_id;

    @Given("user set GET valid endpoint for product by ID")
    public void userSetGETValidEndpointForProductByID() {
        get_product_by_id.setGETValidEndpointForProductByID();
    }

    @When("user send GET HTTP request with valid endpoint for product by ID")
    public void userSendGETHTTPRequestWithValidEndpointForProductByID() {
        get_product_by_id.sendGETHTTPRequestWithValidEndpointForProductByID();
    }

    @Then("user received valid GET HTTP response code {int} for product by ID")
    public void userReceivedValidGETHTTPResponseCodeForProductByID(int arg0) {
        get_product_by_id.validateGETHTTPResponseCode200ForProductByID();
    }

    @Given("user set GET invalid endpoint for product by ID")
    public void userSetGETInvalidEndpointForProductByID() {
        get_product_by_id.setGETInvalidEndpointForProductByID();
    }

    @When("user send GET HTTP request with invalid endpoint for product by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForProductByID() {
        get_product_by_id.sendGETHTTPRequestWithInvalidEndpointForProductByID();
    }

    @Then("user received GET HTTP response code {int} for product by ID")
    public void userReceivedGETHTTPResponseCodeForProductByID(int arg0) {
        get_product_by_id.validateValidGETHTTPResponseCode404ForProductByID();
    }

    @And("user received valid data for product by ID")
    public void userReceivedValidDataForProductByID() {
        get_product_by_id.validateValidDataForProductByID();
    }
}
