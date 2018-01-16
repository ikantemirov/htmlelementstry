package io.ikantemirov;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.ExtendedWebElement;
import io.qameta.htmlelements.element.HtmlElement;

public interface IndexLoginForm extends HtmlElement {

    @FindBy(".//input[@id='index_email']")
    ExtendedWebElement indexEmail();

    @FindBy(".//input[@id='index_pass']")
    ExtendedWebElement indexPass();

    @FindBy(".//button[@id='index_login_button']")
    HtmlElement indexLoginButton();
}
