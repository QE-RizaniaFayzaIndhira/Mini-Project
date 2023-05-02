package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.Login;

public class LoginSteps {
    @Steps
    Login login;
    @Given("user set authentication endpoint")
    public void userSetAuthenticationEndpoint() {
        login.setAuthenticationEndpoint();
    }

    @And("user send authentication endpoint")
    public void userSendAuthenticationEndpoint() {
        login.sendAuthenticationEndpoint();
    }
}
