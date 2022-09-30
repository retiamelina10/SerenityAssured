package Starter.Stepdefinitions.Project;

import Starter.Project.CreateAccountUserFeature;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CreateAccountUserFeatureSteps {
    @Steps
    CreateAccountUserFeature createAccountUserFeature;
    @Given("I set url")
    public void iSetUrl() {
        createAccountUserFeature.setUrl();
    }

    @And("I set my username and password")
    public void iSetMyUsernameAndPassword() {
        createAccountUserFeature.setUserNameAndPassword();
    }

    @When("I request with username and password")
    public void iRequestWithUsernameAndPassword() {
        createAccountUserFeature.requestWithUsernameAndPassword();
    }

    @Then("I will get status code 200")
    public void iWillGetStatusCode200() {
        createAccountUserFeature.getStatusCode200();
    }

    @And("I can verify the detail response")
    public void iCanVerifyTheDetailResponse() {
        createAccountUserFeature.verifyDetailResponse();
    }
}
