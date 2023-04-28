package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.GET_product_ratings;

public class GET_product_ratingsSteps {
    @Steps
    GET_product_ratings get_product_ratings;

    @Given("user set GET valid endpoint to get product ratings")
    public void userSetGETValidEndpointToGetProductRatings() {
        get_product_ratings.setGETValidEndpointToGetProductRatings();
    }

    @When("user send GET HTTP request to get product ratings with valid endpoint")
    public void userSendGETHTTPRequestToGetProductRatingsWithValidEndpoint() {
        get_product_ratings.sendGETHTTPRequestToGetProductRatingsWithValidEndpoint();
    }

    @Then("user received valid GET HTTP response code {int} to get product ratings")
    public void userReceivedValidGETHTTPResponseCodeToGetProductRatings(int arg0) {
        get_product_ratings.validateGETHTTPResponseCode200ToGetProductRatings();
    }

    @Given("user set GET invalid endpoint to get product ratings")
    public void userSetGETInvalidEndpointToGetProductRatings() {
        get_product_ratings.setGETInvalidEndpointToGetProductRatings();
    }

    @When("user send GET HTTP request to get product ratings with invalid endpoint")
    public void userSendGETHTTPRequestToGetProductRatingsWithInvalidEndpoint() {
        get_product_ratings.sendGETHTTPRequestToGetProductRatingsWithInvalidQueryEndpoint();
    }

    @Then("user received GET HTTP response code {int} to get product ratings")
    public void userReceivedGETHTTPResponseCodeToGetProductRatings(int arg0) {
        get_product_ratings.validateValidGETHTTPResponseCode404ToGetProductRatings();
    }

    @And("user received valid data for product ratings")
    public void userReceivedValidDataForProductRatings() {
        get_product_ratings.validateValidDataForProductRatings();
    }
}
