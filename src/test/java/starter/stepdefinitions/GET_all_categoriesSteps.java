package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product_categories.GET_all_categories;

public class GET_all_categoriesSteps {
    @Steps
    GET_all_categories get_all_categories;
    @Given("user set GET valid endpoint for all categories")
    public void userSetGETValidEndpointForAllCategories() {
        get_all_categories.setGETValidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with valid endpoint for all categories")
    public void userSendGETHTTPRequestWithValidEndpointForAllCategories() {
        get_all_categories.sendGETHTTPRequestWithValidEndpointForAllCategories();
    }

    @Then("user received valid GET HTTP response code {int} for all categories")
    public void userReceivedValidGETHTTPResponseCodeForAllCategories(int arg0) {
        get_all_categories.validateGETHTTPResponseCode200ForAllCategories();
    }

    @Given("user set GET invalid endpoint for all categories")
    public void userSetGETInvalidEndpointForAllCategories() {
        get_all_categories.setGETInvalidEndpointForAllCategories();
    }

    @When("user send GET HTTP request with invalid endpoint for all categories")
    public void userSendGETHTTPRequestWithInvalidEndpointForAllCategories() {
        get_all_categories.sendGETHTTPRequestWithInvalidEndpointForAllCategories();
    }

    @Then("user received GET HTTP response code {int} for all categories")
    public void userReceivedGETHTTPResponseCodeForAllCategories(int arg0) {
        get_all_categories.validateValidGETHTTPResponseCode404ForAllCategories();
    }
}
