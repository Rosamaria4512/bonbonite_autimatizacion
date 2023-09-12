package com.co.bonbonite.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

public class ShoesStepsDefinitions {
    @Given("^he user enter the website with his credentials$")
    public void heUserEnterTheWebsiteWithHisCredentials() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^the user select the nmodule bolsos-bomboneras$")
    public void theUserSelectTheNmoduleBolsosBomboneras() {

    }

    @Then("^the user will buy a product$")
    public void theUserWillBuyAProduct() {

    }
}
