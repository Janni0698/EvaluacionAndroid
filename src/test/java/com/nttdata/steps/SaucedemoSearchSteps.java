package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductsScreen;
import com.nttdata.screens.WriteLoginScreen;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class SaucedemoSearchSteps {

    LoginScreen loginScreen;
    WriteLoginScreen writeLoginScreen;

    ProductsScreen productsScreen;

    @Step("Búsqueda por texto {0}")
    public void loginWithUserAndPass(String username, String password){
        writeLoginScreen.enterUserAndPasswordInput(username,password);
        loginScreen.clickLogin();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return productsScreen.getResultText();
    }

    @Step("Valida que exista un item")
    public void getResultItem(){
        Assertions.assertTrue(productsScreen.getResultItem().isEnabled(), "Existe al menos un item ");
    }
}
