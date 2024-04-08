package com.co.proyecto.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class LoginPageObject extends PageObject {

      By TXT_USER = By.xpath("//input[@name='username']");
      By TXT_PASS = By.xpath("//input[@name='password']");
      By BTN_LOGIN = By.xpath("//button[@type='submit']");
      By TXT_VALIDACION = By.xpath("//h6");

    public By getTXT_USER() {
        return TXT_USER;
    }

    public By getTXT_PASS() {
        return TXT_PASS;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

    public By getTXT_VALIDACION() {
        return TXT_VALIDACION;
    }
}
