package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.hello.GET_index;

public class GET_indexSteps {
    @Steps
    GET_index get_index;
    @Given("user set GET valid endpoint for index")
    public void userSetGETValidEndpointForIndex() {
        get_index.setGETValidEndpointForIndex();
    }

    @When("user send GET HTTP request with valid endpoint for index")
    public void userSendGETHTTPRequestWithValidEndpointForIndex() {
        get_index.sendGETHTTPRequestWithValidEndpointForIndex();
    }

    @Then("user received valid GET HTTP response code {int} for index")
    public void userReceivedValidGETHTTPResponseCodeForIndex(int arg0) {
        get_index.validateGETHTTPResponseCode200ForIndex();
    }

    @Given("user set GET invalid endpoint for index")
    public void userSetGETInvalidEndpointForIndex() {
        get_index.setGETInvalidEndpointForIndex();
    }

    @When("user send GET HTTP request with invalid endpoint for index")
    public void userSendGETHTTPRequestWithInvalidEndpointForIndex() {
        get_index.sendGETHTTPRequestWithInvalidQueryEndpointForIndex();
    }

    @Then("user received GET HTTP response code {int} for index")
    public void userReceivedGETHTTPResponseCodeForIndex(int arg0) {
        get_index.validateValidGETHTTPResponseCode404ForIndex();
    }

    @And("user received valid data for index")
    public void userReceivedValidDataForIndex() {
        get_index.validateValidDataForIndex();
    }
}
