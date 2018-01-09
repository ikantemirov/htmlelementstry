package io.ikantemirov;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.extension.page.BaseUrl;

@BaseUrl("https://vk.com/")
public interface AuthorizationPage extends WebPage{

    @FindBy("//form[@id='index_login_form']")
    IndexLoginForm indexLoginForm();

}