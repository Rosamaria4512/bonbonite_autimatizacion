package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.Credentials;
import com.co.bonbonite.models.Facturation;
import com.co.bonbonite.questions.VerifyBag;
import com.co.bonbonite.questions.VerifyBuy;
import com.co.bonbonite.tasks.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import java.util.List;

public class BagStepsDefinitions {

    @When("^The user select a product in the Wallets module$")
    public void TheUserSelectAProductInTheWalletsModule() {
        OnStage.theActorInTheSpotlight().wasAbleTo(BagsBuy.bagsBuy());
    }

    @Then("^the user will buy a Bag$")
    public void theUserWillBuyABag() throws InterruptedException {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBuy.verifyBuy(),Matchers.is("PRODUCTO")));
        Thread.sleep(3000);
    }
    //---------------------------------------------------------------------------------------------------------------------------------------
    @When("^the user login and selects a product in the Wallets module, and selects the add to wish list$")
    public void theUserSelectsLoginAndSelectsAProductInTheWalletsModuleAndSelectsTheAddToWishList(List<Credentials>credentialsList) {
     Credentials credentials;
      credentials=credentialsList.get(0);
     OnStage.theActorInTheSpotlight().attemptsTo(ShoesTasks.shoesTasks(credentials));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        OnStage.theActorInTheSpotlight().wasAbleTo(BagAgregateTask.bagAgregateTask());
    }

    @Then("^the will veryfy that the product,that is in the my account module-wish list$")
    public void theWillVeryfyThatTheProductThatIsInTheMyAccountModuleWishList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBag.verifyBag(),Matchers.is("Añadir Al Carrito")));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //--------------------------------------------------------------------------------------------------------------------------------------------------
    @When("^The user select a product in the Wallets module carrito and complete the forms for facturation$")
    public void theUserSelectAProductInTheWalletsModuleCarritoAndCompleteTheFormsForFacturation(List<Facturation>facturationList) {
        Facturation facturation;
        facturation=facturationList.get(0);
        OnStage.theActorInTheSpotlight().wasAbleTo(FacturationBag.facturationBag(facturation));
    }

    @Then("^the user would have bought a bag$")
    public void theUserWouldHaveBoughtABag() {

    }
}
