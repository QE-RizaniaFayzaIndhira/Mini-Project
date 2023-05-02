package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.POST_assign_a_product_rating;

public class POST_assign_a_product_ratingSteps {
    @Steps
    POST_assign_a_product_rating post_assign_a_product_rating;
    @When("user set POST valid endpoint for assign product rating")
    public void userSetPOSTValidEndpointForAssignProductRating() {
        post_assign_a_product_rating.setPostValidEndpointForAssignProductRating();
    }

    @And("user send POST HTTP request for assign product rating")
    public void userSendPOSTHTTPRequestForAssignProductRating() {
        post_assign_a_product_rating.sendPOSTHTTPRequestForAssignProductRating();
    }

    @Then("user received HTTP response code {int} for assign product rating")
    public void userReceivedHTTPResponseCodeForAssignProductRating(int arg0) {
        post_assign_a_product_rating.validateHTTPResponseCode200ForAssignProductRating();
    }

    @When("user set POST invalid endpoint for assign product rating")
    public void userSetPOSTInvalidEndpointForAssignProductRating() {
        post_assign_a_product_rating.setPostEndpointWithInvalidEndpointForAssignProductRating();
    }

    @And("user send POST HTTP request with invalid endpoint for assign product rating")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating() {
        post_assign_a_product_rating.sendPOSTHTTPRequestWithInvalidEndpointForAssignProductRating();
    }

    @Then("user received POST HTTP response code {int} for assign product rating")
    public void userReceivedPOSTHTTPResponseCodeForAssignProductRating(int arg0) {
        post_assign_a_product_rating.validateHTTPResponseCode404WithInvalidEndpointForAssignProductRating();
    }

    @When("user set POST valid endpoint with empty request body for assign product rating")
    public void userSetPOSTValidEndpointWithEmptyRequestBodyForAssignProductRating() {
        post_assign_a_product_rating.setPostValidEndpointWithEmptyRequestBodyForAssignProductRating();
    }

    @And("user send POST HTTP request with empty request body for assign product rating")
    public void userSendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating() {
        post_assign_a_product_rating.sendPOSTHTTPRequestWithEmptyRequestBodyForAssignProductRating();
    }

    @Then("user received HTTP response code {int} with empty request body for assign product rating")
    public void userReceivedHTTPResponseCodeWithEmptyRequestBodyForAssignProductRating(int arg0) {
        post_assign_a_product_rating.validateHTTPResponseCode200WithEmptyRequestBodyForAssignProductRating();
    }

    @And("user received valid data for assign product rating")
    public void userReceivedValidDataForAssignProductRating() {
        post_assign_a_product_rating.validateValidDataForAssignProductRating();
    }
}
