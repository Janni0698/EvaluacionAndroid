package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;


public class LoginScreen extends PageObject {

    @AndroidFindBy( xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;

    public void clickLogin(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        btnLogin.click();
    }
}
