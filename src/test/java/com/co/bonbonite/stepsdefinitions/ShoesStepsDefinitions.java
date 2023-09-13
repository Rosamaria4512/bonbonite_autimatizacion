package com.co.bonbonite.stepsdefinitions;

import com.co.bonbonite.models.Credentials;
import com.co.bonbonite.questions.VerifyBag;
import com.co.bonbonite.questions.VerifyBuy;
import com.co.bonbonite.tasks.ShoesAgregateTasks;
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
    public void heUserEnterTheWebsiteWithHisCredentials() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bon-bonite.com/"));

    }

    @When("^the user select the module shoes_tenis$")
    public void theUserSelectTheModuleShoes_Tenis() {
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
    //----------------------------------------------------------------------------------------------------------------------------------
    @When("^the user select the module shoes-tenis and selecte option list_wish$")
    public void theUserSelectTheModuleShoesTenisAndSelecteOptionList_wish() {
    OnStage.theActorInTheSpotlight().wasAbleTo(ShoesAgregateTasks.shoesAgregateTasks());
    }

    @Then("^the will veryfy that the shoes,that is in the my account module-wish list$")
    public void theWillVeryfyThatTheShoesThatIsInTheMyAccountModuleWishList() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyBag.verifyBag(),Matchers.is("Añadir al carrito")));

    }
}
