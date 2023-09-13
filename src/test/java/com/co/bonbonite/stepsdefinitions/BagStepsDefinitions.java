package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.questions.VerifyBag;
import com.co.bonbonite.questions.VerifyBuy;
import com.co.bonbonite.tasks.BagAgregateTask;
import com.co.bonbonite.tasks.BagsBuy;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class BagStepsDefinitions {

    @When("^The user select a product in the Wallets module$")
    public void TheUserSelectAProductInTheWalletsModule() {
        OnStage.theActorInTheSpotlight().wasAbleTo(BagsBuy.bagsBuy());
    }

    @Then("^the user will buy a Bag$")
    public void theUserWillBuyABag() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuy.verifyBuy(),Matchers.is("PRODUCTO")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("^the user selects a product in the Wallets module, and selects the add to wish list$")
    public void theUserSelectsAProductInTheWalletsModuleAndSelectsTheAddToWishList() {
      OnStage.theActorInTheSpotlight().wasAbleTo(BagAgregateTask.bagAgregateTask());
    }

    @Then("^the will veryfy that the product,that is in the my account module-wish list$")
    public void theWillVeryfyThatTheProductThatIsInTheMyAccountModuleWishList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBag.verifyBag(),Matchers.is("Añadir al carrito")));
    }
}
