package com.co.bonbonite.stepsdefinitions;


import com.co.bonbonite.models.BetsDataModuls;
import com.co.bonbonite.tasks.BeltsTask;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class BeltsStepDefinition {
    @When("^he user makes a purchase$")
    public void heUserMakesAPurchase(List<BetsDataModuls> betsDataModulsList) {
        BetsDataModuls betsDataModuls;
        betsDataModuls=betsDataModulsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(BeltsTask.inthePage(betsDataModuls));

    }


    @Then("^he user makes a purchase succesfully$")
    public void heUserMakesAPurchaseSuccesfully() {

    }
}
