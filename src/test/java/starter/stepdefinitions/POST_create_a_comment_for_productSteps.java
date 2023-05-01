package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.POST_create_a_comment_for_product;

public class POST_create_a_comment_for_productSteps {
    @Steps
    POST_create_a_comment_for_product post_create_a_comment_for_product;
    @Given("user set POST valid endpoint for create comment product")
    public void userSetPOSTValidEndpointForCreateCommentProduct() {
        post_create_a_comment_for_product.setPostValidEndpointForCreateCommentProduct();
    }

    @When("user send POST HTTP request for create comment product")
    public void userSendPOSTHTTPRequestForCreateCommentProduct() {
        post_create_a_comment_for_product.sendPOSTHTTPRequestForCreateCommentProduct();
    }

    @Then("user received HTTP response code {int} for create comment product")
    public void userReceivedHTTPResponseCodeForCreateCommentProduct(int arg0) {
        post_create_a_comment_for_product.validateHTTPResponseCode200ForCreateCommentProduct();
    }

    @Given("user set POST invalid endpoint for create comment product")
    public void userSetPOSTInvalidEndpointForCreateCommentProduct() {
        post_create_a_comment_for_product.setPostEndpointWithInvalidEndpointForCreateCommentProduct();
    }

    @When("user send POST HTTP request with invalid endpoint for create comment product")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateCommentProduct() {
        post_create_a_comment_for_product.sendPOSTHTTPRequestWithInvalidEndpointForCreateCommentProduct();
    }

    @Then("user received POST HTTP response code {int} for create comment product")
    public void userReceivedPOSTHTTPResponseCodeForCreateCommentProduct(int arg0) {
        post_create_a_comment_for_product.validateHTTPResponseCode404WithInvalidEndpointForCreateCommentProduct();
    }

    @When("user send POST HTTP request for create comment product with empty request body")
    public void userSendPOSTHTTPRequestForCreateCommentProductWithEmptyRequestBody() {
        post_create_a_comment_for_product.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateCommentProduct();
    }

    @Then("user received HTTP response code {int} Internal Server Error for create comment product")
    public void userReceivedHTTPResponseCodeInternalServerErrorForCreateCommentProduct(int arg0) {
        post_create_a_comment_for_product.validateHTTPResponseCode500InternalServerErrorWithEmptyRequestBodyForCreateCommentProduct();
    }

    @And("user received valid data for create comment product")
    public void userReceivedValidDataForCreateCommentProduct() {
        post_create_a_comment_for_product.validateValidDataForCreateCommentProduct();
    }


}
