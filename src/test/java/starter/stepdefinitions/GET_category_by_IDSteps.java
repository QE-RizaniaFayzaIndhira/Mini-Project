package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product_categories.GET_category_by_ID;

public class GET_category_by_IDSteps {
    @Steps
    GET_category_by_ID get_category_by_id;
    @Given("user set GET valid endpoint for category by ID")
    public void userSetGETValidEndpointForCategoryByID() {
        get_category_by_id.setGETValidEndpointForCategoryByID();
    }

    @When("user send GET HTTP request with valid endpoint for category by ID")
    public void userSendGETHTTPRequestWithValidEndpointForCategoryByID() {
        get_category_by_id.sendGETHTTPRequestWithValidEndpointForCategoryByID();
    }

    @Then("user received valid GET HTTP response code {int} for category by ID")
    public void userReceivedValidGETHTTPResponseCodeForCategoryByID(int arg0) {
        get_category_by_id.validateGETHTTPResponseCode200ForCategoryByID();
    }

    @Given("user set GET invalid endpoint for category by ID")
    public void userSetGETInvalidEndpointForCategoryByID() {
        get_category_by_id.setGETInvalidEndpointForCategoryByID();
    }

    @When("user send GET HTTP request with invalid endpoint for category by ID")
    public void userSendGETHTTPRequestWithInvalidEndpointForCategoryByID() {
        get_category_by_id.sendGETHTTPRequestWithInvalidEndpointForCategoryByID();
    }

    @Then("user received GET HTTP response code {int} for category by ID")
    public void userReceivedGETHTTPResponseCodeForCategoryByID(int arg0) {
        get_category_by_id.sendGETHTTPRequestWithInvalidEndpointForCategoryByID();
    }

    @And("user received valid data for category by ID")
    public void userReceivedValidDataForCategoryByID() {
        get_category_by_id.validateValidDataForCategoryByID();
    }
}
