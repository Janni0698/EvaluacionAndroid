package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SaucedemoSearchSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SaucedemoSearchStepsDefs {

    @Steps
    SaucedemoSearchSteps saucedemoSearchSteps;

    @When("inicio sesión con las credenciales usuario: {string} y contraseña: {string}")
    public void inicio_sesión_con_las_credenciales_usuario_y_contraseña(String username, String password) {
        saucedemoSearchSteps.loginWithUserAndPass(username , password);

    }
    @Then("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String expectedTitle) {
        saucedemoSearchSteps.getResultText();
    }

    @And("también valido que al menos exista un item")
    public void también_valido_que_al_menos_exista_un_item() {
        saucedemoSearchSteps.getResultItem();
    }

}

