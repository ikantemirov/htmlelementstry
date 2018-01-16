package io.ikantemirov;

import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.WebDriver;

public class MenuOpener {

    private WebPageFactory factory;
    private UserPage page;
    private UserAuthorization userAuthorization;

    public MenuOpener(WebDriver driver) {
        userAuthorization = new UserAuthorization(driver);
        factory = new WebPageFactory();
        page = factory.get(driver, UserPage.class);
        page.go();
        page.menuSettings().click();
    }

    public UserPage getPage() {
        return page;
    }
}
