package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.Credentials;
import com.co.bonbonite.questions.VerifyBuy;
import com.co.bonbonite.tasks.ShoesBuyTasks;
import com.co.bonbonite.tasks.ShoesTasks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class ShoesStepsDefinitions {
    @Given("^he user enter the website with his credentials$")
    public void heUserEnterTheWebsiteWithHisCredentials(List<Credentials>credentials) {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));
        Credentials credentials1;
        credentials1=credentials.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(ShoesTasks.shoesTasks(credentials1));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @When("^the user select the nmodule bolsos-bomboneras$")
    public void theUserSelectTheNmoduleBolsosBomboneras() {
    OnStage.theActorInTheSpotlight().wasAbleTo(ShoesBuyTasks.shoesBuyTasks());
    }

    @Then("^the user will buy a product$")
    public void theUserWillBuyAProduct() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuy.verifyBuy(), Matchers.is("PRODUCTO")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
