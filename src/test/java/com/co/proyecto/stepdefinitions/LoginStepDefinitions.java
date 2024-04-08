package com.co.proyecto.stepdefinitions;


import com.co.proyecto.models.LoginData;
import com.co.proyecto.steps.LoginSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class LoginStepDefinitions {

    @Steps
    LoginSteps steps;

    @Given("That the user was on the website")
    public void thatTheUserWasOnTheWebsite() {
        steps.abrirNavegador();
    }
    @When("attempts login with the following")
    public void attemptsLoginWithTheFollowing(DataTable table) {
        steps.enterUserName(LoginData.setData(table).get(0));
        steps.enterPass(LoginData.setData(table).get(0));
        steps.login();
    }
    @Then("^will see the (.*) on screen$")
    public void willSeeTheTextOnScreen(String title) {
        steps.validarUsuario(title);
    }

}
