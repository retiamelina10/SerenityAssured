package Starter.Stepdefinitions.Project;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PostLoginWithTokenSteps {
    @Steps
    PostLoginWithToken postLoginWithToken;
    @Given("I set url and valid token")
    public void iSetUrlAndValidToken() {
        postLoginWithToken.setUrlAndValidToken();
    }

    @When("I request with valid username and password")
    public void iRequestWithValidUsernameAndPassword() {
        postLoginWithToken.requestWithValidUsernameAndPassword();
    }

    @Then("I get status code 200")
    public void iGetStatusCode200() {
        postLoginWithToken.statusCode200();
    }

    @Given("I set url and null body")
    public void iSetUrlAndNullBody() {
        postLoginWithToken.setUrlAndNullBody();
    }

    @When("I request with null username and null password")
    public void iRequestWithNullUsernameAndNullPassword() {
        postLoginWithToken.requestWithNullBody();
    }

    @Given("I set url and valid password")
    public void iSetUrlAndValidPassword() {
        postLoginWithToken.setUrlAndValidPassword();
    }

    @When("I request with null username")
    public void iRequestWithNullUsername() {
        postLoginWithToken.requestWithNullUserName();
    }

    @And("status code 400")
    public void statusCode400() {
        postLoginWithToken.statusCode400();
    }

    @Given("I set url and valid username")
    public void iSetUrlAndValidUsername() {
        postLoginWithToken.setUrlAndValidUserName();
    }

    @When("I request with null password")
    public void iRequestWithNullPassword() {
        postLoginWithToken.requestWithNullPassword();
    }

    @Given("I set url and invalid body")
    public void iSetUrlAndInvalidBody() {
        postLoginWithToken.setUrlAndInvalidBody();
    }

    @When("I request with invalid body")
    public void iRequestWithInvalidBody() {
        postLoginWithToken.requestWithInvalidBody();
    }

    @Given("I set url and integer body")
    public void iSetUrlAndIntegerBody() {
        postLoginWithToken.setUrlAndIntegerBody();
    }

    @When("I request with integer body")
    public void iRequestWithIntegerBody() {
        postLoginWithToken.requestWithIntegerBody();
    }

    @And("I set integer username and valid password")
    public void iSetIntegerUsernameAndValidPassword() {
        postLoginWithToken.setIntegerUsername();
    }

    @When("I request with integer username and valid password")
    public void iRequestWithIntegerUsernameAndValidPassword() {
        postLoginWithToken.requestWithIntegerUserName();
    }

    @And("I set valid username and integer password")
    public void iSetValidUsernameAndIntegerPassword() {
        postLoginWithToken.setIntegerPassword();
    }

    @When("I request with valid username and integer password")
    public void iRequestWithValidUsernameAndIntegerPassword() {
        postLoginWithToken.requestWithIntegerPassword();
    }

    @Then("I get status code 400")
    public void iGetStatusCode400() {
        postLoginWithToken.statusCode400();
    }

    @Given("I set url and invalid token")
    public void iSetUrlAndInvalidToken() {
        postLoginWithToken.setUrlAndInvalidToken();
    }

    @When("I request with invalid token")
    public void iRequestWithInvalidToken() {
        postLoginWithToken.requestWithInvalidToken();
    }

    @Then("I get status code 401")
    public void iGetStatusCode401() {
        postLoginWithToken.statusCode401();
    }
}
