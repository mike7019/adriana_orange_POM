package com.co.proyecto.steps;

import com.co.proyecto.models.EmployeeData;
import com.co.proyecto.models.LoginData;
import com.co.proyecto.pageobjects.LoginPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginSteps {

    LoginPageObject loginPageObject = new LoginPageObject();

    @Step
    public void abrirNavegador(){
        loginPageObject.open();
    }

    @Step
    public void enterUserName(LoginData loginData){
        loginPageObject.getDriver().findElement(loginPageObject.getTXT_USER()).sendKeys(loginData.getUser());
    }

    @Step
    public void enterPass(LoginData loginData){
        loginPageObject.getDriver().findElement(loginPageObject.getTXT_PASS()).sendKeys(loginData.getPass());

    }

    @Step
    public void login(){
        loginPageObject.getDriver().findElement(loginPageObject.getBTN_LOGIN()).click();
    }

    @Step
    public void validarUsuario(String text) {
        String validacion = loginPageObject.getDriver().findElement(loginPageObject.getTXT_VALIDACION()).getText();
        System.out.println(validacion);
        assertThat(validacion.contains(text), Matchers.is(true));
    }
}
