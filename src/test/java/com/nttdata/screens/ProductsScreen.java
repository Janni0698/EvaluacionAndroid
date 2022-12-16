package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductsScreen extends PageObject {

    @AndroidFindBy(className = "android.widget.TextView")
    private WebElement productsText;

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]")
    private WebElement productsItem;

    public String getResultText(){
        return productsText.getText();
    }

    public WebElement getResultItem(){
        return productsItem;
    }
}
