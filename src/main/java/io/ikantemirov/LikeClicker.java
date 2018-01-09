package io.ikantemirov;

import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.WebDriver;

import static java.lang.Integer.parseInt;

public class LikeClicker {

    private WebPageFactory factory;
    private UserPage page;
    private UserAuthorization userAuthorization;
    private int likeCounter;


    public LikeClicker(WebDriver driver) {
        userAuthorization = new UserAuthorization(driver);
        factory = new WebPageFactory();
        page = factory.get(driver, UserPage.class);
        page.go();
        likeCounter = parseInt(page.postContent().postLikeCount().getText());
        page.postContent().postLikeCount().click();
    }

    public int getLikeCounter() {
        return likeCounter;
    }
}
