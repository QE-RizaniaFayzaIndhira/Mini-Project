package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.orders.POST_create_a_new_order;

public class POST_create_a_new_orderSteps {
    @Steps
    POST_create_a_new_order post_create_a_new_order;
    @When("user set POST valid endpoint for create new order")
    public void userSetPOSTValidEndpointForCreateNewOrder() {
        post_create_a_new_order.setPostValidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request for create new order")
    public void userSendPOSTHTTPRequestForCreateNewOrder() {
        post_create_a_new_order.sendPOSTHTTPRequestForCreateNewOrder();
    }

    @Then("user received HTTP response code {int} for create new order")
    public void userReceivedHTTPResponseCodeForCreateNewOrder(int arg0) {
        post_create_a_new_order.validateHTTPResponseCode200ForCreateNewOrder();
    }

    @When("user set POST invalid endpoint for create new order")
    public void userSetPOSTInvalidEndpointForCreateNewOrder() {
        post_create_a_new_order.setPostEndpointWithInvalidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request with invalid endpoint for create new order")
    public void userSendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder() {
        post_create_a_new_order.sendPOSTHTTPRequestWithInvalidEndpointForCreateNewOrder();
    }

    @Then("user received POST HTTP response code {int} for create new order")
    public void userReceivedPOSTHTTPResponseCodeForCreateNewOrder(int arg0) {
        post_create_a_new_order.validateHTTPResponseCode404WithInvalidEndpointForCreateNewOrder();
    }

    @And("user send POST HTTP request for create new order with empty request body")
    public void userSendPOSTHTTPRequestForCreateNewOrderWithEmptyRequestBody() {
        post_create_a_new_order.sendPOSTHTTPRequestWithEmptyRequestBodyForCreateNewOrder();
    }
}
