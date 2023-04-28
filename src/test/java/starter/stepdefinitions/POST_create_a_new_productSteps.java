package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.POST_create_a_new_product;

public class POST_create_a_new_productSteps {
    @Steps
    POST_create_a_new_product post_create_a_new_product;

    @Given("user set POST valid endpoint")
    public void userSetPOSTValidEndpoint() {
        post_create_a_new_product.setPostValidEndpoint();
    }

    @When("user send POST HTTP request")
    public void userSendPOSTHTTPRequest() {
        post_create_a_new_product.sendPOSTHTTPRequest();
    }

    @Then("user received HTTP response code {int}")
    public void userReceivedHTTPResponseCode(int arg0) {
        post_create_a_new_product.validateHTTPResponseCode200();
    }

    @Given("user set POST invalid endpoint")
    public void userSetPOSTInvalidEndpoint() {
        post_create_a_new_product.setPostEndpointWithInvalidendpoint();
    }

    @When("user send POST HTTP request with invalid endpoint")
    public void userSendPOSTHTTPRequestWithInvalidEndpoint() {
        post_create_a_new_product.sendPOSTHTTPRequestWithInvalidEndpoint();
    }

    @Then("user received POST HTTP response code {int}")
    public void userReceivedPOSTHTTPResponseCode(int arg0) {
        post_create_a_new_product.validateHTTPResponseCode404WithInvalidEndpoint();
    }

    @When("user send POST HTTP request with input empty request body")
    public void userSendPOSTHTTPRequestWithInputEmptyRequestBody() {
        post_create_a_new_product.sendPOSTHTTPRequestWithInputEmptyRequestBody();
    }

    @Then("user received HTTP response code {int} with input empty request body")
    public void userReceivedHTTPResponseCodeWithInputEmptyRequestBody(int arg0) {
        post_create_a_new_product.validateHTTPResponseCode500WithInputRequestBody();
    }

    @And("user received valid data for new product")
    public void userReceivedValidDataForNewProduct() {
        post_create_a_new_product.validateValidDataForNewProduct();
    }
}
