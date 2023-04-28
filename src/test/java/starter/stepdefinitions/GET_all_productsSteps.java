package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GET_all_products;

public class GET_all_productsSteps {
    @Steps
    GET_all_products get_all_products;

    @Given("user set GET valid endpoint")
    public void userSetGETValidEndpoint() {
        get_all_products.setGETValidEndpoint();
    }

    @When("user send GET HTTP request with valid endpoint")
    public void userSendGETHTTPRequestWithValidEndpoint() {
        get_all_products.sendGETHTTPRequestWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int}")
    public void userReceivedValidGETHTTPResponseCode(int arg0) {
        get_all_products.validateGETHTTPResponseCode200();
    }

    @Given("user set GET invalid endpoint")
    public void userSetGETInvalidEndpoint() {
        get_all_products.setGETInvalidEndpoint();
    }

    @When("user send GET HTTP request with invalid endpoint")
    public void userSendGETHTTPRequestWithInvalidEndpoint() {
        get_all_products.sendGETHTTPRequestWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int}")
    public void userReceivedGETHTTPResponseCode(int arg0) {
        get_all_products.validateValidGETHTTPResponseCode404();
    }
}
