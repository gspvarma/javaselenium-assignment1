package com.stepdefinitions;

import com.page.objects.AxaInsuranceQuotePage;
import com.page.objects.LoginPage;
import com.page.objects.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import com.utilities.Utility;
import io.cucumber.java.en.Given;

public class StepDefinitions extends Utility {

    public StepDefinitions(WebDriver driverInstance) {
        super(driverInstance);
    }
    public StepDefinitions() {
    }

    @Given("I launch the app {string}")
    public void i_launch_the_app(String app) throws Exception {
        try {
            AxaInsuranceQuotePage.launchApp(app);
        } catch (Exception e) {
            throw e;
        }
    }

    @When("I submit the quote to check various travel plans")
    public void when_I_submit_the_quote_to_check_various_travel_plans() {
        try {
            AxaInsuranceQuotePage.submitQuoteGenerationForm();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I should find various insurance plans as {string} {string} {string}")
    public void I_should_various_plans_loaded_with_details(String planA, String planB, String PlanC) {
        AxaInsuranceQuotePage.verifyQuotePlans(planA, planB, PlanC);
    }

    @When("I search for a given {string}")
    public void when_i_search_for_given_keyword(String searchKey) {
        try {
            SearchPage.searchResults(searchKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I should see the default {string}")
    public void i_should_see_the_default_page(String pageTitle) {
        SearchPage.verifyResultsPage(pageTitle);
    }

    @Then("I should see the search results page with {string}")
    public void i_should_see_search_results_page_loaded(String pageTitle) {
        SearchPage.verifyResultsPage(pageTitle);
    }

    @Given("I launch the register form for new user")
    public void i_launch_the_register_form_for_new_user() {
        LoginPage.launchRegisterForm();
    }
    @When("I fill all the user details")
    public void i_fill_all_the_user_details() {
        LoginPage.fillRegisterDetails();
    }
    @When("I complete the registration")
    public void i_complete_the_registration() {
        LoginPage.completeRegistration();
    }
    @Then("I should be able to login into LM insurance dashboard")
    public void i_should_be_able_to_login_into_lm_insurance_dashboard() {
       LoginPage.loginAppAsNewUser();
    }
  

}
