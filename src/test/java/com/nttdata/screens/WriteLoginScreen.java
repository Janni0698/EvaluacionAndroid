package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WriteLoginScreen extends PageObject {

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement usernameInputText;

    @AndroidFindBy(xpath="//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement passwordInputText;


    public void enterUserAndPasswordInput(String username, String password){
        usernameInputText.sendKeys(username);
        passwordInputText.sendKeys(password);
    }


}
