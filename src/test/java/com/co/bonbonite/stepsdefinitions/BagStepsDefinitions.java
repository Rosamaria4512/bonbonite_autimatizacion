package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.questions.VerifyBuy;
import com.co.bonbonite.tasks.BagsBuy;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BagStepsDefinitions {
    @When("^the user select the module bolsos-bomboneras and select a product$")
    public void theUserSelectTheModuleBolsosBombonerasAndSelectAProduct() {
        OnStage.theActorInTheSpotlight().wasAbleTo(BagsBuy.bagsBuy());
    }

    @Then("^the user will buy a Bag$")
    public void theUserWillBuyABag() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuy.verifyBuy(), Matchers.is("PRODUCTO")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
