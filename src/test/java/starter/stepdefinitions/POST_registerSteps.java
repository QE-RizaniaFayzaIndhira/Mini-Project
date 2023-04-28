package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.authentication.POST_register;

public class POST_registerSteps {
    @Steps
    POST_register post_register;
    @Given("user set POST valid endpoint for register")
    public void userSetPOSTValidEndpointForRegister() {
        post_register.setPostValidEndpointForRegister();
    }

    @When("user send POST HTTP request with valid endpoint for register")
    public void userSendPOSTHTTPRequestWithValidEndpointForRegister() {
        post_register.sendPOSTHTTPRequestWithValidEndpointForRegister();
    }

    @Then("user received POST HTTP response code {int} for register")
    public void userReceivedPOSTHTTPResponseCodeForRegister(int arg0) {
        post_register.validateHTTPResponseCode200ForRegister();
    }

    @Given("user set POST invalid endpoint for register")
    public void userSetPOSTInvalidEndpointForRegister() {
        post_register.setPostInvalidEndpointForRegister();
    }

    @When("user send POST HTTP request with invalid endpoint for register")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForRegister() {
        post_register.sendPOSTHTTPRequestWithInvalidEndpointForRegister();
    }

    @Then("user received POST HTTP responses code {int} for register")
    public void userReceivedPOSTHTTPResponsesCodeForRegister(int arg0) {
        post_register.validateHTTPResponseCode404WithInvalidEndpointForRegister();
    }
}
