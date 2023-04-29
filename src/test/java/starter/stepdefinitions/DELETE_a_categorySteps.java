package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product_categories.DELETE_a_category;

public class DELETE_a_categorySteps {
    @Steps
    DELETE_a_category delete_a_category;
    @Given("user set DELETE valid endpoint for delete category")
    public void userSetDELETEValidEndpointForDeleteCategory() {
        delete_a_category.setDELETEValidEndpointForDeleteCategory();
    }

    @When("user send DELETE HTTP request with valid endpoint for delete category")
    public void userSendDELETEHTTPRequestWithValidEndpointForDeleteCategory() {
        delete_a_category.sendDELETEHTTPRequestWithValidEndpointForDeleteCategory();
    }

    @Then("user received DELETE HTTP response code {int} with valid endpoint for delete category")
    public void userReceivedDELETEHTTPResponseCodeWithValidEndpointForDeleteCategory(int arg0) {
        delete_a_category.validateDELETEResponsesCode200WithValidEndpointForDeleteCategory();
    }

    @Given("user set DELETE endpoint with invalid endpoint for delete category")
    public void userSetDELETEEndpointWithInvalidEndpointForDeleteCategory() {
        delete_a_category.setDELETEInvalidEndpointForDeleteCategory();
    }

    @When("user send DELETE HTTP request with invalid endpoint for delete category")
    public void userSendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory() {
        delete_a_category.sendDELETEHTTPRequestWithInvalidEndpointForDeleteCategory();
    }

    @Then("user received DELETE HTTP response code {int} with invalid endpoint for delete category")
    public void userReceivedDELETEHTTPResponseCodeWithInvalidEndpointForDeleteCategory(int arg0) {
        delete_a_category.validateDELETEResponseCode404WithInvalidEndpointForDeleteCategory();
    }
}
