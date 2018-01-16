package io.ikantemirov;

import io.qameta.htmlelements.WebPageFactory;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;

public class UserAuthorization{

    private WebPageFactory factory = new WebPageFactory();
    private AuthorizationPage page;
    private Account account = ConfigFactory.create(Account.class, System.getProperties());

    public UserAuthorization(WebDriver driver){
        page = factory.get(driver, AuthorizationPage.class);
        page.go();
        page.indexLoginForm().indexEmail().sendKeys(account.username());
        page.indexLoginForm().indexPass().sendKeys(account.psw());
        page.indexLoginForm().indexLoginButton().waitUntil(displayed()).click();
    }

    public AuthorizationPage getPage() {
        return page;
    }
}
