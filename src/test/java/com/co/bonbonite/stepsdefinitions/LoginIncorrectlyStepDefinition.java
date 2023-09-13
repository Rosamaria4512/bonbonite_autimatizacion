package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.LoginIncorrectlyModels;
import com.co.bonbonite.questions.VerifyLoginIconrrectly;
import com.co.bonbonite.tasks.LoginIncorrectlyTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginIncorrectlyStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Rosa");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^he user enter the website Bonbonite$")
    public void heUserEnterTheWebsiteBonbonite() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^he entre the wrong credential$")
    public void heEntreTheWrongCredential(List<LoginIncorrectlyModels>loginIncorrectlyModelsList) {
        LoginIncorrectlyModels loginIncorrectlyModels;
        loginIncorrectlyModels=loginIncorrectlyModelsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginIncorrectlyTask.validation(loginIncorrectlyModels));

    }


    @Then("^he will log in incorrectly$")
    public void heWillLogInIncorrectly() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyLoginIconrrectly.validation()
        , Matchers.equalTo(Boolean.TRUE)));

    }
}
