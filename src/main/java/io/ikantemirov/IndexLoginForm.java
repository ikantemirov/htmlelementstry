package io.ikantemirov;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.ExtendedWebElement;

public interface IndexLoginForm extends ExtendedWebElement<IndexLoginForm> {

    @FindBy(".//input[@id='index_email']")
    ExtendedWebElement indexEmail();

    @FindBy(".//input[@id='index_pass']")
    ExtendedWebElement indexPass();

    @FindBy("//button[@id='index_login_button']")
    ExtendedWebElement indexLoginButton();

}
