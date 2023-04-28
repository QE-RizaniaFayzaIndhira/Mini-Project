package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GET_product_comments;

public class GET_product_commentsSteps {
    @Steps
    GET_product_comments get_product_comments;
    @Given("user set GET valid endpoint to get product comments")
    public void userSetGETValidEndpointToGetProductComments() {
        get_product_comments.setGETValidEndpointToGetProductComments();
    }

    @When("user send GET HTTP request to get product comments with valid endpoint")
    public void userSendGETHTTPRequestToGetProductCommentsWithValidEndpoint() {
        get_product_comments.sendGETHTTPRequestToGetProductCommentsWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int} to get product comments")
    public void userReceivedValidGETHTTPResponseCodeToGetProductComments(int arg0) {
        get_product_comments.validateGETHTTPResponseCode200ToGetProductComments();
    }

    @Given("user set GET invalid endpoint to get product comments")
    public void userSetGETInvalidEndpointToGetProductComments() {
        get_product_comments.setGETInvalidEndpointToGetProductComments();
    }

    @When("user send GET HTTP request to get product comments with invalid endpoint")
    public void userSendGETHTTPRequestToGetProductCommentsWithInvalidEndpoint() {
        get_product_comments.sendGETHTTPRequestToGetProductCommentsWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int} to get product comments")
    public void userReceivedGETHTTPResponseCodeToGetProductComments(int arg0) {
        get_product_comments.validateValidGETHTTPResponseCode404ToGetProductComments();
    }

    @And("user received valid data for product comments")
    public void userReceivedValidDataForProductComments() {
        get_product_comments.validateValidDataForProductComments();
    }
}
