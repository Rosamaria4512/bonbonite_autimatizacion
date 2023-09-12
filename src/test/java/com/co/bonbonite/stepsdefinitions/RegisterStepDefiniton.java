package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.RegisterDataModels;
import com.co.bonbonite.tasks.RegisterTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class RegisterStepDefiniton {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Rosa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }


    @Given("^he user enter the website$")
    public void heUserEnterTheWebsite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }


    @Then("^he user fills out data to be able to register on the page$")
    public void heUserFillsOutDataToBeAbleToRegisterOnThePage(List<RegisterDataModels>registerDataModelsList) {
        RegisterDataModels registerDataModels;
        registerDataModels=registerDataModelsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.inthePage(registerDataModels));

    }

    @When("^he user fill succesfully$")
    public void heUserFillSuccesfully() {

    }

}
