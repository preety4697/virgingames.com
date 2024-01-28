package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import com.virgingames.pages.OnlineSlotsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopmenuSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
        new HomePage().getCurrentUrl();
    }

    @Then("I should navigate to  the {string} page")
    public void iShouldNavigateToThePage(String text) {
        Assert.assertEquals(new OnlineSlotsPage().getOnlineSlotsText(), text);
    }

    @And("I click on cookies")
    public void iClickOnCookies() {
        new HomePage().clickOnAcceptCookiesButton();
    }

    @When("I click on {string} link")
    public void iClickOnLink(String tab) {
        new HomePage().clickOnMenuTab(tab);

    }
}
