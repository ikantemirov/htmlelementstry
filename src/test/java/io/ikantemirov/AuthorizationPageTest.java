package io.ikantemirov;

import io.qameta.htmlelements.*;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class AuthorizationPageTest {

    @Rule
    public RuleChrome ruleChrome = new RuleChrome();

    private WebPageFactory factory = new WebPageFactory();
    private AuthorizationPage page;

    @Test
    public void shouldOpenAuthorizationPage() {
        page = factory.get(ruleChrome.getDriver(), AuthorizationPage.class);
        page.go();
        page.isAt(equalTo("https://vk.com/"));
    }

    @Test
    public void shouldAuthorizeUser(){
        UserAuthorization userAuthorization = new UserAuthorization(ruleChrome.getDriver());
        page = userAuthorization.getPage();
        page.isAt(equalTo("https://vk.com/feed"));
    }


}
