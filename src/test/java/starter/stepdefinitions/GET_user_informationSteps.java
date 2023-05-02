package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.GET_user_information;

public class GET_user_informationSteps {
    @Steps
    GET_user_information get_user_information;
    @When("user set GET valid endpoint for user information")
    public void userSetGETValidEndpointForUserInformation() {
        get_user_information.setGETValidEndpointForUserInformation();
    }

    @And("user send GET HTTP request with valid endpoint for user information")
    public void userSendGETHTTPRequestWithValidEndpointForUserInformation() {
        get_user_information.sendGETHTTPRequestWithValidEndpointForUserInformation();
    }

    @Then("user received valid GET HTTP response code {int} for user information")
    public void userReceivedValidGETHTTPResponseCodeForUserInformation(int arg0) {
        get_user_information.validateGETHTTPResponseCode200ForUserInformation();
    }

    @When("user set GET invalid endpoint for user information")
    public void userSetGETInvalidEndpointForUserInformation() {
        get_user_information.setGETInvalidEndpointForUserInformation();
    }

    @And("user send GET HTTP request with invalid endpoint for user information")
    public void userSendGETHTTPRequestWithInvalidEndpointForUserInformation() {
        get_user_information.sendGETHTTPRequestWithInvalidEndpointForUserInformation();
    }

    @Then("user received GET HTTP response code {int} for user information")
    public void userReceivedGETHTTPResponseCodeForUserInformation(int arg0) {
        get_user_information.validateValidGETHTTPResponseCode404ForUserInformation();
    }

    @And("user received valid data for user information")
    public void userReceivedValidDataForUserInformation() {
        get_user_information.validateValidDataForUserInformation();
    }
}
