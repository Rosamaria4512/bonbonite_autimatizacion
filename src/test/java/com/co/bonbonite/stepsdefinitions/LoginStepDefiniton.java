package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.LoginDataModels;
import com.co.bonbonite.questions.VerifyLogin;
import com.co.bonbonite.tasks.LoginTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginStepDefiniton {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Rosa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Then("^he user enter credentials in the website$")
    public void heUserEnterCredentialsInTheWebsite(List<LoginDataModels>loginDataModelsList) {
        LoginDataModels loginDataModels;
        loginDataModels=loginDataModelsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.inthePage(loginDataModels));

    }


    @When("^he user successfully logged$")
    public void heUserSuccessfullyLogged() {

    }


}
