package io.ikantemirov;

import io.qameta.htmlelements.*;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public class AuthorizationPageTest {

    @Rule
    public RuleChrome ruleChrome = new RuleChrome();

    private WebPageFactory factory = new WebPageFactory();
    private AuthorizationPage page;
    private Account account = ConfigFactory.create(Account.class, System.getProperties());

    @Ignore
    @Test
    public void shouldOpenAuthorizationPage() {
        page = factory.get(ruleChrome.getDriver(), AuthorizationPage.class);
        page.go();
        page.isAt(equalTo("https://vk.com/"));
    }

    @Test
    public void shouldAuthorizeUser(){
        page = factory.get(ruleChrome.getDriver(), AuthorizationPage.class);
        page.go();
        page.indexLoginForm().indexEmail().sendKeys(account.username());
        page.indexLoginForm().indexPass().sendKeys(account.psw());
        page.indexLoginForm().indexLoginButton().waitUntil(displayed()).click();
        page.isAt(equalTo("https://vk.com/feed"));
    }


}
