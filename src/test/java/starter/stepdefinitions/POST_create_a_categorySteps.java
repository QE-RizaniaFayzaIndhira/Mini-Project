package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product_categories.POST_create_a_category;

public class POST_create_a_categorySteps {
    @Steps
    POST_create_a_category post_create_a_category;
    @Given("user set POST valid endpoint for create a category")
    public void userSetPOSTValidEndpointForCreateACategory() {
        post_create_a_category.setPostValidEndpointForCreateACategory();
    }

    @When("user send POST HTTP request for create a category")
    public void userSendPOSTHTTPRequestForCreateACategory() {
        post_create_a_category.sendPOSTHTTPRequestForCreateACategory();
    }

    @Then("user received HTTP response code {int} for create a category")
    public void userReceivedHTTPResponseCodeForCreateACategory(int arg0) {
        post_create_a_category.validateHTTPResponseCode200ForCreateACategory();
    }

    @Given("user set POST invalid endpoint for create a category")
    public void userSetPOSTInvalidEndpointForCreateACategory() {
        post_create_a_category.setPostInvalidEndpointForCreateACategory();
    }

    @When("user send POST HTTP request with invalid endpoint for create a category")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateACategory() {
        post_create_a_category.sendPOSTHTTPRequestWithInvalidEndpointForCreateACategory();
    }

    @Then("user received POST HTTP response code {int} for create a category")
    public void userReceivedPOSTHTTPResponseCodeForCreateACategory(int arg0) {
        post_create_a_category.validatePOSTHTTPResponseCode404ForCreateACategory();
    }

    @When("user send POST HTTP request for create a category with empty request body")
    public void userSendPOSTHTTPRequestForCreateACategoryWithEmptyRequestBody() {
        post_create_a_category.sendPOSTHTTPRequestForCreateACategoryWithEmptyRequestBody();
    }

    @Then("user received HTTP response code {int} for create a category with empty request body")
    public void userReceivedHTTPResponseCodeForCreateACategoryWithEmptyRequestBody(int arg0) {
        post_create_a_category.validateHTTPResponseCode500ForCreateACategory();
    }

    @And("user received valid data for new category")
    public void userReceivedValidDataForNewCategory() {
        post_create_a_category.validateValidDataForNewCategory();
    }
}
